package com.baosight.paladin.demo.provider.api.response;

import com.baosight.paladin.tool.apibase.AbstractResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: cy
 */
@Data
@ApiModel
public class UserInfo extends AbstractResponse {

    @ApiModelProperty(value = "用户登录名")
    String userName;

    @ApiModelProperty(value = "用户姓名")
    String displayName;

    @ApiModelProperty(value = "电话")
    String phone;

}
