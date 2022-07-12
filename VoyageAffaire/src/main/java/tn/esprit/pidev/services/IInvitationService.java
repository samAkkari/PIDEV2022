package tn.esprit.pidev.services;

import java.util.List;

import tn.esprit.pidev.entities.Invitation;

public interface IInvitationService {

	Long ModifierInvitation(Invitation invitation);

	Long AjouterInvitation(Invitation invitation);

	void SupprimerInvitation(Long idInvitation);

	Invitation getInvitationById(Long idInvitation);

	List<Invitation> getInvitations();

}
