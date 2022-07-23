package tn.esprit.pidev.services;

import java.util.List;

import tn.esprit.pidev.entities.Employe;
import tn.esprit.pidev.entities.Voyage;


public interface IEmployeService {

	Long ModifierEmploye(Employe employe);

	Long AjouterEmploye(Employe employe);

	void SupprimerEmploye(Long idEmploye);

	Employe getEmployeById(Long idEmploye);
	
	void ajouterEmployeEtAffecterAvoyage(Employe employe, Long idVoyage);

	List<Employe> getEmployes();
}
