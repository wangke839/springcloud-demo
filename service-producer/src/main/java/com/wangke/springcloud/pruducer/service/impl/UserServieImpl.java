package com.wangke.springcloud.pruducer.service.impl;

import com.wangke.springcloud.pruducer.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServieImpl  implements UserService {
    @Override
    public String getUsernameById(Integer id) {
        return "张三";
    }
}
