package tn.esprit.pidev.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.pidev.entities.Voyage;

public interface VoyageRepository extends JpaRepository<Voyage, Long> {
	public List<Voyage> findByDestinisation(String destinisation);
}
