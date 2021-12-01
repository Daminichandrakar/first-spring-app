package com.bridgelabz.firstspringapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose : To Create RestController to print hello message.
 * @author : DAMINI CHANDRAKAR
 * @since  : 01-12-2021
 */

@RestController
public class HelloWebController {

    @GetMapping("/web")
    public String hello() {
        return "hello";
    }
}
