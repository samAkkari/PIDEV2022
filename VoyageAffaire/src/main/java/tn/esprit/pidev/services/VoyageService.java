package tn.esprit.pidev.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Employe;
import tn.esprit.pidev.entities.ObjetVoyage;
import tn.esprit.pidev.entities.Voyage;
import tn.esprit.pidev.repositories.VoyageRepository;


@Service
public class VoyageService implements IVoyageService {

	
	@Autowired
	VoyageRepository voyageRepository;
	Logger logger = LoggerFactory.getLogger(VoyageService.class);

	@Override
	public Long ModifierVoyage(Voyage voyage) {
		voyageRepository.save(voyage);
		return voyage.getIdVoyage();
	}

	@Override
	public Long AjouterVoyage(Voyage voyage) {
		List<Employe> nomemploye = new ArrayList<>();
		
		voyageRepository.findAll().forEach(x -> {
			logger.info("voyage : " + x);
			if (    voyage.getDestinisation().equals(x.getDestinisation()) && 
					ObjetVoyage.visite_entreprise.equals(voyage.getObjet_voyage())  &&
					(voyage.getDateDep().before(x.getDateRet())  ||
					x.getDateDep().before(voyage.getDateRet())) )  {
					
					nomemploye.addAll(x.getEmployes());
					
					}
				});
		logger.info("employé notifier " + nomemploye);

		voyageRepository.save(voyage);
		
		return voyage.getIdVoyage();
	}

	@Override
	public void SupprimerVoyage(Long idVoyage) {
		voyageRepository.deleteById(idVoyage);

	}

	@Override
	public Voyage getVoyageById(Long idVoyage) {
		return voyageRepository.findById(idVoyage).orElse(null);
	}

	@Override
	public List<Voyage> getVoyages() {
		return voyageRepository.findAll();
	}
}
