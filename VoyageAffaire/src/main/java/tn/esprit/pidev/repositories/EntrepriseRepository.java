package tn.esprit.pidev.repositories;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tn.esprit.pidev.entities.Entreprise;

@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long>{
	
}
