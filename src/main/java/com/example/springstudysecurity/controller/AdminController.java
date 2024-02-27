package com.example.springstudysecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @GetMapping("/admin/pay")
    public String adminPay()
    {
        return "adminPay";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/admin/**")
    public String admin(){
        return "admin";
    }

    @GetMapping("/denied")
    public String denied(){
        return "denied";
    }
}
