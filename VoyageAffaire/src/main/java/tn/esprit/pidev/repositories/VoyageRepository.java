package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.pidev.entities.Voyage;

public interface VoyageRepository extends JpaRepository<Voyage, Long> {

}
