package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.pidev.entities.Reaction;

public interface ReactionRepository extends JpaRepository<Reaction, Long> {

}
