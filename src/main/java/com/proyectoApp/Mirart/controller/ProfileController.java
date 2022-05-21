package com.proyectoApp.Mirart.controller;

import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import com.proyectoApp.Mirart.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {


    @Autowired
    private UsuarioRepository usuario;

    @Autowired
    private ArtistaRepository artista;

    @Autowired
    private DibujoRepository dibujo;

     @GetMapping("/profile")
    public String profile(Model model){

        return "profile";
     }













}
