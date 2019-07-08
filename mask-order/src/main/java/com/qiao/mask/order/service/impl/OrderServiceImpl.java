package com.qiao.mask.order.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.qiao.mask.order.domain.entity.OrderMainDO;
import com.qiao.mask.order.mapper.OrderMainMapper;
import com.qiao.mask.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: huangqf
 * @date: 2019/7/8 10:25
 * @description:
 * @Copyright (C) 杭州同基汽车科技有限公司
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMainMapper orderMainMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @LcnTransaction //分布式事务注解
    @Transactional //本地事务注解
    public Boolean testTransaction() {
        Boolean dResp = restTemplate.getForObject("http://mask-user/test/testTransaction", Boolean.class);
        OrderMainDO orderMainDO = new OrderMainDO();
        orderMainDO.setOrderNo("12");
        orderMainDO.setOrderStatus(1);
        orderMainDO.setPayment(BigDecimal.TEN);
        orderMainDO.setUserId(1L);
        orderMainDO.setCreateDate(new Date());
        orderMainDO.setShippingId(2L);
        int insert = orderMainMapper.insert(orderMainDO);
        // 模拟报错
        //System.out.println(1/0);
        return true;

    }
}
