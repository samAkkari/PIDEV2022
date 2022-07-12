package tn.esprit.pidev.services;

import java.util.List;

import tn.esprit.pidev.entities.Commentaire;

public interface ICommentaireService {

	Long ModifierCommentaire(Commentaire commentaire);

	Long AjouterCommentaire(Commentaire commentaire);

	void SupprimerCommentaire(Long idcom);

	Commentaire getCommentaireById(Long idcom);

	List<Commentaire> getCommentaires();

}
