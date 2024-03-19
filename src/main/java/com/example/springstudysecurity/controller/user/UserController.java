package com.example.springstudysecurity.controller.user;

import com.example.springstudysecurity.entity.AccountDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping(value = "/mypage")
    public String myPage() throws Exception {
        return "user/mypage";
    }

    @GetMapping("/users")
    public String createUser(){
        return "user/login/register";
    }

    @PostMapping("/users")
    public String createUser(AccountDto accountDto) {

        return "redirect:/";
    }
}
