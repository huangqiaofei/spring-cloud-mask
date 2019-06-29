package com.qiao.feign.controller;

import com.qiao.feign.service.TestCustomerService;
import com.qiao.feign.service.TestOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangqf
 * @date 2019-06-29
 */

@RestController
public class TestController {

    @Autowired
    private TestCustomerService testCustomerService;

    @Autowired
    private TestOrderService testOrderService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(@RequestParam(value = "text") String text) {
        return text;
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public String getCustomer(@RequestParam(value = "text") String text) {
        return testCustomerService.testCustomer(text);
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String getOrder(@RequestParam(value = "text") String text) {
        return testOrderService.testOrder(text);
    }

}
