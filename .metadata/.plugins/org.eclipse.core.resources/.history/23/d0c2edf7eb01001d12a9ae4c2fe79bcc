package tn.esprit.pidev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Employe;
import tn.esprit.pidev.repositories.EmployeRepository;

@Service
public class EmployeService implements IEmployeService {

	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public Long ModifierEmploye(Employe employe) {
		employeRepository.save(employe);
		return employe.getIdEmploye();
	}

	@Override
	public Long AjouterEmploye(Employe employe) {
		employeRepository.save(employe);
		return employe.getIdEmploye();
	}

	@Override
	public void SupprimerEmploye(Long idEmploye) {
		employeRepository.deleteById(idEmploye);
		
	}

	@Override
	public Employe getEmployeById(Long idEmploye) {
		return employeRepository.findById(idEmploye).orElse(null);
	}
	
	
}
	
