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
			Etudiant c0= Etudiant.builder()
				      .idEtudiant((int) Math.random())
				      .nom("Mgarred")
				      .prenom("Wijdane")
				      .email("wijdanox@gmail.com")
				      .build();
			etudiantRepository.save(c0); 
			
			
			Etudiant c1= Etudiant.builder()
				      .idEtudiant((int) Math.random())
				      .nom("El fid")
				      .prenom("Nouhaila")
				      .email("elfidnouhaila7@gmail.com")
				      .build();
			etudiantRepository.save(c1); 
			
			
			Etudiant c2= Etudiant.builder()
				      .idEtudiant((int) Math.random())
				      .nom("Jundi")
				      .prenom("Ihssane")
				      .email("ihssanox@gmail.com")
				      .build();
			etudiantRepository.save(c2); 
		
		List<Etudiant> listes=etudiantRepository.findAll();
	
		  
		  for(Etudiant cp:listes) {
		  System.out.println(cp.getIdEtudiant());
		  System.out.println(cp.getPrenom());
		  System.out.println(cp.getNom());
		  System.out.println(cp.getEmail());}

};
}}
