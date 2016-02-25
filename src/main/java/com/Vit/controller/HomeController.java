package com.Vit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by vitaliiromanchenko on 20.02.16.
 */

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "test";
    }

}
