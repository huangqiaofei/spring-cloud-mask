package com.qiao.mask.order.common.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author huangqf
 * @date: 2019/6/29 15:12
 * email: mr.huangqf@gmail.com
 */

@Slf4j
@EnableBinding(Channel.class)
public class Consumer {

    @StreamListener(Channel.CONSUMER)
    public void consume(String message) {
        log.info("接收消息：{}", message);
    }
}
