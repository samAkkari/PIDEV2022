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
import tn.esprit.pidev.entities.Employe;

import tn.esprit.pidev.services.IEmployeService;
import tn.esprit.pidev.services.IVoyageService;

@RequestMapping("/employe")
@Api("Gestion des Employes")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeRestController {

	@Autowired
	IEmployeService employeService;
	
	@Autowired
	IVoyageService voyageService;

	@ApiOperation(value = "Ajouter un employé")
	@PostMapping("/addEmploye")
	@ResponseBody
	public Employe addEmploye(@RequestBody Employe emp) {
		employeService.AjouterEmploye(emp);
		return emp;
	}

	@ApiOperation(value = "Modifier un employé")
	@PutMapping("/modifierEmploye")
	@ResponseBody
	public Employe updateemp(@RequestBody Employe employe) {
		employeService.ModifierEmploye(employe);
		return employe;
	}

	@ApiOperation(value = "Supprimer un employé")
	@DeleteMapping("/supprimerEmploye/{IdEmploye}")
	@ResponseBody
	public void deleteEmploye(@PathVariable("IdEmploye") Long IdEmploye) {
		employeService.SupprimerEmploye(IdEmploye);
	}
	
	@PostMapping("/ajouter-employe/{id-voyage}")
	@ResponseBody
	public void EmployerVoyage(@RequestBody Employe employe,@PathVariable("id-voyage") Long idVoyage) {
		employeService.ajouterEmployeEtAffecterAvoyage(employe,idVoyage);

}}
