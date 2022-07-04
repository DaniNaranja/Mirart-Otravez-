package com.proyectoApp.Mirart.service;

import com.proyectoApp.Mirart.model.Dibujo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class DibujoServiceTest {

    @Autowired
    private DibujoService dibujoService;

    @DisplayName("Encontrar dibujo por titulo")
    @ParameterizedTest
    @ValueSource(strings = {"ola1", "holanda"})
    void findDibujoByTitulo(String titulo){
        Dibujo resultado = dibujoService.findDibujoByTitulo(titulo);

        if (resultado==null){
            Assertions.assertTrue(true);
            System.out.println("No se encuentra un dibujo con titulo "+titulo);
        }

        if(resultado!= null) {
            Assertions.assertNotNull(resultado);
            System.out.println("Existe un dibujo con titulo "+titulo);
            System.out.println("==============================");
            Assertions.assertEquals("ola1", resultado.getTitulo());
            System.out.println("ID: "+resultado.getArtista().getId()+"\nArtista: "+resultado.getArtista().getNickname()+"\nDescripcion: "+resultado.getDescripcion());

        }
    }

}

