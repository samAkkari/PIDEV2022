package tn.esprit.pidev.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.pidev.entities.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long>{
	Entreprise findByMatrciule(String matrciule);
}
