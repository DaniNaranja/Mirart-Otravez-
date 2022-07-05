package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.model.Dibujo;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import com.proyectoApp.Mirart.service.ArtistaService;
import com.proyectoApp.Mirart.service.DibujoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VisorController {


    @Autowired
    private DibujoService dibujoService;

    @Autowired
    private ArtistaService artistaService;

    /**
     * Metodo encargado de mostrar la vista visor.
     *
     * @param model libreria proporcionada por Spring para la creacion
     *      *               de entidades e insercion de datos a la DB.
     *
     * @return lleva a la vista visor.
     */
    @GetMapping("/visor")
    public String visor(@RequestParam(name= "id_dibujo") Long id_dibujo, Model model){
        Dibujo dibujo= dibujoService.getDibujoById_Dibujo(id_dibujo);
        Artista artista= dibujo.getArtista();
        model.addAttribute("dibujo", dibujo);
        model.addAttribute("artista", artista);

        return "visor";
    }
}
