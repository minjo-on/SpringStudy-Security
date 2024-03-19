package com.example.springstudysecurity.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigController {
    @GetMapping(value = "/config")
    public String config() throws Exception {
        return "admin/config";
    }
}
