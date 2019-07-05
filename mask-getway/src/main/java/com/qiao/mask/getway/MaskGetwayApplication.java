package com.qiao.mask.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author huangqf
 * @date: 2019/6/29 14:28
 * @description:
 * @email mr.huangqf@gmail.com
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MaskGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaskGetwayApplication.class, args);
    }

}
