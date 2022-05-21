package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.repository.DibujoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubmitDrawingController {

    @Autowired
    private DibujoRepository dibujo;
    @GetMapping("/submit_drawing")
    public String submitDrawing(Model model){



        return "submit_drawing";
    }
}
