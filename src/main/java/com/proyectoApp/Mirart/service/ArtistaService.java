package com.proyectoApp.Mirart.service;

import com.proyectoApp.Mirart.commons.GenericService;
import com.proyectoApp.Mirart.model.Artista;
import com.proyectoApp.Mirart.repository.ArtistaRepository;
import com.proyectoApp.Mirart.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArtistaService extends GenericService<Artista, Long> implements UserDetailsService {


    @Autowired
    private RoleRepository roleRepository;

    public ArtistaService(ArtistaRepository repository) {
        super(repository);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Artista artista= findByNickname(username);

        if( artista != null){
            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("USER"));

            return new User(artista.getNickname(),artista.getPassword(),authorities);
        }else {
            throw new UsernameNotFoundException("Usuario no encontrado.");
        }
    }



    public Artista findByNickname(String nickname){
        return ((ArtistaRepository) repository).findByNickname(nickname);
    }

    public Artista getArtistaById(Long id){
        return ((ArtistaRepository) repository).getArtistaById(id);
    }




}
