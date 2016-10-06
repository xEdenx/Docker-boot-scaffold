package com.tneciv.dockerboot.controller;

import com.tneciv.dockerboot.entity.Boot;
import com.tneciv.dockerboot.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tneciv on 2016/10/5.
 */
@RestController
public class IndexRestController {

    @Autowired
    IndexService indexService;

    @RequestMapping(method = RequestMethod.GET, value = "/restIndex")
    public Boot getInfo() {
        return this.indexService.doSth();
    }

}
