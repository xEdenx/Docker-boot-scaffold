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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by Tneciv on 2016/10/5.
 */
@RestController
public class IndexRestController {

    private static final Logger logger = LoggerFactory.getLogger(IndexRestController.class);

    @Autowired
    IndexService indexService;

    @ApiOperation(value = "TestRestfulApi", notes = "Show Restapi demo")
    @ApiImplicitParams(@ApiImplicitParam(name = "restIndex", value = "nothing"
            , required = true, dataType = "nothing"))
    @GetMapping(value = "/restIndex")
    public ResEnv<List<Boot>> getInfo() {
        List<Boot> boots;
        try {
            boots = this.indexService.testRedisCache();
        } catch (ApplicationException e) {
            return ResEnv.fail(e.getMessage());
        } catch (Exception e) {
            logger.error("Error info is : {}", e.getMessage());
            return ResEnv.fail("获取数据异常");
        }
        return ResEnv.success(boots);
    }

    @RequestMapping("/addBoot")
    public ResEnv<String> incertBoot() {
        try {
            Boot boot = new Boot();
            boot.setDescription("desc incr");
            boot.setName(String.valueOf(new Date()));
            boot.setMemoRest("memo rest");
            this.indexService.insertSth(boot);
        } catch (ApplicationException e) {
            return ResEnv.fail(e.getMessage());
        } catch (Exception e) {
            logger.error(e.getMessage());
            return ResEnv.fail("新增数据异常");
        }
        return ResEnv.success("新增数据成功！");
    }

}
