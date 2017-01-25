package com.findtutor.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by abduls on 1/24/17.
 */
@Controller
public class HelloWorld
{
    @RequestMapping("/")
    public String sayHello()
    {
        return "index";
    }
}
