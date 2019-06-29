package com.qiao.order.controller;

import com.qiao.order.common.message.Producer;
import com.qiao.order.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author huangqf
 @date: 2019/6/29 15:12
 * mail: 244154988@qq.com
 */

@RestController
@RequestMapping(value = "/test")
@Api(value = "测试", description = "测试模块", position = 1)
public class TestController {

    @Autowired
    private CustomerService customerService;

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @ApiOperation(value = "返回用户输入的结果", notes = "返回用户输入的结果")
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String test(@RequestParam(value = "text") String text) {
        return text;
    }

    @ApiOperation(value = "测试服务链路追踪", notes = "测试服务链路追踪")
    @RequestMapping(value = "/zipkin", method = RequestMethod.GET)
    public String testCustomer(@RequestParam(value = "text") String text) {
        return restTemplate.getForObject("http://service-customer/test/result?text=" + text, String.class);
    }

    @Resource
    private Producer producer;

    @ApiOperation(value = "测试消息驱动", notes = "测试消息驱动")
    @RequestMapping(value = "/stream", method = RequestMethod.GET)
    public void testStream(@ApiParam(value = "message") @RequestParam(value = "message") String message) {
        producer.produce(message);
    }

    @ApiOperation(value = "测试服务间调用", notes = "测试服务间调用")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testCustomerService(@RequestParam(value = "text") String text) {
        return customerService.testCustomer(text);
    }
}
