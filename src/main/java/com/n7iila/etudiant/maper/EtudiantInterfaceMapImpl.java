package com.n7iila.etudiant.maper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.n7iila.etudiant.dto.EtudiantRequestDTO;
import com.n7iila.etudiant.dto.EtudiantResponseDTO;
import com.n7iila.etudiant.entities.Etudiant;
@Component


	public class EtudiantInterfaceMapImpl implements EtudiantInterfaceMap{
		
		@Override
		public Etudiant etudiantRequestDTO2Etudiant(EtudiantRequestDTO etudiantRequestDTO) {
			Etudiant c= new Etudiant();
			c.setIdEtudiant(etudiantRequestDTO.getIdEtudiant());
		    c.setEmail(etudiantRequestDTO.getEmail());

			return c;
		}

		@Override
		public EtudiantResponseDTO etudiant2EtudiantResponseDTO(Etudiant etudiant) {
	       EtudiantResponseDTO c = new EtudiantResponseDTO();
	       BeanUtils.copyProperties(etudiant ,c); // to replace this 3 next lines
			//c.setIdCompte(compte.getIdCompte());
			//c.setSolde(compte.getSolde());
			//c.setType(compte.getType());
		
			return c;
		}
		

	
}
