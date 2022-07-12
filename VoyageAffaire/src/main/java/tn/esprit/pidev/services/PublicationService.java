package tn.esprit.pidev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Publication;
import tn.esprit.pidev.repositories.PublicationRepository;


@Service
public class PublicationService implements IPublicationService{

	
	@Autowired
	PublicationRepository publicationRepository;
	
	@Override
	public Long ModifierPublication(Publication publication) {
		publicationRepository.save(publication);
		return publication.getIdPublication();
	}

	@Override
	public Long AjouterPublication(Publication publication) {
		publicationRepository.save(publication);
		return publication.getIdPublication();
	}

	@Override
	public Publication getPublicationById(Long idPublication) {
		return publicationRepository.findById(idPublication).orElse(null);
	}
	
	@Override
	public void SupprimerPublication(Long idPublication) {
		publicationRepository.deleteById(idPublication);
		
	}

}
