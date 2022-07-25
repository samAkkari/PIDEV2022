package tn.esprit.pidev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.pidev.entities.Commentaire;
import tn.esprit.pidev.services.ICommentaireService;
@RequestMapping("/commentaire")
@Api("Gestion des Commentaires")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommenatireRestController {

	
	@Autowired
	ICommentaireService commentaireService;
	
	@ApiOperation(value = "Ajouter un commentaire")
	@PostMapping("/addCommentaire")
	@ResponseBody
	public Commentaire addCommentaire(@RequestBody Commentaire commentaire) {
		commentaireService.AjouterCommentaire(commentaire);
		return commentaire;
	}
	@ApiOperation(value = "Modifier un commentaire")
	@PutMapping("/modifierCommentaire")
	@ResponseBody
	public Commentaire updateCommentaire(@RequestBody Commentaire commentaire) {
		commentaireService.ModifierCommentaire(commentaire);
		return commentaire;
	}
	
	@ApiOperation(value = "Supprimer un commentaire")
	@DeleteMapping("/supprimerCommentaire/{IdCommentaire}")
	@ResponseBody
	public void deleteCommentaire(@PathVariable("idcom") Long idcom) {
		commentaireService.SupprimerCommentaire(idcom);
	}
	
	
}
