package com.han.springbootmybatisplus2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.han.springbootmybatisplus2.mapper")
public class SpringbootMybatisplus2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisplus2Application.class, args);
    }

}
