package com.qiao.order.common.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author huangqf
 @date: 2019/6/29 15:12
 * email: 244154988@qq.com
 */

public interface Channel {

    String CONSUMER = "qlqConsumer";

    /**
     * 消息消费者
     * @return SubscribableChannel
     */
    @Input(CONSUMER)
    SubscribableChannel consumer();

    String PRODUCER = "qlqProducer";

    /**
     * 消息生产者
     * @return MessageChannel
     */
    @Output(PRODUCER)
    MessageChannel producer();
}
