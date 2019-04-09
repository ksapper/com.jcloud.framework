package com.jcloud.demo.consumer.model;

import com.jcloud.demo.consumer.api.request.OrderAdd;
import com.jcloud.demo.consumer.persist.mapper.OrderInfoMapper;
import com.jcloud.demo.consumer.persist.po.OrderInfo;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: cy
 */
@Component
public class OrderModel {

    @Autowired
    OrderInfoMapper orderInfoMapper;

    public int addOrder(OrderAdd orderAdd, String orderId, String phone, String userName) {
        OrderInfo order = new OrderInfo();
        BeanUtils.copyProperties(orderAdd, order);
        order.setOrderId(orderId);
        order.setUserName(userName);
        order.setPhone(phone);
        order.setCreateTime(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
        order.setOrderStatus("active");
        return orderInfoMapper.insert(order);
    }
}
