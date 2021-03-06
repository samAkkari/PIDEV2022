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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import tn.esprit.pidev.entities.Reaction;
import tn.esprit.pidev.services.IReactionService;

@RequestMapping("/reaction")
@Api("Gestion des Réactions")
@RestController
public class ReactionRestController {

	@Autowired
	IReactionService reactionService;

	@ApiOperation(value = "Ajouter une réaction")
	@PostMapping("/addRecation")
	@ResponseBody
	public Reaction addVoyage(@RequestBody Reaction reaction) {
		reactionService.AjouterReaction(reaction);
		return reaction;
	}

	@ApiOperation(value = "Modifier une réaction")
	@PutMapping("/modifierReaction")
	@ResponseBody
	public Reaction updaterecation(@RequestBody Reaction reaction) {
		reactionService.ModifierReaction(reaction);
		return reaction;
	}

	@ApiOperation(value = "Supprimer une réaction")
	@DeleteMapping("/supprimerReaction/{IdReaction}")
	@ResponseBody
	public void deleteEmploye(@PathVariable("IdReaction") Long IdReaction) {
		reactionService.SupprimerReaction(IdReaction);
	}

}
