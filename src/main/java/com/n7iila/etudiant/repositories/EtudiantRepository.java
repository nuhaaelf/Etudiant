package com.n7iila.etudiant.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.n7iila.etudiant.entities.Etudiant;
@RepositoryRestController

	public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{
	    
	
}
