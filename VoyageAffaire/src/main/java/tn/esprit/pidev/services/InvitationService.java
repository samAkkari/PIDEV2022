package tn.esprit.pidev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Invitation;
import tn.esprit.pidev.repositories.InvitationRepository;

@Service
public class InvitationService implements IInvitationService {

	@Autowired
	InvitationRepository invitationRepository;

	@Override
	public Long ModifierInvitation(Invitation invitation) {
		invitationRepository.save(invitation);
		return invitation.getIdInvitation();
	}

	@Override
	public Long AjouterInvitation(Invitation invitation) {
		invitationRepository.save(invitation);
		return invitation.getIdInvitation();
	}

	@Override
	public void SupprimerInvitation(Long idInvitation) {
		invitationRepository.deleteById(idInvitation);

	}

	@Override
	public Invitation getInvitationById(Long idInvitation) {
		return invitationRepository.findById(idInvitation).orElse(null);
	}

	@Override
	public List<Invitation> getInvitations() {
		return invitationRepository.findAll();
	}

}
