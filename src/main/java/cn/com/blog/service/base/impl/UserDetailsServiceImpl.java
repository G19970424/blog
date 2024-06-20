package cn.com.blog.service.base.impl;

import cn.com.blog.dao.blog.mapper.PermissionMapper;
import cn.com.blog.dao.blog.mapper.UserMapper;
import cn.com.blog.service.base.impl.dto.Permission;
import cn.com.blog.service.base.impl.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 15:44
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PermissionMapper permissionMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(s);
        if(user == null) {
            throw new UsernameNotFoundException("用户名不存在！" + s);
        }
        List<Permission> permissions = permissionMapper.findPermissionsByUserId(user.getId());
        List<Permission> pers = new ArrayList<>();

        for(Permission p : permissions)	{
            if(p.getId() == p.getPid()) { //200/200
                pers.add(p);
            }
        }
        pers.forEach(e ->
        {
            for (Permission p : permissions) {
                if (p.getId() != p.getPid() && p.getPid() == e.getPid()) //210/200
                {
                    e.getNodes().add(p);
                }
            }
        });
        System.out.println("Permissions列表数据：" + pers);
        user.setPermissions(pers);
        return user;
    }
}
