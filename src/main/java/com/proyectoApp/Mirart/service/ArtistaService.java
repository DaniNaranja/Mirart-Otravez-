package com.proyectoApp.Mirart.service;

import com.proyectoApp.Mirart.commons.GenericService;
import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtistaService extends GenericService<Artista, Long> {

    @Autowired
    private ArtistaRepository artistaRepository;

    public ArtistaService (ArtistaRepository repository){
        super(repository);
    }

    public Artista findByNickname(String nickname){
        return ((ArtistaRepository) repository).findByNickname(nickname);
    }

    public Artista findArtistaById(Long id){
        return ((ArtistaRepository) repository).findArtistaById(id);
    }

}
