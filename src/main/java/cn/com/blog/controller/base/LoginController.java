package cn.com.blog.controller.base;

import cn.com.blog.common.result.Result;
import cn.com.blog.common.result.ResultApi;
import cn.com.blog.controller.base.dto.UserDto;
import cn.com.blog.service.business.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gejj
 * @version 1.0
 * @create 2024年06月20日 10:25
 */
@RestController
public class LoginController {

    @Autowired
    private ILoginService loginService;

    @PostMapping("/login")
    public Result login(@RequestBody UserDto userDto){
        return loginService.login(userDto);
    }
}
