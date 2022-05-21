package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.repository.ComisionRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComisionesController {

    @Autowired
    private ComisionRepository comision;

    @GetMapping("/comisiones")
    public String comisiones(Model model){

        return "comisiones";
    }
}
