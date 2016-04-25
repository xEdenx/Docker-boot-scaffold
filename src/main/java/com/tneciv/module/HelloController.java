package com.tneciv.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tneciv on 2016/10/4.
 */
@Controller
public class HelloController {
    
    @RequestMapping("/htmlHello")
    public String getHello() {
        return "hello";
    }
    
}
