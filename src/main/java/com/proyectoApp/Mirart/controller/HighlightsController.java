package com.proyectoApp.Mirart.controller;

import com.proyectoApp.Mirart.model.Dibujo;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import com.proyectoApp.Mirart.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HighlightsController {

    @Autowired
    private DibujoRepository dibujoRepository;

    @Autowired
    private ArtistaService artistaService;

    /**
     * Metodo encargado de mostrar la vista destacados
     * @param model libreria proporcionada por Spring para la creacion
     *               de entidades e insercion de datos a la DB.
     * @return devuelve la vista destacados
     */
    @GetMapping("/highlights")
    public String highlights(Model model) {
        Iterable<Dibujo> dibujos = dibujoRepository.findAll();
        model.addAttribute("dibujos", dibujos);



        return "highlights";
    }
}
