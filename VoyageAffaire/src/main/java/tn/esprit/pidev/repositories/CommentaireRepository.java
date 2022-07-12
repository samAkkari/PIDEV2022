package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.pidev.entities.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {

}
