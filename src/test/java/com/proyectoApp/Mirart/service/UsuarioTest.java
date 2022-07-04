package com.proyectoApp.Mirart.service;

import com.proyectoApp.Mirart.model.Artista;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
        Artista francisca;
        Artista dani;
        Artista sofi;
        ArrayList<Artista> a;
        @BeforeEach
        void setUp() {

            francisca = new Artista("MazaPan","ABC_56ajxo");
            dani = new Artista("naranjaSan","llaj5686");
            sofi = new Artista("sofi.02","4568_agtu");
            a = new ArrayList<>();
            a.add(francisca);
            a.add(dani);

        }
        @DisplayName("Retorna la contraseña")
        @Test
        void returnPass(){
            String pass= francisca.getPassword();
            String esperado = "ABC_56ajxo";
            assertSame(esperado,pass);
            System.out.println("La contraseña ha sido recuperada exitosamente");
        }

        @DisplayName("Password largo mayor a 8")
        @Test
        void longPass(){

            for (int i=0; i<a.size(); i++){
                int pass = a.get(i).getPassword().length();
                assertTrue(pass >= 8);
                System.out.println("La contraseña si es mayor a 8 caracteres.");
            }
        }


    }

