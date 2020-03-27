package com.wnagke.springcloud.consumer.feign;

import com.wnagke.springcloud.consumer.config.HelloFeignCallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-producer",fallback = HelloFeignCallback.class)
public interface HelloFeignClient {

    @RequestMapping("/producer/hello")
    public String hello(@RequestParam("name") String name);

    @RequestMapping("/producer/select")
    public String select(@RequestParam("id") Integer id);
}
