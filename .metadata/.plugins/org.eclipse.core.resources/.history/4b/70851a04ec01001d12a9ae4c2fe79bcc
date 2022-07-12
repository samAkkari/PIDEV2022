package tn.esprit.pidev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Commentaire;
import tn.esprit.pidev.repositories.CommentaireRepository;


@Service
public class CommentaireService implements ICommentaireService{

	
	@Autowired
	CommentaireRepository commentaireRepository;
	
	@Override
	public Long ModifierCommentaire(Commentaire commentaire) {
		commentaireRepository.save(commentaire);
		return commentaire.getIdcom();
	}

	@Override
	public Long AjouterCommentaire(Commentaire commentaire) {
		commentaireRepository.save(commentaire);
		return commentaire.getIdcom();
	}

	@Override
	public void SupprimerCommentaire(Long idcom) {
		commentaireRepository.deleteById(idcom);
		
	}

	@Override
	public Commentaire getCommentaireById(Long idcom) {
		return commentaireRepository.findById(idcom).orElse(null);
	}
	
	
}
