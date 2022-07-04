package com.proyectoApp.Mirart.controller;

import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.service.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {



    @Autowired
    private ArtistaRepository artistaRepository;

    @Autowired
    private ArtistaService artistaService;

    /**
     * metodo encargado de la vista inicio, muestra las cuentas creadas
     * @param model libreria proporcionada por Spring para la creacion
     *               de entidades e insercion de datos a la DB.
     * @param artista clase instanciada para mostrar las cuentas que se
     *                encuentran en la DB
     * @return devuelve la vista inicio
     */
    @GetMapping("/")
    public String index(Model model, Artista artista){
        Iterable<Artista> artistas= artistaService.findAll();
        model.addAttribute("artistas",artistas);
        model.addAttribute("artista", new Artista());
        return "index";
    }










}
