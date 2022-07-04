package com.proyectoApp.Mirart.repository;

import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.model.Dibujo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Interface que extiende de CrudRepository para manejar datos de la DB
 */
public interface DibujoRepository extends CrudRepository<Dibujo, Long> {

    Dibujo findDibujoByTitulo(String titulo);

    Dibujo getDibujoById(Long id);



}
