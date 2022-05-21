package com.proyectoApp.Mirart.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubmitDrawingController {


    @GetMapping("/submit_drawing")
    public String submitDrawing(){
        return "submit_drawing";
    }
}
