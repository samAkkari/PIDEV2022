package tn.esprit.pidev.services;

import java.util.List;

import tn.esprit.pidev.entities.Voyage;

public interface IVoyageService {

	Long ModifierVoyage(Voyage voyage);
	Long AjouterVoyage(Voyage voyage);
	void SupprimerVoyage(Long idVoyage);
	Voyage getVoyageById(Long idVoyage);
	List<Voyage> getVoyages() ;
}
