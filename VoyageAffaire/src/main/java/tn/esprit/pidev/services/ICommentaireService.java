package tn.esprit.pidev.services;

import tn.esprit.pidev.entities.Commentaire;


public interface ICommentaireService {

	Long ModifierCommentaire(Commentaire commentaire);
	Long AjouterCommentaire(Commentaire commentaire);
	void SupprimerCommentaire(Long idcom);
	Commentaire getCommentaireById(Long idcom);
	
}
