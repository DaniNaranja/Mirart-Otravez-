package com.proyectoApp.Mirart.controller;

import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import com.proyectoApp.Mirart.service.ArtistaService;
import com.proyectoApp.Mirart.service.DibujoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfileController {



    @Autowired
    private ArtistaService artistaService;

    @Autowired
    private DibujoService dibujoService;

    /**
     * metodo encargado de mostrar la vista profile
     * @param model libreria proporcionada por Spring para la creacion
     *              de entidades e insercion de datos a la DB.
     * @return devuelve la vista profile
     */
     @GetMapping("/profile")
    public String profile(Model model){

        return "profile";
     }

     //REVISAR ID DE USUARIO LOGGEADO PARA EDITAR INFORMACION PERSONAL
     @GetMapping("/edit_profile")
    public String editarPerfil(Model model){

         return "edit_perfil";
     }

     @PostMapping("/form_edit")
    public String savePerfil(@ModelAttribute Artista artista, Model model){
         artistaService.save(artista);

         return  "redirect:/profile";
     }













}
