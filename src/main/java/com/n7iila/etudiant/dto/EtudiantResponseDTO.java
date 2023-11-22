package com.n7iila.etudiant.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class EtudiantResponseDTO {
	
	   private Integer idEtudiant;
	   private String email;
		}

