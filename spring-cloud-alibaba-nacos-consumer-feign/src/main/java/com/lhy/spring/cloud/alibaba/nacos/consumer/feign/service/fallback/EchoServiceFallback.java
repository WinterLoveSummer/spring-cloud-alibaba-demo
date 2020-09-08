package com.lhy.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.lhy.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @author lhy
 * @date 2020/9/7 15:31
 * @desc:
 */
@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String message) {
        return "echo fallback";
    }
}
