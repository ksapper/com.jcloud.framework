package com.jcloud.demo.provider.api.feign;

import com.jcloud.demo.provider.api.response.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: cy
 */
@Api(tags = {"用户服务"})
public interface UserService {

    /**
     * 查询用户
     *
     * @param userName
     * @return
     */
    @ApiOperation(value = "查询用户", notes = "状态码1:查询到用户，状态码0：未查询到用户")
    @GetMapping("/loadUser")
    UserInfo loadUser(@RequestParam("userName") String userName);

}
