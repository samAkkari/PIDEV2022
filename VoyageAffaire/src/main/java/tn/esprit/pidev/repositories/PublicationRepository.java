package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.pidev.entities.Publication;

public interface PublicationRepository extends JpaRepository<Publication, Long> {

}
