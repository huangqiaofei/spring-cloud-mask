package com.qiao.mask.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangqf
 */
@SpringBootApplication
@EnableEurekaClient
public class MaskUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaskUserApplication.class, args);
    }

}
