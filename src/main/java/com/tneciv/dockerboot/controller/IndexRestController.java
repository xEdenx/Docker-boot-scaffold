package com.tneciv.dockerboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tneciv on 2016/10/5.
 */
@RestController
public class IndexRestController {

    @RequestMapping(method = RequestMethod.GET, value = "/restIndex")
    public String getInfo() {
        return "hello world";
    }
    
}
