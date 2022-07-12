package tn.esprit.pidev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.pidev.entities.Invitation;
import tn.esprit.pidev.services.IInvitationService;

@RequestMapping("/invitation")
@RestController
public class InvitationRestController {

	@Autowired
	IInvitationService invitationService;

	
	
	@PostMapping("/addInvitation")
	@ResponseBody
	public Invitation addInvitation(@RequestBody Invitation invitation) {
		invitationService.AjouterInvitation(invitation);
		return invitation;
	}

	@PutMapping("/modifierInvitation")
	@ResponseBody
	public Invitation updateInvitation(@RequestBody Invitation invitation) {
		invitationService.ModifierInvitation(invitation);
		return invitation;
	}
	

	@DeleteMapping("/supprimerInvitation/{IdInvitationl}")
	@ResponseBody
	public void deleteInvitation(@PathVariable("IdInvitationl") Long IdInvitationl) {
		invitationService.SupprimerInvitation(IdInvitationl);
	}
	
	
}
