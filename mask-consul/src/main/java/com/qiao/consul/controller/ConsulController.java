package com.qiao.consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangqf
 * @date: 2019/6/29 15:05
 * @description:
 * @Copyright (C) 杭州同基汽车科技有限公司
 */
@RestController
@RequestMapping("/")
public class ConsulController {

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String health() {
        return "health";
    }
}
