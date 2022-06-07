package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.repository.ComisionRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubmitCommissionController {

    @Autowired
    private ComisionRepository comision;

    /**
     *
     * @param model libreria proporcionada por Spring para la creacion
     *      *       de entidades e insercion de datos a la DB.
     *
     * @return devuelve la vista submit_commission
     */
    @GetMapping("/submit_commission")
    public String submitCommission(Model model){


        return "submit_commission";
    }
}
