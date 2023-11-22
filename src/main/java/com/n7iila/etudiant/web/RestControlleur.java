package com.n7iila.etudiant.web;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n7iila.etudiant.dto.EtudiantRequestDTO;
import com.n7iila.etudiant.dto.EtudiantResponseDTO;
import com.n7iila.etudiant.entities.Etudiant;
import com.n7iila.etudiant.repositories.EtudiantRepository;
import com.n7iila.etudiant.service.EtudiantServiceInterface;

@RestController
@RequestMapping("/api")//donc gq3 les url http...../api/...
public class RestControlleur {
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	EtudiantServiceInterface etudiantServiceInterface;

	@GetMapping("/etudiants")
	 public List<EtudiantResponseDTO> getAll(){
			return etudiantServiceInterface.listerEtudiants();
			}	



	@GetMapping("/etudiants/{id}")
	public EtudiantResponseDTO getId(@PathVariable Integer id){
		return etudiantServiceInterface.etudiantById(id);}


	@PutMapping("/etudiants/{id}")
	public void save(@PathVariable("id") Integer id, 
	   @RequestBody EtudiantRequestDTO c) {
		etudiantServiceInterface.update(id, c);        
	}	


	@DeleteMapping("/etudiants/{id}")
	public void supprimer (@PathVariable("id") Integer id) {

	  etudiantServiceInterface.supprim(id) ;}


	@PostMapping("/comptes")
	public void save(@RequestBody EtudiantRequestDTO c){
		  etudiantServiceInterface.add(c) ;}
	}

