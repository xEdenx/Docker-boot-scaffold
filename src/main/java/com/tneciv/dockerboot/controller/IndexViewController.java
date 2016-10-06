package com.tneciv.dockerboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tneciv on 2016/10/6.
 */
@Controller
public class IndexViewController {

    Logger logger = LoggerFactory.getLogger(IndexViewController.class);

    @RequestMapping("/")
    public String redirectToIndex() {
        return "index";
    }
}
