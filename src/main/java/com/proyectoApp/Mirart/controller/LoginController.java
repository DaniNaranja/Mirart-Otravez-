package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ArtistaRepository artistaRepository;


    @GetMapping("/login")
    public String showRegistro(Model model) {
        model.addAttribute("artista", new Artista());
        return "login";
    }


    @PostMapping("/form_login")
    public String registrarUsuario(@ModelAttribute Artista artista, Model model, RedirectAttributes redirAttrs) {
        if (artistaRepository.existsByNickname(artista.getNickname()) && artistaRepository.existsByPassword(artista.getPassword())) {
            artista.setVerifAcc(true);
            return "redirect:/";
        } else {
            redirAttrs.addFlashAttribute("error", "Intente nuevamente");
            return "login";
        }


    }
}
