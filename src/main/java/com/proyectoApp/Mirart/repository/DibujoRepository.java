package com.proyectoApp.Mirart.repository;

import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.model.Dibujo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DibujoRepository extends CrudRepository<Dibujo, Long> {


}
