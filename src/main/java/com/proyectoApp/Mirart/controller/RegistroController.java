package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.model.Artista;

import com.proyectoApp.Mirart.repository.ArtistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegistroController {



    @Autowired
    private ArtistaRepository artistaRepository;

    @GetMapping("/registro")
    public String showRegistro(Model model){
        model.addAttribute("artista", new Artista());
        return "registro";
    }

    @PostMapping("/form_registro")
    public String registrarUsuario(@ModelAttribute Artista artista, Model model){
        artistaRepository.save(artista);

        return "redirect:/";
    }




}
