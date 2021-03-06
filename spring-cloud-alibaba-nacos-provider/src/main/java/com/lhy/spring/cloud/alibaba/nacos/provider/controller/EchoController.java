package com.lhy.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhy
 * @date 2020/9/7 14:38
 * @desc:
 */
@RestController
public class EchoController {

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message){
        return "hello nacos provider " + message;
    }

    // 从上下文中读取配置
    @GetMapping(value = "/hi")
    public String sayHi() {
        return "Hello " + applicationContext.getEnvironment().getProperty("user.name");
    }
}
