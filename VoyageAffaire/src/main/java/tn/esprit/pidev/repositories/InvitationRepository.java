package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.pidev.entities.Invitation;

public interface InvitationRepository extends JpaRepository<Invitation, Long> {

}
