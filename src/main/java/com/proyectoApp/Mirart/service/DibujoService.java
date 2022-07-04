package com.proyectoApp.Mirart.service;

import com.proyectoApp.Mirart.commons.GenericService;

import com.proyectoApp.Mirart.model.Dibujo;

import com.proyectoApp.Mirart.repository.DibujoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DibujoService extends GenericService<Dibujo, Long> {

    @Autowired
    private DibujoRepository dibujoRepository;

    public DibujoService (DibujoRepository repository){
        super(repository);
    }

    public Dibujo findDibujoByTitulo(String titulo){
        return ((DibujoRepository) repository).findDibujoByTitulo(titulo);
    }

    public Dibujo getDibujoById_Dibujo(Long id_dibujo){
        return ((DibujoRepository) repository).getDibujoById(id_dibujo);
 }

}
