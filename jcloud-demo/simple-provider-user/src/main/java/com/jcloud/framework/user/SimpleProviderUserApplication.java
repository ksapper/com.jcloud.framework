package com.jcloud.framework.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.jcloud.framework.user.persist.mapper"})
public class SimpleProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProviderUserApplication.class, args);
    }

}
