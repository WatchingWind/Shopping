package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class Optional {

    @RequestMapping("/a")
    public String home(){
        return "Hello World";
    }


    public static void main(String[] args) {
        SpringApplication.run(Optional.class,args);
    }

}
