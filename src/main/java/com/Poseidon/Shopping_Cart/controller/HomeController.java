package com.Poseidon.Shopping_Cart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/index")
    public String index(){
        return "hdhdh";
    }

    @GetMapping("/login")
    public String login(){
        return "index";
    }


    @GetMapping("/register")
    public String register(){
        return "index";
    }

}
