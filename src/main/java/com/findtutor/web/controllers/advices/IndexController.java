package com.findtutor.web.controllers.advices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by abduls on 1/24/17.
 */
@Controller
public class IndexController
{
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }
}
