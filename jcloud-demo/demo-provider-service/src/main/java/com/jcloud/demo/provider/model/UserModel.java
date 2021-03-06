package com.jcloud.demo.provider.model;

import com.jcloud.demo.provider.persist.mapper.UserMapper;
import com.jcloud.demo.provider.persist.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: cy
 */
@Component
public class UserModel {

    @Autowired
    UserMapper userMapper;

    public User loadUser(String userName) {
        return userMapper.load(userName);
    }
}
