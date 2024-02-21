//package com.example.springstudysecurity.controller;
//
//import com.example.springstudysecurity.service.SessionService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
//
//@Controller
//public class MainController {
//
//    private SessionService sessionService;
//
//    public MainController(SessionService sessionService){
//        this.sessionService = sessionService;
//    }
//
//    @GetMapping("/")
//    public String mainP(Model model){
//
//        model.addAttribute("id",sessionService.getCurrentUserId());
//        model.addAttribute("role",sessionService.getCurrentUserRole());
//        return "main";
//    }
//}
