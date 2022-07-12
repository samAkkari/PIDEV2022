package tn.esprit.pidev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import tn.esprit.pidev.entities.Reclamation;
import tn.esprit.pidev.services.IReclamationService;

@RequestMapping("/Reclamation")
@Api("Gestion des Reclamations")
@RestController
public class ReclamationRestController {

	@Autowired
	IReclamationService reclamationService;

	@GetMapping("/listeReclamations")
	@ResponseBody
	public List<Reclamation> listeCours() {
		return reclamationService.getReclamations();
	}

	@ApiOperation(value = "Ajouter une Reclamation")
	@PostMapping("/addReclamation")
	@ResponseBody
	public Reclamation addReclamation(@RequestBody Reclamation reclamation) {
		reclamationService.AjouterReclamation(reclamation);
		return reclamation;
	}

	@ApiOperation(value = "Motifier une Reclamation")
	@PutMapping("/modifierReclamation")
	@ResponseBody
	public Reclamation updatReclamation(@RequestBody Reclamation reclamation) {
		reclamationService.ModifierReclamation(reclamation);
		return reclamation;
	}

	@ApiOperation(value = "Supprimer une Reclamation")
	@DeleteMapping("/supprimerReclamation/{IdReclamation}")
	@ResponseBody
	public void deleteReclamation(@PathVariable("IdReclamation") Long IdReclamation) {
		reclamationService.SupprimerReclamation(IdReclamation);
	}
}
