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

import tn.esprit.pidev.entities.Entreprise;
import tn.esprit.pidev.services.IEntrepriseService;

@RequestMapping("/entreprise")
@RestController
public class EntrepriseRestController {

	@Autowired
	IEntrepriseService entrepriseService;
	
	

	@PostMapping("/addEntreprise")
	@ResponseBody
	public Entreprise addHotel(@RequestBody Entreprise entreprise) {
		entrepriseService.AjouterEntreprise(entreprise);
		return entreprise;
	}

	@PutMapping("/modifierEntreprise")
	@ResponseBody
	public Entreprise updatEntreprise(@RequestBody Entreprise entreprise) {
		entrepriseService.ModifierEntreprise(entreprise);
		return entreprise;
	}
	

	@DeleteMapping("/supprimerEntreprise/{IdEntreprise}")
	@ResponseBody
	public void deleteEntreprise(@PathVariable("IdEntreprise") Long IdEntreprise) {
		entrepriseService.SupprimerEntreprise(IdEntreprise);
	}
}
