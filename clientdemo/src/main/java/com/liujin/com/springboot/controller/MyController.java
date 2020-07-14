package com.liujin.com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:liujin
 * @date: 2020/7/14 9:50
 * @description:
 */
@RestController
public class MyController {

    @RequestMapping("test")
    public String tes(){
        return "this is client";
    }

}
