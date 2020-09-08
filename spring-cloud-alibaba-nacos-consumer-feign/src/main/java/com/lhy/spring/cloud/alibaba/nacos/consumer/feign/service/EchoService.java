package com.lhy.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.lhy.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lhy
 * @date 2020/9/7 15:17
 * @desc:
 */
@FeignClient(value = "nacos-provider",fallback = EchoServiceFallback.class)
public interface EchoService {
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable String message);
}
