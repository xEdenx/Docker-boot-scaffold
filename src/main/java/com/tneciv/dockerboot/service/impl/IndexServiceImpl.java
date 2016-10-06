package com.tneciv.dockerboot.service.impl;

import com.tneciv.dockerboot.entity.Boot;
import com.tneciv.dockerboot.entity.BootExample;
import com.tneciv.dockerboot.mapper.BootMapperExt;
import com.tneciv.dockerboot.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tneciv on 2016/10/6.
 */
@Service
public class IndexServiceImpl implements IndexService {

    Logger logger = LoggerFactory.getLogger(IndexServiceImpl.class);

    @Autowired
    BootMapperExt bootMapper;

    @Override
    public List<Boot> doSth() {
        BootExample bootExample = new BootExample();
        bootExample.createCriteria().andDescriptionIsNotNull();
        List<Boot> boots = bootMapper.selectByExample(bootExample);
        for (Boot boot : boots) {
            logger.debug(boot.getName());
        }
        return boots;
    }

    @Override
    public void insertSth(Boot boot) {
        bootMapper.insertSth(boot);
    }


}
