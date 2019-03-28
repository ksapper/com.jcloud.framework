package com.baosight.paladin.demo.consumer.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @Author: cy
 */
@Data
@ApiModel
public class OrderAdd {

    @NotEmpty(message = "订单名称不能为空")
    @ApiModelProperty(value = "订单名称", required = true)
    String orderName;

    @NotEmpty(message = "商品代码不能为空")
    @ApiModelProperty(value = "商品代码", required = true)
    String productionCode;

}
