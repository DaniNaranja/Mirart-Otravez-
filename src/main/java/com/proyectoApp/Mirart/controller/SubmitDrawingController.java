package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.model.Dibujo;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.DibujoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/** @author Daniela Paredes
 */
@Controller
public class SubmitDrawingController {

    @Autowired
    private DibujoRepository dibujoRepository;

    @Autowired
    private ArtistaRepository artistaRepository;


    /**
     *Metodo encargado de mostrar la vista para subir imagenes
     *
     * @param model libreria proporcionada por Spring para la creacion
     *              de entidades e insercion de datos a la DB.
     * @param dibujo clase que se instancia para ingresar datos a la DB
     * @param artista clase que se instancia para ingresar datos a la DB
     * @return
     */
    @GetMapping("/submit_drawing")
    public String submitDrawing(Model model, Dibujo dibujo, Artista artista){
        model.addAttribute("dibujo", new Dibujo());
        model.addAttribute("artista", new Artista());

        return "submit_drawing";
    }

    /**
     * Metodo encargado de manejar los datos ingresados en el formulario e ingresarlos a la DB
     *
     * @param dibujo se instancia un objeto dibujo que sera insertado
     *      *        a la DB mediante JPA Entity
     * @param model libreria proporcionada por Spring para la creacion
     *      *       de entidades e insercion de datos a la DB.
     *
     * @return redirecciona al inicio tras subir un dibujo exitosamente.
     */

    @PostMapping("/form_drawing")
    public String subirDibujo(@ModelAttribute Dibujo dibujo, Model model){
        dibujoRepository.save(dibujo);

        return "redirect:/";
    }
}
