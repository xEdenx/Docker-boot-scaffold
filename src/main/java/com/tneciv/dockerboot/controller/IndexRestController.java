package com.tneciv.dockerboot.controller;

import com.tneciv.dockerboot.common.ApplicationException;
import com.tneciv.dockerboot.common.ResEnv;
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
    public ResEnv<Boot> getInfo() {
        Boot boot;
        try {
            boot = this.indexService.doSth();
        } catch (ApplicationException e) {
            return ResEnv.fail(e.getMessage());
        } catch (Exception e) {
            System.out.println("******************");
            e.printStackTrace();
            System.out.println("******************");
            return ResEnv.fail("获取数据异常");
        }
        return ResEnv.success(boot);
    }

}
