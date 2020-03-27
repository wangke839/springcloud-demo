package com.wnagke.springcloud.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wnagke.springcloud.consumer.feign.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class HelloController {
   /* @Autowired
    private RestTemplate restTemplate;*/
    @Autowired
    private HelloFeignClient helloFeignClient;
   // @HystrixCommand(fallbackMethod = "hystrixCallbackMethod")
    @RequestMapping("hello")
    public Object hello(@RequestParam("name") String name){
       //return restTemplate.getForObject("http://service-producer/producer/hello?name="+name,String.class);
        //用Feign做负载均衡配置
        return helloFeignClient.hello(name);
    }
    @RequestMapping("select")
    public Object select(@RequestParam("id") Integer id){
        //用Feign做负载均衡配置
        return helloFeignClient.select(id);
    }

   /* public String hystrixCallbackMethod(String name){
        return  "调用失败";
    }*/
}
