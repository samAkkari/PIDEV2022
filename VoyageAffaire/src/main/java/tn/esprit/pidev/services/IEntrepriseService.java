package tn.esprit.pidev.services;

import java.util.List;
import java.util.Map;

import tn.esprit.pidev.entities.Entreprise;

public interface IEntrepriseService {

	Long ModifierEntreprise(Entreprise entreprise);

	Long AjouterEntreprise(Entreprise entreprise);

	void SupprimerEntreprise(Long idEntreprise);

	Entreprise getEntrepriseById(Long idEntreprise);

	List<Entreprise> getEntreprises();
	
	List<Entreprise> findEntreprise(String matricule);

	int nombrePublicationParEntreprise(Long idEntreprise);
	
	List<Entreprise> findByMatrciule(String matrciule);
}
