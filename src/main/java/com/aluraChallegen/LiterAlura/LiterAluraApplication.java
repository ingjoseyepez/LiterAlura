package com.aluraChallegen.LiterAlura;

import com.aluraChallegen.LiterAlura.principal.Principal;
import com.aluraChallegen.LiterAlura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {
	@Autowired
	private AutorRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.muestraElMenu();
	}
}
