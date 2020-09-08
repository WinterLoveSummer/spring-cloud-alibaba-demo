package com.lhy.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.lhy.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhy
 * @date 2020/9/7 15:19
 * @desc:
 */
@RestController
public class NacosConsumerFeignController {
    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/hi")
    public String echo(){
        return echoService.echo("hi feign");
    }
}
