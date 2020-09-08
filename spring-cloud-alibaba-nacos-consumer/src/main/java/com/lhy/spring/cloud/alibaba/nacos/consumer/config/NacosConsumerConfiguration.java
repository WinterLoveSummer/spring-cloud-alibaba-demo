package com.lhy.spring.cloud.alibaba.nacos.consumer.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lhy
 * @date 2020/9/7 15:03
 * @desc:
 */
@Configuration
public class NacosConsumerConfiguration {

    @Bean
    public RestTemplate newRestTemplate(){
        return new RestTemplate();
    }
}
