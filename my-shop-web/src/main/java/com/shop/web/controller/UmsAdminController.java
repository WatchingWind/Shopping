package com.shop.web.controller;

import com.shop.common.api.CommonResult;
import com.shop.mbg.model.User;
import com.shop.portal.redis.RedisService;
import com.shop.portal.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class UmsAdminController {
    @Autowired
    UmsMemberService umsAdminService;

    @RequestMapping("/login")
    @ResponseBody    //返回json字符串一定要加 ResponseBody
    public CommonResult login(HttpServletResponse response,
                              @RequestParam("uId") Long uId,
                              @RequestParam("password") String password) {
        User user = new User();
        user.setuId(uId);
        user.setPassword(password.trim());
        String token = umsAdminService.login(response,user);
        System.out.println(token);
        if (token == null || token.isEmpty()) {
            return CommonResult.failed();
        }
        System.out.println("success");
        return CommonResult.success("登录成功");
    }

    @RequestMapping("/register")
    @ResponseBody
    public CommonResult register(HttpServletResponse response,
                               @RequestParam("uId") Long uId,
                               @RequestParam("password") String password,
                               @RequestParam("email") String email){
        User register = new User();
        register.setEmail(email);
        register.setPassword(password);
        register.setuId(uId);

        if (umsAdminService.register(response,register)) {
            return CommonResult.success("注册成功");
        } else {
            return CommonResult.failed("当前手机号已经被注册");
        }
    }
}
