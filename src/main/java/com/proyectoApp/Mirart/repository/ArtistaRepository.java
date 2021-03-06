package com.proyectoApp.Mirart.repository;

import com.proyectoApp.Mirart.model.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Interface que extiende de CrudRepository para manejar datos de la DB
 */

@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Long> {



    Artista getArtistaById(Long id);

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
