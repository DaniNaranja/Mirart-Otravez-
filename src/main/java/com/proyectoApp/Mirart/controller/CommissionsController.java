package com.proyectoApp.Mirart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommissionsController {

    @GetMapping("/commissions")
    public String commissions(){
        return "commissions";
    }
}
