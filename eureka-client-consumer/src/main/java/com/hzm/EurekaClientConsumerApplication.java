package com.hzm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Black claw cat
 * @Description @EnableEurekaClient：Eureka注册中心发现；@EnableFeignClients：扫描所有带@FeignClient注解的类 进行容器Bean管理
 * @createTime 2019-11-24
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

public class EurekaClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerApplication.class, args);
    }

}
