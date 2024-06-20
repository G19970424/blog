package cn.com.blog.dao.blog.mapper;

import cn.com.blog.service.base.impl.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 16:12
 */
@Mapper
@Repository
public interface UserMapper {
    User loadUserByUsername(String username);
}
