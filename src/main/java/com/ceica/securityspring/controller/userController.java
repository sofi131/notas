package com.ceica.securityspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {
    @GetMapping("/user")
    public String user(){
        return "user";
    }


}
