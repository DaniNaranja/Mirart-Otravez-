package com.proyectoApp.Mirart.repository;

import com.proyectoApp.Mirart.model.Artista;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface que extiende de CrudRepository para manejar datos de la DB
 */
public interface ArtistaRepository extends CrudRepository<Artista, Long> {

    /**
     * Metodo que busca un usuario segun un nickname en la DB
     * @param nickname  String con el nombre de un usuario
     * @return Artista
     */
    Artista findByNickname(String nickname);
    /**
     * Metodo que busca la existencia de un nickname en la DB
     * @param nickname Un string con el nombre del usuario
     * @return boolean
     */
    boolean existsByNickname (String nickname);

    /**
     * Metodo que busca la existencia de una contrasela en la DB
     * @param password Un String con una contraseña en especifico
     * @return boolean
     */
    boolean existsByPassword(String password);

}
