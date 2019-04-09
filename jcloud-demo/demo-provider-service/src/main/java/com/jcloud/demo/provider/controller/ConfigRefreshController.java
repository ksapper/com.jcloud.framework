package com.jcloud.demo.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: mwl
 */
@RestController
@Slf4j
@RefreshScope
public class ConfigRefreshController {

    @Value(value = "${girl.age:}")
    private String girlAge;

    /**
     * girl
     *
     * @return
     */
    @GetMapping("/configdate")
    public String loadUser() {
        return girlAge;
    }
}
