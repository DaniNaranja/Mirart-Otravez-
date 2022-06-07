package com.proyectoApp.Mirart.repository;


import com.proyectoApp.Mirart.model.Comision;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface que extiende de CrudRepository para manejar datos de la DB
 */
public interface ComisionRepository extends CrudRepository<Comision, Long> {
}
