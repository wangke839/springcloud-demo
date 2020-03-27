package com.wangke.springcloud.pruducer.controller;

import com.netflix.discovery.converters.Auto;
import com.wangke.springcloud.pruducer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("producer")
public class Hello {

    @Autowired
    private UserService userService;
    @RequestMapping("hello")
    public Object hello(@RequestParam("name") String name){
        System.err.println("调用producer");
        return "hellow,"+name+"from producer";
    }
    @RequestMapping("select")
    public Object select(@RequestParam("id") Integer id){
        return userService.getUsernameById(id);
    }
}
