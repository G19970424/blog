package cn.com.blog.service.business.impl;

import cn.com.blog.common.result.Result;
import cn.com.blog.controller.base.dto.UserDto;
import cn.com.blog.service.business.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 16:55
 */
@Service
public class LoginServiceImpl implements ILoginService {


    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public Result login(UserDto userDto) {
        //通过AuthenticationManager authenticate进行认证
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDto.getUsername(),userDto.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        //认证未通过
        if (Objects.isNull(authenticate)){
            throw new RuntimeException("用户登录失败");
        }

        //认证通过 ，生成jwt


        return null;
    }
}
