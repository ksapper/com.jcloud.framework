package com.jcloud.demo.consumer.api.feign;

import com.jcloud.demo.consumer.api.request.OrderAdd;
import com.jcloud.demo.consumer.api.response.OrderAddResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author: cy
 */
@Api("订单服务")
public interface OrderService {

    /**
     * 新增订单
     * @param orderAdd
     * @param bindingResult
     * @return
     */
    @PostMapping("/addOrder")
    @ApiOperation(value = "新增订单", notes = "状态码1：新增成功,返回订单id,状态码0：新增失败")
    OrderAddResponse addOrder(OrderAdd orderAdd, BindingResult bindingResult);

}
