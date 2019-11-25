package com.hzm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Black claw cat
 * @Description TODO
 * @createTime 2019-11-24
 */

@RestController
public class HelloProviderController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        HashMap<String, Object> map = new HashMap<String, Object>(16);
        map.put("hello", "HelloWorld");
        return map;
    }
}
