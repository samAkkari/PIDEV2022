package tn.esprit.pidev.services;

import java.util.List;

import tn.esprit.pidev.entities.Reclamation;

public interface IReclamationService {

	Long ModifierReclamation(Reclamation reclamation);

	Long AjouterReclamation(Reclamation reclamation);

	void SupprimerReclamation(Long idReclamation);

	Reclamation getReclamationById(Long idReclamation);

	List<Reclamation> getReclamations();

}
