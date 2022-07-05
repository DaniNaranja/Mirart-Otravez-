package com.proyectoApp.Mirart.service;

import com.proyectoApp.Mirart.commons.GenericService;
import com.proyectoApp.Mirart.model.Role;
import com.proyectoApp.Mirart.repository.RoleRepository;
import org.springframework.data.repository.CrudRepository;


public class RoleService extends GenericService<Role, Long> {


    public RoleService(RoleRepository repository) {
        super(repository);
    }
}
