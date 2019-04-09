package com.jcloud.framework.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.jcloud.framework.movie.persist.mapper"})
public class SimpleConsumerMovieApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleConsumerMovieApplication.class, args);
    }

}
