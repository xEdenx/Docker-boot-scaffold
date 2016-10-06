package com.tneciv.dockerboot.service.impl;

import com.tneciv.dockerboot.entity.Boot;
import com.tneciv.dockerboot.service.IndexService;
import org.springframework.stereotype.Service;

/**
 * Created by Tneciv on 2016/10/6.
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public Boot doSth() {
        Boot boot = new Boot();
        boot.setBoot("what");
        boot.setDesc("test");
        return boot;
    }
}
