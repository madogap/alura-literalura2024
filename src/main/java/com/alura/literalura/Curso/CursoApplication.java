package com.alura.literalura.Curso;

import com.alura.literalura.Curso.principal.Principal;
import com.alura.literalura.Curso.repository.AutorRepository;
import com.alura.literalura.Curso.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoApplication implements CommandLineRunner {
	@Autowired
	AutorRepository autorRepository;
	@Autowired
	LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autorRepository,livroRepository);
		principal.principal();
	}

}
