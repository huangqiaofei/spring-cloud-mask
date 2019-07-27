package com.qiao.mask.user;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author huangqf
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDistributedTransaction
@EnableResourceServer
public class MaskUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaskUserApplication.class, args);
    }

}
