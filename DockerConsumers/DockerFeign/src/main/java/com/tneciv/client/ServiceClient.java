package com.tneciv.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Tneciv on 2016/10/13.
 */
@FeignClient("ServiceClient")
public interface ServiceClient {
    @RequestMapping(value = "addService", method = RequestMethod.GET)
    Integer addIn(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
