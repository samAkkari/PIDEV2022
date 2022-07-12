package tn.esprit.pidev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Publication;
import tn.esprit.pidev.repositories.PublicationRepository;

@Service
public class PublicationService implements IPublicationService {

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

	@Override
	public List<Publication> getPublications() {
		return publicationRepository.findAll();
	}

	@Scheduled(cron = "*/60 * * * * *")
	public List<Publication> AffichagePublicationDeJour() {
		return publicationRepository.findAll();

	}
}
