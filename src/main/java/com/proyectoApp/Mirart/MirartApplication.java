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
public class MirartApplication implements CommandLineRunner {


	 @Autowired
	 private BCryptPasswordEncoder passwordEncoder;

	/**
	 * Metodo main en el cual compila la aplicacion
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MirartApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		String password= "12345";

		for (int i=0; i<2; i++){
			String bcryptPassword = passwordEncoder.encode(password);
		}


	}
}
