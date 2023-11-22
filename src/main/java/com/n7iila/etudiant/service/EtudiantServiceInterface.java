package com.n7iila.etudiant.service;
import java.util.List;
import com.n7iila.etudiant.dto.EtudiantRequestDTO;
import com.n7iila.etudiant.dto.EtudiantResponseDTO;
import com.n7iila.etudiant.entities.Etudiant;
public interface EtudiantServiceInterface {





			
			//POST
			public void add(EtudiantRequestDTO etudiantRequestDTO);
			
			//GET
			public List<EtudiantResponseDTO>  listerEtudiants();
			
			//GET BY ID
			public EtudiantResponseDTO etudiantById(Integer id);
			
			//PUT
			public void update(Integer id, EtudiantRequestDTO c);
			
			//DELETE
			public void supprim(Integer id);


		}





