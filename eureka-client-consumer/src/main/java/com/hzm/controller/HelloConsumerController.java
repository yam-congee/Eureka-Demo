package com.hzm.controller;

import com.hzm.client.HelloProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author Black claw cat
 * @Description TODO
 * @createTime 2019-11-24
 */

@RestController
public class HelloConsumerController {

    @Resource
    private HelloProviderClient helloProviderClient;

    @GetMapping("/consumer")
    public Map<String, Object> hello() {
        return helloProviderClient.hello();
    }
}
