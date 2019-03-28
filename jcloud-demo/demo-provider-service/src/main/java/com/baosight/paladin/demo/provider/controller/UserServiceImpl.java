package com.baosight.paladin.demo.provider.controller;

import com.baosight.paladin.demo.provider.api.feign.UserService;
import com.baosight.paladin.demo.provider.api.response.UserInfo;
import com.baosight.paladin.demo.provider.model.UserModel;
import com.baosight.paladin.demo.provider.persist.po.User;
import com.baosight.paladin.tool.servicebase.ServiceUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cy
 */
@RestController
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserModel userModel;

    /**
     * 查询用户
     *
     * @param userName
     * @return
     */
    @Override
    @GetMapping("/loadUser")
    public UserInfo loadUser(@RequestParam("userName") String userName) {
        log.info(ServiceUtils.getCurrentUsername());
        UserInfo userInfo = new UserInfo();
        if (StringUtils.hasText(userName)) {
            User user = userModel.loadUser(userName);
            if (ObjectUtils.isEmpty(user)) {
                userInfo.setStatusInfo(0, "no such user");
            }else{
                userInfo.setStatusCode(1);
                BeanUtils.copyProperties(user, userInfo);
            }
        }else{
            userInfo.setStatusInfo(0, "empty username");
        }
        return userInfo;
    }
}
