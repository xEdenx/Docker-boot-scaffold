package com.tneciv.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tneciv on 2016/10/4.
 */
@RestController
public class HelloRestController {
    
    @Autowired
    HelloService helloService;

    @RequestMapping(method = RequestMethod.GET, value = "restHello")
    public HelloEntity getRestEntity(@RequestParam String para1, @RequestParam String para2) {
        return helloService.getEntity(para1, para2);
    }
    
}
