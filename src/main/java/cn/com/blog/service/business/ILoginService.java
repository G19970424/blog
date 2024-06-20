package cn.com.blog.service.business;

import cn.com.blog.common.result.Result;
import cn.com.blog.controller.base.dto.UserDto;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 16:55
 * 登录接口
 */
public interface ILoginService {

    /**
     * 用户登录
     * @param userDto
     * @return
     */
    Result login(UserDto userDto);
}
