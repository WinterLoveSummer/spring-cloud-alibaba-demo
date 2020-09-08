package com.lhy.spring.cloud.alibaba.rocketmq.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @author lhy
 * @date 2020/9/8 15:09
 * @desc:
 */
@Service
public class ConsumerReceive {

    @StreamListener("input")
    public void receiveInput(String message) {
        System.out.println("Receive input: " + message);
    }
}