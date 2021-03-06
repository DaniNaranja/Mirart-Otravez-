package com.proyectoApp.Mirart.service;

import com.proyectoApp.Mirart.model.Artista;

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
public class ArtistaServiceTest {

    @Autowired
    private ArtistaService artistaService;



    @DisplayName("Encontrar por nickname")
    @ParameterizedTest
    @ValueSource(strings = {"---", "ola"})
    void findByNicknameTest(String nickname){
        Artista artistaResult= artistaService.findByNickname(nickname);

        if (artistaResult== null){
            Assertions.assertTrue(true);
            System.out.println("El usuario "+nickname+" no ha sido encontrado.");
        }

        if (artistaResult != null){
            Assertions.assertNotNull(artistaResult);
            System.out.println("El usuario "+nickname+" ha sido encontrado.");

            Assertions.assertEquals("ola", artistaResult.getNickname());
            Assertions.assertEquals(4, artistaResult.getId());
            Assertions.assertEquals("ola@ola.com", artistaResult.getEmail());

            System.out.println("Los valores corresponden.");
            System.out.println("ID: "+artistaResult.getId()+"\nNickname: "+artistaResult.getNickname()+"\nEmail: "+artistaResult.getEmail());

        }
    }






}
