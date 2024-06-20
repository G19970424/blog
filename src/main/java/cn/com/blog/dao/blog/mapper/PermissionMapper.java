package cn.com.blog.dao.blog.mapper;

import cn.com.blog.service.base.impl.dto.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 16:16
 */
@Mapper
@Repository
public interface PermissionMapper {
    List<Permission> findPermissionsByUserId(int id);
}
