package com.shop.picture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest {

    @RequestMapping("/")
    public String requestTest(){
        return "nivea/index";
    }
    @RequestMapping("/kk")
    @ResponseBody
    public String getkk() {
        return "KK";
    }
}
