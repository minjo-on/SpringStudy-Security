//package com.example.springstudysecurity.jwtController;
//
//import com.example.springstudysecurity.dto.JoinDTO;
//import com.example.springstudysecurity.service.JoinService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@ResponseBody
//public class JwtJoinController {
//    private final JoinService joinService;
//
//    public JwtJoinController(JoinService joinService){
//        this.joinService = joinService;
//    }
//
//    @PostMapping("/jwt/join")
//    public String joinProcess(JoinDTO joinDTO){
//        System.out.println(joinDTO.getUsername());
//        joinService.joinProcess(joinDTO);
//        return "ok";
//
//    }
//}
