package com.jcloud.framework.user.persist.mapper;

import com.jcloud.framework.user.persist.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: cy
 */
@Mapper
public interface UserMapper {

    /**
     * 查询
     *
     * @param userName
     * @return
     */
    User load(@Param("userName") String userName);

}
