package tn.esprit.pidev.services;

import tn.esprit.pidev.entities.Reaction;

public interface IReactionService {

	Long ModifierReaction(Reaction reaction);
	Long AjouterReaction(Reaction reaction);
	void SupprimerReaction(Long idReaction);
	Reaction getReactionById(Long idReaction);
	
}
