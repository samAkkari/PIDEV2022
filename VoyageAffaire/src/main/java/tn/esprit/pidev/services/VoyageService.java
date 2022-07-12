package tn.esprit.pidev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Voyage;
import tn.esprit.pidev.repositories.VoyageRepository;



@Service
public class VoyageService implements IVoyageService  {

	@Autowired
	VoyageRepository voyageRepository;
	
	@Override
	public Long ModifierVoyage(Voyage voyage) {
		voyageRepository.save(voyage);
		return voyage.getIdVoyage();
	}

	@Override
	public Long AjouterVoyage(Voyage voyage) {
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

}
