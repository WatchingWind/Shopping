package com.shop.web.controller;

import com.shop.common.api.CommonResult;
import com.shop.mbg.model.User;
import com.shop.portal.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UmsAdminController {

    @Autowired
    UmsMemberService umsAdminService;

    @RequestMapping("/login")
    public CommonResult login(@RequestParam("") Long uId,
                              @RequestParam("") String password) {
        User user = new User();
        user.setuId(uId);
        user.setPassword(password);

        String token = umsAdminService.login(user);


        return null;

    }

    @RequestMapping("/register")
    public String register(){
//        User register = umsAdminService.register(user);
        return null;
    }
}
