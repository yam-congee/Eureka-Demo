package com.hzm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Black claw cat
 * @Description @EnableEurekaClient //Eureka注册中心发现
 * @createTime 2019-11-24
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProviderApplication.class, args);
    }

}
