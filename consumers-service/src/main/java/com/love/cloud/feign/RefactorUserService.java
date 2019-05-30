package com.love.cloud.feign;

import com.love.cloud.fallback.UserServiceFallback;
import com.love.cloud.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by mi on 2019/5/29.
 */
@FeignClient(name = "provider-service", fallback = UserServiceFallback.class)
public interface RefactorUserService extends UserService{
}
