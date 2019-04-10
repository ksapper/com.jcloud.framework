package com.jcloud.framework.user.controller;

import com.jcloud.framework.user.persist.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class MovieController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{userName}")
    public User getUserByName(@PathVariable(name = "userName") String userName){
        return restTemplate.getForObject("http://simple-provider-user/user/"+userName,User.class);
    }

    @GetMapping("/load-instance")
    public void loadUserInstance(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("simple-provider-user");
        log.info(serviceInstance.getInstanceId()+":"+serviceInstance.getHost()+":"+serviceInstance.getPort());
    }

}
