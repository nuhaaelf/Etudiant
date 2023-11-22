package com.n7iila.etudiant.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString @Builder @Getter @Setter
public class Etudiant {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	   private Integer idEtudiant;
	   private String prenom;
	   private String nom;
	   private String email;

	}


