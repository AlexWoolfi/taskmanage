package com.andreiTaskManager.taskmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AthorizationPage {

    @GetMapping("authorization")
    public String getPageInput() {
        return "authorization";
    }
    @GetMapping("")
    public String getHome() {
       return "redirect:/authorization";
    }
}
