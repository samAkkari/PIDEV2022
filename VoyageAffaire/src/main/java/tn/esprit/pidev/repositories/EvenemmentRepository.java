package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.pidev.entities.Evenemment;

@Repository
public interface EvenemmentRepository extends JpaRepository<Evenemment, Long>{

	
	
}
