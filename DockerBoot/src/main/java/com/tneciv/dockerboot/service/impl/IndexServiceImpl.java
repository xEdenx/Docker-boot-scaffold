package com.tneciv.dockerboot.service.impl;

import com.tneciv.dockerboot.entity.Boot;
import com.tneciv.dockerboot.entity.BootExample;
import com.tneciv.dockerboot.mapper.BootMapperExt;
import com.tneciv.dockerboot.service.IndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tneciv on 2016/10/6.
 */
@Service
public class IndexServiceImpl implements IndexService {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    BootMapperExt bootMapper;

    @Override
    public List<Boot> doSth() {
        logger.debug(" Get info from MySQL ... ");
        BootExample bootExample = new BootExample();
        bootExample.createCriteria().andDescriptionIsNotNull();
        List<Boot> boots = bootMapper.selectByExample(bootExample);
        for (Boot boot : boots) {
            logger.debug("name : " + boot.getName());
        }
        return boots;
    }

    @Override
    @CachePut(value = "boots", keyGenerator = "tnecivKeyGenerator")
    public void insertSth(Boot boot) {
        logger.debug("start insert to db");
        bootMapper.insertSth(boot);
    }

    @Override
    @Cacheable(value = "boots", keyGenerator = "tnecivKeyGenerator")
    public List<Boot> testRedisCache() {
        logger.debug("Start redis cache method");
        return doSth();
    }

}
