package com.jcloud.demo.consumer.persist.mapper;

import com.jcloud.demo.consumer.persist.po.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: cy
 */
@Mapper
public interface OrderInfoMapper {

    /**
     * 新增
     *
     * @param orderInfo
     * @return
     */
    int insert(OrderInfo orderInfo);

}
