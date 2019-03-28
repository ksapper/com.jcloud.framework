package com.baosight.paladin.demo.consumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: cy
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.baosight.paladin.demo.consumer.consume")
@EnableTransactionManagement
@MapperScan(basePackages = {"com.baosight.paladin.demo.consumer.persist.mapper"})
public class DemoConsumerApplication {

    public static void main(String[] args){
        SpringApplication.run(DemoConsumerApplication.class, args);
    }
}
