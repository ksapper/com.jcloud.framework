package com.baosight.paladin.demo.consumer.consume;

import com.baosight.paladin.demo.provider.api.feign.UserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: cy
 */
@FeignClient(name = "demo-provider-service")
public interface UserServiceRemote extends UserService {
}
