package com.yqc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangqc on 2017/6/4.
 */
@RestController
@RequestMapping
public class MyController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
