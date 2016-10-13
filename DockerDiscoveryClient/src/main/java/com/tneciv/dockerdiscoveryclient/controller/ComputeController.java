package com.tneciv.dockerdiscoveryclient.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tneciv on 2016/10/8.
 */
@RestController
public class ComputeController {
    Logger log = Logger.getLogger(getClass());

    @Autowired
    DiscoveryClient client;

    @RequestMapping(value = "/addService", method = RequestMethod.GET)
    public Integer addNum(@RequestParam int a, @RequestParam int b) {
        ServiceInstance instance = client.getLocalServiceInstance();
        log.info("/addService , host: " + instance.getHost()
                + ", Service Id :" + instance.getServiceId());
        return a + b;
    }
}
