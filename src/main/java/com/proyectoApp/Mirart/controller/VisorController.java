package com.proyectoApp.Mirart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisorController {

    @GetMapping("/visor")
    public String visor(){
        return "visor";
    }
}
