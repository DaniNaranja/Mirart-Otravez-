package com.proyectoApp.Mirart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Clase en la cual corre la aplicacion
 */
@SpringBootApplication
public class MirartApplication{




	/**
	 * Metodo main en el cual compila la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MirartApplication.class, args);
	}


}
