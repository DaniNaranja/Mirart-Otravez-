package com.proyectoApp.Mirart.controller;

import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.model.Dibujo;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HighlightsController {

    @Autowired
    private DibujoRepository dibujoRepository;

    @Autowired
    private ArtistaRepository artista;

    @GetMapping("/highlights")
    public String highlights(Model model){
        Iterable<Dibujo> dibujos= dibujoRepository.findAll();
        model.addAttribute("dibujos",dibujos);
        
        return "highlights";
    }
}
