package com.tneciv.dockerboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tneciv on 2016/10/6.
 */
@Controller
public class IndexViewController {
    @RequestMapping("/")
    public String redirectToIndex() {
        return "index";
    }
}
