package com.example.springstudysecurity.controller;

import com.example.springstudysecurity.dto.JoinDTO;
import com.example.springstudysecurity.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {
    private JoinService joinService;
    public JoinController(JoinService joinService){
        this.joinService = joinService;
    }
    @GetMapping("/join")
    public String joinP(){
        return "join";
    }

    @PostMapping("/joinProc")
    public String JoinProc(JoinDTO joinDTO){
        System.out.println(joinDTO.getUsername());
        joinService.joinProcess(joinDTO);

        return "redirect:/login";
    }
}
