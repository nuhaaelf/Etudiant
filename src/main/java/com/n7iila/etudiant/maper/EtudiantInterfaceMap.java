package com.n7iila.etudiant.maper;
import com.n7iila.etudiant.dto.EtudiantRequestDTO;
import com.n7iila.etudiant.dto.EtudiantResponseDTO;
import com.n7iila.etudiant.entities.Etudiant;
public interface EtudiantInterfaceMap {

		public Etudiant etudiantRequestDTO2Etudiant(EtudiantRequestDTO etudiantRequestDTO);
		public EtudiantResponseDTO etudiant2EtudiantResponseDTO(Etudiant etudiant);
	}


