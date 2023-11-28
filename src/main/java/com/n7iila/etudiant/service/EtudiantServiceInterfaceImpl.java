package com.n7iila.etudiant.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n7iila.etudiant.dto.EtudiantRequestDTO;
import com.n7iila.etudiant.dto.EtudiantResponseDTO;
import com.n7iila.etudiant.entities.Etudiant;
import com.n7iila.etudiant.maper.EtudiantInterfaceMap;
import com.n7iila.etudiant.repositories.EtudiantRepository;

import jakarta.transaction.Transactional;
@Service 
@Transactional

	public class EtudiantServiceInterfaceImpl implements EtudiantServiceInterface  {
		
		//POST
		@Autowired
		EtudiantRepository  etudiantRepository;
		@Autowired
		EtudiantInterfaceMap  etudiantInterfaceMap;
		public void add(EtudiantRequestDTO etudiantRequestDTO) {
			Etudiant c=new Etudiant();
			c= etudiantInterfaceMap.etudiantRequestDTO2Etudiant(etudiantRequestDTO);
			etudiantRepository.save(c);}
		
		//GET
		public List<EtudiantResponseDTO> listerEtudiants() {
			List<Etudiant> liste=new ArrayList<Etudiant>();
			liste= etudiantRepository.findAll();
			List<EtudiantResponseDTO> l= new ArrayList<EtudiantResponseDTO>();
			for(Etudiant c: liste) {
				EtudiantResponseDTO r= new EtudiantResponseDTO();
			    r=etudiantInterfaceMap.etudiant2EtudiantResponseDTO(c);
				//BeanUtils.copyProperties(c, r);
				l.add(r);
			
			}
			return l;
		}
		
		//GET BY ID
		public EtudiantResponseDTO etudiantById(Integer id) {
			Etudiant c=new Etudiant();
		    c=etudiantRepository.findById(id).get();
		  // CompteResponseDTO cr= new CompteResponseDTO();
		  // BeanUtils.copyProperties(c, c);
		   EtudiantResponseDTO r= new EtudiantResponseDTO();

		   r=etudiantInterfaceMap.etudiant2EtudiantResponseDTO(c);
			return r;
		}
		
		//PUT
		public void update(Integer id, EtudiantRequestDTO r) {
			Etudiant c1=new Etudiant();
			c1=etudiantRepository.findById(id).get();
			c1=etudiantInterfaceMap.etudiantRequestDTO2Etudiant(r);
			    
			    if (r.getIdEtudiant()!=null) c1.setIdEtudiant(id);
			    if (r.getEmail()!=null)c1.setEmail(r.getEmail());
			    
			    etudiantRepository.save(c1);
			   

		}
		
		//DELETE
		public void supprim(Integer id) {
		    // Check if the entity with the given ID exists
		    if (etudiantRepository.existsById(id)) {
		        // If it exists, delete the entity
		        etudiantRepository.deleteById(id);
		        System.out.println("Etudiant with ID " + id + " has been deleted.");
		    } else {
		        System.out.println("Etudiant with ID " + id + " not found. No deletion performed.");
		    }
		}


	}


