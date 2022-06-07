package com.proyectoApp.Mirart.controller;


import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ArtistaRepository artistaRepository;

    /**
     * metodo encargado de mostrar la vista login
     * @param model libreria proporcionada por Spring para la creacion
     *              de entidades e insercion de datos a la DB.
     * @return devuelve la vista login
     */
    @GetMapping("/login")
    public String showRegistro(Model model) {
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
    public String registrarUsuario(@ModelAttribute Artista artista, Model model, RedirectAttributes redirAttrs) {
        if (artistaRepository.existsByNickname(artista.getNickname()) && artistaRepository.existsByPassword(artista.getPassword())) {
            artista.setVerifAcc(true);
            return "redirect:/";
        } else {
            redirAttrs.addFlashAttribute("error", "Intente nuevamente");
            return "login";
        }


    }
}
