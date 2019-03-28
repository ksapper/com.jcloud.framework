package com.jcloud.demo.consumer.consume;

import com.jcloud.demo.provider.api.feign.UserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: cy
 */
@FeignClient(name = "demo-provider-service")
public interface UserServiceRemote extends UserService {
}
