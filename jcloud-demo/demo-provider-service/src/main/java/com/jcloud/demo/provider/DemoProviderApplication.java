package com.jcloud.demo.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: cy
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = {"com.jcloud.demo.provider.persist.mapper"})
public class DemoProviderApplication {

    public static void main(String[] args){
        SpringApplication.run(DemoProviderApplication.class, args);
    }

}
