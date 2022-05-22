package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.model.Dibujo;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SubmitDrawingController {

    @Autowired
    private DibujoRepository dibujoRepository;

    @Autowired
    private ArtistaRepository artistaRepository;

    @GetMapping("/submit_drawing")
    public String submitDrawing(Model model, Dibujo dibujo, Artista artista){
        model.addAttribute("dibujo", new Dibujo());
        model.addAttribute("artista", new Artista());

        return "submit_drawing";
    }

    @PostMapping("/form_drawing")
    public String subirDibujo(@ModelAttribute Dibujo dibujo, Model model){
        dibujoRepository.save(dibujo);

        return "redirect:/";
    }
}
