package com.qiao.mask.feign.configuration.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangqf
 * @date 2019-06-29
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced
    public RestTemplate geRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule rule() {
        return new RandomRule();
    }
}
