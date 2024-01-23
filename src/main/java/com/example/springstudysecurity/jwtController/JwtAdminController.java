package com.example.springstudysecurity.jwtController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JwtAdminController {
    @GetMapping("/jwt/admin")
    public String adminJwtP(){
        return "adminjwt Controller";
    }
}
