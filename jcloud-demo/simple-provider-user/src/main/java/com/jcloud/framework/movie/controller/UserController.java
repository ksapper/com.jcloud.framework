package com.jcloud.framework.movie.controller;

import com.jcloud.framework.movie.model.UserModelService;
import com.jcloud.framework.movie.persist.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {

    @Autowired
    UserModelService userModelService;

    @GetMapping("/user/{userName}")
    public User getUserByName(@PathVariable(name = "userName") String name){
        return userModelService.getUserByName(name);
    }
}
