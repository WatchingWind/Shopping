package com.shop.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.shop.mbg.dao","com.shop.mbg.mapper"})
public class MybatisConfig {

}
