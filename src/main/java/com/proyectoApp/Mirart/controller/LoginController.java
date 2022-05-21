package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ArtistaRepository artistaRepository;


    @GetMapping("/login")
    public String login(Model model){


        return "login";
    }
}
