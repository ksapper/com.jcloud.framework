package com.jcloud.demo.consumer.api.response;

import com.baosight.paladin.tool.apibase.AbstractResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: cy
 */
@ApiModel
@Data
public class OrderAddResponse extends AbstractResponse {

    @ApiModelProperty(value = "订单id")
    String orderId;

}
