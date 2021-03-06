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
import tn.esprit.pidev.entities.Entreprise;
import tn.esprit.pidev.services.IEntrepriseService;

@RequestMapping("/entreprise")
@Api("Gestion des entreprises")
@RestController
public class EntrepriseRestController {

	@Autowired
	IEntrepriseService entrepriseService;

	@ApiOperation(value = "Liste des entreprises")
	@GetMapping("/listeEntreprises")
	@ResponseBody
	public List<Entreprise> listeCours() {
		return entrepriseService.getEntreprises();
	}

	@ApiOperation(value = "Ajouter une entreprise")
	@PostMapping("/addEntreprise")
	@ResponseBody
	public Entreprise addReclamation(@RequestBody Entreprise entreprise) {
		entrepriseService.AjouterEntreprise(entreprise);
		return entreprise;
	}

	@ApiOperation(value = "Motifier une entreprise")
	@PutMapping("/modifierEntreprise")
	@ResponseBody
	public Entreprise updatEntreprise(@RequestBody Entreprise entreprise) {
		entrepriseService.ModifierEntreprise(entreprise);
		return entreprise;
	}

	@ApiOperation(value = "Supprimer une entreprise")
	@DeleteMapping("/supprimerEntreprise/{IdEntreprise}")
	@ResponseBody
	public void deleteEntreprise(@PathVariable("IdEntreprise") Long IdEntreprise) {
		entrepriseService.SupprimerEntreprise(IdEntreprise);
	}
}
