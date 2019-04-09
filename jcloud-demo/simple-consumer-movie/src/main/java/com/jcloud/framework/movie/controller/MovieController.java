package com.jcloud.framework.movie.controller;

import com.jcloud.framework.movie.persist.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class MovieController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/user/{userName}")
    public User getUserByName(@PathVariable(name = "userName") String userName){
        return restTemplate.getForObject("http://localhost:8082/user/"+userName,User.class);
    }
}
