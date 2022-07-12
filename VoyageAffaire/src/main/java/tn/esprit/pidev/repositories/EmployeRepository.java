package tn.esprit.pidev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.pidev.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
