package com.qiao.mask.order.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huangqf
 @date: 2019/6/29 15:12
 * mail: mr.huangqf@gmail.com
 */

@Service
@FeignClient(value = "mask-user")
public interface UserService {

    /**
     * 测试
     *
     * @param text 测试数据
     * @return String
     */
    @RequestMapping(value = "/test/result", method = RequestMethod.GET)
    String testUser(@RequestParam(value = "text") String text);
}
