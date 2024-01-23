package com.example.springstudysecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainJwtController {
    @GetMapping("/jwt")
    public String mainJwtP(){
        return "mainjwt Controller";
    }
}
