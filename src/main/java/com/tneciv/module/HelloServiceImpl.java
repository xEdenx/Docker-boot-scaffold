package com.tneciv.module;

import org.springframework.stereotype.Service;

/**
 * Created by Tneciv on 2016/10/4.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public HelloEntity getEntity(String key, String val) {
        return new HelloEntity(key, val);
    }

    @Override
    public HelloEntity testMybatis() {
       
        return null;
    }
}
