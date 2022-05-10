package com.proyectoApp.Mirart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HighlightsController {

    @GetMapping("/highlights")
    public String highlights(){
        return "highlights";
    }
}
