package com.example.springstudysecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginP(){
        return "login";
    }
/*
    @PostMapping("/loginProc")
    public String loginProc(){
        if(){
            return "redirect:/";
        }

        return "redirect:/main";
    }*/

}
