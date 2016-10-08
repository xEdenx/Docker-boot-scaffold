package com.tneciv.dockerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Tneciv on 2016/10/8.
 */
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate template;

    @RequestMapping(value = "addInRibbon", method = RequestMethod.GET)
    public String getRpcAddService(@RequestParam int a, @RequestParam int b) {
        return template.getForEntity("http://ServiceClient/addService?a=" + a + "&b=" + b, String.class).getBody();
    }
    
}
