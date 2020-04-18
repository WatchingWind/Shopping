package com.shop.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商城默认首页Controller
 * Create by Young 2020/3/30
 */
@Controller
public class GlobalIndexController {
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
