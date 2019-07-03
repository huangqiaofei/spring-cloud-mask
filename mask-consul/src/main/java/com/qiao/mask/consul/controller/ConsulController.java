package com.qiao.mask.consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangqf
 * @date: 2019/6/29 15:05
 * @description:
 */
@RestController
@RequestMapping("/")
public class ConsulController {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health() {
        return "health";
    }
}
