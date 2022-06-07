package com.proyectoApp.Mirart.repository;

import com.proyectoApp.Mirart.model.Usuario;
import org.springframework.data.repository.CrudRepository;
/**
 * Interface que extiende de CrudRepository para manejar datos de la DB
 */
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
