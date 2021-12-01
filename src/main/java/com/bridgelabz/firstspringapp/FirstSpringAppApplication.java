package com.bridgelabz.firstspringapp;

import com.bridgelabz.firstspringapp.controller.HelloWebController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Purpose : To simulate simple hello world message.
 *
 * @author : DAMINI CHANDRAKAR
 * @since : 01-12-2021
 */

@SpringBootApplication
public class FirstSpringAppApplication {

    public static void main(String[] args) {
       ApplicationContext applicationContext  =  SpringApplication.run(FirstSpringAppApplication.class, args);
        System.out.println("Hello World From BridgeLabz" + applicationContext.getBean(HelloWebController.class));
    }
}
