package com.example.springstudysecurity.jwtController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JwtMainController {
    @GetMapping("/jwt")
    public String mainJwtP(){
        return "mainjwt Controller";
    }
}
