package com.qiao.mask.feign.configuration;

import com.netflix.hystrix.HystrixCommand;
import feign.Feign;
import feign.hystrix.HystrixFeign;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author huangqf
 * @date 2019-06-29
 */

@ConditionalOnClass({HystrixCommand.class, HystrixFeign.class})
public class FeignServerConfig {

    @Bean
    @Scope("prototype")
    @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "feign.hystrix.enabled", matchIfMissing = true)
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
