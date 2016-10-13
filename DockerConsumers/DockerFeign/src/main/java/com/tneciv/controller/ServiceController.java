package com.tneciv.controller;

import com.tneciv.client.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tneciv on 2016/10/13.
 */
@RestController
public class ServiceController {

    @Autowired
    ServiceClient client;

    @RequestMapping(value = "addInFeign", method = RequestMethod.GET)
    public Integer addInCon(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return client.addIn(a, b);
    }
}
