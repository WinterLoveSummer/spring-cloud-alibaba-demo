package com.lhy.spring.cloud.alibaba.rocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author lhy
 * @date 2020/9/8 15:07
 * @desc:
 */
@SpringBootApplication
@EnableBinding({Sink.class})
public class RocketMQProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketMQProviderApplication.class,args);
    }
}
