package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.pidev.entities.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long>{

}
