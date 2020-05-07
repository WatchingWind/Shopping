package com.shop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//暂时不加入模块,"com.shop.security"
@ComponentScan(basePackages = {"com.shop.common","com.shop.mbg","com.shop.web","com.shop.portal"})
public class WebApplication {


    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class,args);
    }
}
