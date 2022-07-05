package com.proyectoApp.Mirart.repository;

import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.model.Dibujo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface que extiende de CrudRepository para manejar datos de la DB
 */

@Repository
public interface DibujoRepository extends CrudRepository<Dibujo, Long> {

    Dibujo findDibujoByTitulo(String titulo);

    Dibujo getDibujoById(Long id);



}
