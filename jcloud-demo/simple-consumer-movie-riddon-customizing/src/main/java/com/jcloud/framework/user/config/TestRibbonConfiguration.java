package com.jcloud.framework.user.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "simple-provider-user",configuration = RibbonClientConfiguration.class)
public class TestRibbonConfiguration {

}
