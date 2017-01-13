package com.tneciv.dockerboot.controller;

import com.tneciv.dockerboot.service.MqSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tneciv on 2017/1/14.
 */
@RestController
public class MqTestController {
    @Autowired
    private MqSender sender;

    @RequestMapping(method = RequestMethod.GET, value = "mq")
    public void testMq() {
        this.sender.send("hhhhh");
    }
}
