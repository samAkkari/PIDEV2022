package tn.esprit.pidev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Reclamation;
import tn.esprit.pidev.repositories.ReclamationRepository;

@Service
public class ReclamationService implements IReclamationService {

	@Autowired
	ReclamationRepository reclamationRespository;

	@Override
	public Long ModifierReclamation(Reclamation reclamation) {
		reclamationRespository.save(reclamation);
		return reclamation.getIdReclamation();
	}

	@Override
	public Long AjouterReclamation(Reclamation reclamation) {
		reclamationRespository.save(reclamation);
		return reclamation.getIdReclamation();
	}

	@Override
	public void SupprimerReclamation(Long idReclamation) {
		reclamationRespository.deleteById(idReclamation);

	}

	@Override
	public Reclamation getReclamationById(Long idReclamation) {
		return reclamationRespository.findById(idReclamation).orElse(null);
	}

	@Override
	public List<Reclamation> getReclamations() {
		return reclamationRespository.findAll();
	}

	@Scheduled(cron = "*/60 * * * * *")
	public List<Reclamation> AffichageRclamationsDeJour() {
		return reclamationRespository.findAll();

	}
}
