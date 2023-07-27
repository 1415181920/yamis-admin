package io.xiaoyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan(basePackages = {"io.xiaoyu.**.mapper"})
public class Application {
    public static void main(String[] args) {
        System.out.println("Hello 1111111111111");
        SpringApplication.run(Application.class, args);

    }

    @GetMapping("/")
    public String index(){
        return "welcome to cocoyam";
    }

}

