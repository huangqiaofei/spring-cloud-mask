package com.qiao.feign.service;


import com.qiao.feign.configuration.fallback.HystrixClientFallback;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @author huangqf
 * @date 2019-06-29
 */

@Service
@FeignClient(value = "mask-user", fallback = HystrixClientFallback.class)
public interface TestCustomerService {

    /**
     * 测试
     *
     * @param text 测试数据
     * @return String
     */
    @RequestMapping(value = "/test/result", method = RequestMethod.GET)
    String testCustomer(@RequestParam(value = "text") String text);
}
