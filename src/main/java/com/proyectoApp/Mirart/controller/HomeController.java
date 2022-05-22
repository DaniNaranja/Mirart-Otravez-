package com.proyectoApp.Mirart.controller;

import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import com.proyectoApp.Mirart.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ArtistaRepository artistaRepository;

    @Autowired
    private DibujoRepository dibujoRepository;

    @GetMapping("/")
    public String index(Model model, Artista artista){
        Iterable<Artista> artistas= artistaRepository.findAll();
        model.addAttribute("artistas",artistas);
        model.addAttribute("artista", new Artista());
        return "index";
    }










}
