package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisorController {


    @Autowired
    private DibujoRepository dibujo;

    @Autowired
    private ArtistaRepository artista;

    /**
     * Metodo encargado de mostrar la vista visor.
     *
     * @param model libreria proporcionada por Spring para la creacion
     *      *               de entidades e insercion de datos a la DB.
     *
     * @return lleva a la vista visor.
     */
    @GetMapping("/visor")
    public String visor(Model model){
        return "visor";
    }
}
