package com.tneciv.dockerboot.controller;

import com.tneciv.dockerboot.common.ApplicationException;
import com.tneciv.dockerboot.common.ResEnv;
import com.tneciv.dockerboot.entity.Boot;
import com.tneciv.dockerboot.service.IndexService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Tneciv on 2016/10/5.
 */
@RestController
public class IndexRestController {

    Logger logger = LoggerFactory.getLogger(IndexRestController.class);

    @Autowired
    IndexService indexService;

    @ApiOperation(value = "TestRestfulApi", notes = "Show Restapi demo")
    @ApiImplicitParams(@ApiImplicitParam(name = "restIndex", value = "nothing"
            , required = true, dataType = "nothing"))
    @RequestMapping(method = RequestMethod.GET, value = "/restIndex")
    public ResEnv<List<Boot>> getInfo() {
        List<Boot> boots;
        try {
            boots = this.indexService.doSth();
        } catch (ApplicationException e) {
            return ResEnv.fail(e.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResEnv.fail("获取数据异常");
        }
        return ResEnv.success(boots);
    }

}
