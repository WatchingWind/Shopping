package com.shop.web.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/product")
public class PmsProductDetailController {

    @RequestMapping("/detail")
    @ResponseBody
    public String detail(@RequestParam("productId")Long productId) {

       // JSON.toJSONString()
        return null;
    }
}
