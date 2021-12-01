package com.bridgelabz.firstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose : Create RestController to print message.
 *
 * @author : DAMINI CHANDRAKAR
 * @since : 01-12-2021
 */
@RestController
public class HelloRestController {

    @RequestMapping("/")
    public String hello() {
        return "Hello From Bridgelabz......";
    }

    @GetMapping("/hello")
    public String getMessage() {
        return "Hello From Bridgelabz......";
    }

    @GetMapping("/hello/query")
    public String getMessage(@RequestParam String name) {
        return name;
    }
}
