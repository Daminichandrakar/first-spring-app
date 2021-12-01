package com.bridgelabz.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Purpose : To simulate simple hello world message.
 *
 * @author : DAMINI CHANDRAKAR
 * @since : 01-12-2021
 */

@SpringBootApplication
public class FirstSpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringAppApplication.class, args);
        System.out.println("Hello World From BridgeLabz");
    }
}
