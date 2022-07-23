package tn.esprit.pidev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.pidev.entities.Employe;
import tn.esprit.pidev.entities.Evenemment;
import tn.esprit.pidev.repositories.EmployeRepository;
import tn.esprit.pidev.repositories.EvenemmentRepository;

@Service
public class EvenemmentService implements IEvenemmentService {
	
	@Autowired
	EvenemmentRepository evenemmentRepository;
	@Autowired
	EmployeRepository employeRepository;
	
	@Override
	public Evenemment ajoutEvenement() {
		
		List<Employe> emp = employeRepository.findAll();
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
