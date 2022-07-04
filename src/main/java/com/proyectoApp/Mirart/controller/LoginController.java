package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
public class LoginController {


    @Autowired
    private ArtistaRepository artistaRepository;

    /**
     * metodo encargado de mostrar la vista login
     * @param model libreria proporcionada por Spring para la creacion
     *              de entidades e insercion de datos a la DB.
     * @return devuelve la vista login
     */
    @GetMapping("/login")
    public String login(@RequestParam(value="error" , required= false) String error,
                        @RequestParam(value="logout" , required= false) String logout,
            Model model, Principal principal, RedirectAttributes flash) {
        if (principal!= null){
            flash.addFlashAttribute("info", "Ya ha iniciado sesión anteriormente.");
            return "redirect:/";
        }

        if (error!= null){
            model.addAttribute("error", "Nombre de usuario o contraseña incorrectos, intente nuevamente.");
        }

        if (logout!= null){
            model.addAttribute("succes", "Ha cerrado sesión exitosamente.");
        }

        model.addAttribute("artista", new Artista());
        return "login";
    }

    /**
     * metodo encargado del manejo de los datos para la creacion de una cuenta en la DB
     * @param artista
     * @param model libreria proporcionada por Spring para la creacion
     *              de entidades e insercion de datos a la DB.
     * @param redirAttrs libreria proporcionada por spring, en este caso para el manejo de alertas
     * @return dependiendo de si se crea la cuenta o no, redirecciona al inicio o se queda en el login en caso de error
     */
    @PostMapping("/form_login")
    public String ingresarUsuario(@ModelAttribute Artista artista, Model model, RedirectAttributes redirAttrs) {
        if (artistaRepository.existsByNickname(artista.getNickname()) && artistaRepository.existsByPassword(artista.getPassword())) {

            return "redirect:/";
        } else {
            redirAttrs.addFlashAttribute("error", "Intente nuevamente");
            return "redirect:/login";
        }


    }
}
