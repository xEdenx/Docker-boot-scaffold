package com.tneciv.dockerboot.service.impl;

import com.tneciv.dockerboot.dao.BootMapper;
import com.tneciv.dockerboot.entity.Boot;
import com.tneciv.dockerboot.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Tneciv on 2016/10/6.
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    BootMapper bootMapper;

    @Override
    public Boot doSth() {
        /*
        BootExample bootExample = new BootExample();
        bootExample.createCriteria().andIdEqualTo(2);
        List<Boot> boots = bootMapper.selectByExample(bootExample);
        */
        Boot boot = bootMapper.selectByPrimaryKey(2);
        return boot;
    }
}
