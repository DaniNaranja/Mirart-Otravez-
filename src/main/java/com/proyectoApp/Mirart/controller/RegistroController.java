package com.proyectoApp.Mirart.controller;

import com.proyectoApp.Mirart.model.Artista;

import com.proyectoApp.Mirart.repository.ArtistaRepository;

import com.proyectoApp.Mirart.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;


@Controller
public class RegistroController {

    @Autowired
    private ArtistaService artistaService;

    @Autowired
    private ArtistaRepository artistaRepository;







    /**
     *Este metodo se encarga de mostrar la vista de la pagina de registro
     *
     *  @param model libreria proporcionada por Spring para la creacion
     *               de entidades e insercion de datos a la DB.
     *
     *  @return devuelve la vista registro
     *
     */
    @GetMapping("/registro")
    public String showRegistro(Model model, Principal p){
        model.addAttribute("artista", new Artista());

        if(p != null){
            Long artistaId= artistaService.findByNickname(p.getName()).getId();
            model.addAttribute("artistaId", artistaId);
        }
        return "registro";
    }

    /**
     * Este metodo maneja los datos ingresados a traves del frontend y los ingresa a la DB
     *
     * @param artista se instancia un objeto artista que sera insertado
     *                a la DB mediante JPA Entity
     *
     * @return Redirecciona al inicio tras crear una cuenta correctamente
     */

    @PostMapping("/form_registro")
    public String registrarUsuario(@ModelAttribute Artista artista){
        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        artista.setPassword(encoder.encode(artista.getPassword()));
        artista.setProfilePicture("https://iili.io/ja7sg1.jpg");
        artista.setBannerPicture("https://iili.io/ja74sV.png");

        artistaService.save(artista);

        return "redirect:/";
    }




}
