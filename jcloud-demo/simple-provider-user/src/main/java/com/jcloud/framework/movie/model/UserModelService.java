package com.jcloud.framework.movie.model;

import com.jcloud.framework.movie.persist.mapper.UserMapper;
import com.jcloud.framework.movie.persist.po.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserModelService {

    @Autowired
    UserMapper userMapper;

    public User getUserByName(String userName){
        return userMapper.load(userName);
    }
}
