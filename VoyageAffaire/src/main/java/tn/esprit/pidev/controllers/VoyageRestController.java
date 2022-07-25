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
import tn.esprit.pidev.entities.Voyage;
import tn.esprit.pidev.services.IVoyageService;

@RequestMapping("/voyage")
@Api("Gestion des Voyages")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class VoyageRestController {

	@Autowired
	IVoyageService voyageService;

	@ApiOperation(value = "Ajouter un voyage")
	@PostMapping("/addvoyage")
	@ResponseBody
	public Voyage addVoyage(@RequestBody Voyage voy) {
		voyageService.AjouterVoyage(voy);
		return voy;
	}

	@ApiOperation(value = "Modifier un voyage")
	@PutMapping("/modifierVoyage")
	@ResponseBody
	public Voyage updateemp(@RequestBody Voyage voyage) {
		voyageService.ModifierVoyage(voyage);
		return voyage;
	}

	@ApiOperation(value = "Supprimer un voyage")
	@DeleteMapping("/supprimerVoyage/{IdVoyage}")
	@ResponseBody
	public void deleteEmploye(@PathVariable("IdVoyage") Long IdEmploye) {
		voyageService.SupprimerVoyage(IdEmploye);
	}
}
