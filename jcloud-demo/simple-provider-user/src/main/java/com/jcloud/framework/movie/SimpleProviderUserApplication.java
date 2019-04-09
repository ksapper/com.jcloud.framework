package com.jcloud.framework.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.jcloud.framework.movie.persist.mapper"})
public class SimpleProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProviderUserApplication.class, args);
    }

}
