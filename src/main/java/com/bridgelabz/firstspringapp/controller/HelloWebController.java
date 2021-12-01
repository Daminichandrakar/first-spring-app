package com.bridgelabz.firstspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Purpose : Create controller to print message.
 * @author : DAMINI CHANDRAKAR
 * @since  : 01-12-2021
 */

@Controller
public class HelloWebController {

    @GetMapping("/web")
    public String hello() {
        return "hello";
    }

    @GetMapping("/web/message")
    public String message(Model model) {
        model.addAttribute("message","This is a custome message");
        return "message";
    }
}
