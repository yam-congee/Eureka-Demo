package com.hzm.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author Black claw cat
 * @Description TODO
 * @createTime 2019-11-24
 */
@FeignClient("eureka-client-provider")
public interface HelloProviderClient {

    /**
     * 此处调用方法要和服务提供者
     * HelloProviderController一致
     *
     * @return 返回一个简单结果
     */
    @GetMapping("/hello")
    Map<String, Object> hello();
}
