package com.qiao.feign.configuration.fallback;


import com.qiao.feign.service.TestCustomerService;
import org.springframework.stereotype.Component;

/**
 * @author huangqf
 * @date 2019-06-29
 */
@Component
public class HystrixClientFallback implements TestCustomerService {

    @Override
    public String testCustomer(String text) {
        return "失败:" + text;
    }
}
