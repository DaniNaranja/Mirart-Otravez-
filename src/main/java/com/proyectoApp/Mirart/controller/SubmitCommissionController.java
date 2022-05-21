package com.proyectoApp.Mirart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubmitCommissionController {


    @GetMapping("/submit_commission")
    public String submitCommission(){
        return "submit_commission";
    }
}
