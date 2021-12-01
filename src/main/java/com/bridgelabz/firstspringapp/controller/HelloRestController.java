package com.bridgelabz.firstspringapp.controller;

import com.bridgelabz.firstspringapp.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String getMessageAsQueryParameter(
            @RequestParam String name) {
        return name;
    }

    @GetMapping("/hello/{name}")
    public String getMessageAsPatheVariable(
            @PathVariable(name = "name") String name) {
        return "Hello " + name;
    }

    @PostMapping("/hello3")
    public String getUserDto(
            @RequestBody UserDto userDto) {
        return userDto.toString();
    }

    @PutMapping("/hello4/{firstName}")
    public String getMessageUsingPutRequest(
            @PathVariable(name = "firstName") String firstName,
            @RequestParam String lastName
    ) {
        return "Hello " + firstName + " " + lastName ;
    }


}
