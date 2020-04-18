package com.shop.portal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan({"com.shop.mbg","com.shop.portal"})
public class PortApplication {

  public static void main(String[] args) {
    SpringApplication.run(PortApplication.class,args);
  //  Driver driver;
  }

}
