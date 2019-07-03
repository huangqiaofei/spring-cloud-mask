package com.qiao.mask.feign.controller;

import com.qiao.mask.feign.service.TestUserService;
import com.qiao.mask.feign.service.TestOrderService;
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
    private TestUserService testUserService;

    @Autowired
    private TestOrderService testOrderService;

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(@RequestParam(value = "text") String text) {
        return text;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser(@RequestParam(value = "text") String text) {
        return testUserService.testUser(text);
    }

    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public String getOrder(@RequestParam(value = "text") String text) {
        return testOrderService.testOrder(text);
    }

}
