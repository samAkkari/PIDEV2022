package tn.esprit.pidev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.pidev.entities.Entreprise;
import tn.esprit.pidev.entities.Invitation;
import tn.esprit.pidev.services.IInvitationService;

@RequestMapping("/invitation")
@Api("Gestion des invitations")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InvitationRestController {

	@Autowired
	IInvitationService invitationService;

	@ApiOperation(value = "Ajouter une invitation")
	@PostMapping("/addInvitation")
	@ResponseBody
	public Invitation addInvitation(@RequestBody Invitation invitation) {
		invitationService.AjouterInvitation(invitation);
		return invitation;
	}

	@ApiOperation(value = "Modifier une invitation")
	@PutMapping("/modifierInvitation")
	@ResponseBody
	public Invitation updateInvitation(@RequestBody Invitation invitation) {
		invitationService.ModifierInvitation(invitation);
		return invitation;
	}

	@ApiOperation(value = "Supprimer une invitation")
	@DeleteMapping("/supprimerInvitation/{IdInvitationl}")
	@ResponseBody
	public void deleteInvitation(@PathVariable("IdInvitationl") Long IdInvitationl) {
		invitationService.SupprimerInvitation(IdInvitationl);
	}
	
	@ApiOperation(value = "Recupere une invitation")
	@GetMapping("/recupererInvitation/{IdInvitationl}")
	@ResponseBody
	public Invitation getInvitation(@PathVariable("IdInvitationl") Long IdInvitationl) {
		return invitationService.getInvitationById(IdInvitationl);
	}

	@ApiOperation(value = "Liste des invitations")
	@GetMapping("/listInvitations")
	@ResponseBody
	public List<Invitation> listeInvitations() {
		return invitationService.getInvitations();
	}
}
