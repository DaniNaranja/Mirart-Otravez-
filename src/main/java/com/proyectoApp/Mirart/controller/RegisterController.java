package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.model.Usuario;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ArtistaRepository artistaRepository;

    @GetMapping("/registro")
    public String showRegistro(Model model){
        model.addAttribute("usuario", new Usuario());

        return "registro";
    }

    @PostMapping("/registrar_usuario")
    public String save(@ModelAttribute Usuario usuario){
       return "index";
    }


}
