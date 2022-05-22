package com.proyectoApp.Mirart.repository;

import com.proyectoApp.Mirart.model.Artista;
import org.springframework.data.repository.CrudRepository;

public interface ArtistaRepository extends CrudRepository<Artista, Long> {

    boolean existsByNickname (String nickname);
    boolean existsByPassword(String password);

}
