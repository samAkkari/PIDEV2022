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
import tn.esprit.pidev.entities.Publication;
import tn.esprit.pidev.services.IPublicationService;

@RequestMapping("/Publication")
@Api("Gestion des Publications")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PublicationRestController {

	@Autowired
	IPublicationService publicationService;

	@ApiOperation(value = "Ajouter une publication")
	@PostMapping("/addPublication")
	@ResponseBody
	public Publication addInvitation(@RequestBody Publication publication) {
		publicationService.AjouterPublication(publication);
		return publication;
	}

	@ApiOperation(value = "Modifier une publication")
	@PutMapping("/modifierInvitation")
	@ResponseBody
	public Publication updateInvitation(@RequestBody Publication publication) {
		publicationService.ModifierPublication(publication);
		return publication;
	}

	@ApiOperation(value = "Supprimer une publication")
	@DeleteMapping("/supprimerPublication/{IdPublicationl}")
	@ResponseBody
	public void deleteInvitation(@PathVariable("IdPublicationl") Long IdPublicationl) {
		publicationService.SupprimerPublication(IdPublicationl);
	}
	
	@ApiOperation(value = "Liste des publications")
	@GetMapping("/listePublications")
	@ResponseBody
	public List<Publication> listePublications() {
		return publicationService.getPublications();
	}
}
