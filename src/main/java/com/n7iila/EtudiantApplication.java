package com.n7iila;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.n7iila.etudiant.entities.Etudiant;
import com.n7iila.etudiant.repositories.EtudiantRepository;
@SpringBootApplication
public class EtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}
	@Bean
	CommandLineRunner start(EtudiantRepository etudiantRepository)
	{return args -> {
		for(int i=0;i<10;i++) {
			Etudiant c= Etudiant.builder()
				      .idEtudiant((int) Math.random())
				      .email("elfidnouhaila7@gmail.com")
				      .build();
			etudiantRepository.save(c); 
		}
		List<Etudiant> listes=etudiantRepository.findAll();
	
		  
		  for(Etudiant cp:listes) {
		  System.out.println(cp.getIdEtudiant());
		  System.out.println(cp.getEmail());}

};
}}
