package com.jcloud.demo.consumer.persist.po;

import lombok.Data;

/**
 * @Author: cy
 */
@Data
public class OrderInfo {

    String orderId;

    String orderName;

    String productionCode;

    String userName;

    String phone;

    String createTime;

    String orderStatus;

}
