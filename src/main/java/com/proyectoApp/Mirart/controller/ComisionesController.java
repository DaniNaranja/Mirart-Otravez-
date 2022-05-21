package com.proyectoApp.Mirart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComisionesController {

    @GetMapping("/comisiones")
    public String comisiones(){

        return "comisiones";
    }
}
