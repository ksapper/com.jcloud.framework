package com.baosight.paladin.demo.consumer.controller;

import com.baosight.paladin.demo.consumer.api.feign.OrderService;
import com.baosight.paladin.demo.consumer.api.request.OrderAdd;
import com.baosight.paladin.demo.consumer.api.response.OrderAddResponse;
import com.baosight.paladin.demo.consumer.consume.UserServiceRemote;
import com.baosight.paladin.demo.consumer.model.OrderModel;
import com.baosight.paladin.demo.provider.api.response.UserInfo;
import com.baosight.paladin.tool.servicebase.BizIdGenerator;
import com.baosight.paladin.tool.servicebase.ServiceUtils;
import com.baosight.paladin.tool.servicebase.request.UserRequestLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cy
 */
@RestController
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserServiceRemote userServiceRemote;

    @Autowired
    OrderModel orderModel;

    @Autowired
    BizIdGenerator bizIdGenerator;

    /**
     * 新增订单
     *
     * @param orderAdd
     * @param bindingResult
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    @UserRequestLock
    @PostMapping("/addOrder")
    public OrderAddResponse addOrder(@RequestBody OrderAdd orderAdd, BindingResult bindingResult) {
        OrderAddResponse orderAddResponse = new OrderAddResponse();
        if(bindingResult.hasErrors()){
            orderAddResponse.setStatusInfo(0, bindingResult.getFieldError().getDefaultMessage());
            return orderAddResponse;
        }
        String userName = ServiceUtils.getCurrentUsername();
        UserInfo userInfo = userServiceRemote.loadUser(userName);
        if(userInfo.getStatusCode() == 1){
            String orderId = bizIdGenerator.nextId();
            orderModel.addOrder(orderAdd, orderId, userInfo.getPhone(), userName);
            orderAddResponse.setStatusInfo(1, orderId);
            orderAddResponse.setStatusCode(1);
            orderAddResponse.setOrderId(orderId);
        }else{
            orderAddResponse.setStatusInfo(0, userInfo.getMsg());
        }
        return orderAddResponse;
    }
}
