package com.lhy.spring.cloud.alibaba.rocketmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @author lhy
 * @date 2020/9/8 14:31
 * @desc:
 */
@Service
public class ProviderService {

    @Autowired
    private MessageChannel output;

    public void send(String message) {
        output.send(MessageBuilder.withPayload(message).build());
    }
}
