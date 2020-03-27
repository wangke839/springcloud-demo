package com.wnagke.springcloud.consumer.config;

import com.wnagke.springcloud.consumer.feign.HelloFeignClient;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignCallback implements HelloFeignClient {
    @Override
    public String hello(String name) {
        return "服务调用失败";
    }

    @Override
    public String select(Integer id) {
        return "服务调用失败";
    }
}
