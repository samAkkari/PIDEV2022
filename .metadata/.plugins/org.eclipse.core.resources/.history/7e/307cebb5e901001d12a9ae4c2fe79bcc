package tn.esprit.pidev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Reaction;
import tn.esprit.pidev.repositories.ReactionRepository;

@Service
public class ReactionService implements IReactionService {

	
	@Autowired
	ReactionRepository  recationRepository;
	@Override
	public Long ModifierReaction(Reaction reaction) {
		recationRepository.save(reaction);
		return reaction.getIdreac();
	}
	

	@Override
	public Long AjouterReaction(Reaction reaction) {
		recationRepository.save(reaction);
		return reaction.getIdreac();
	}
	

	@Override
	public void SupprimerReaction(Long idReaction) {
		recationRepository.deleteById(idReaction);
		
	}

	@Override
	public Reaction getReactionById(Long idReaction) {
		return recationRepository.findById(idReaction).orElse(null);
	}
	
	

}
