package tn.esprit.pidev.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reclamation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReclamation;
	private String contenue;

	@OneToMany
	private List<Employe> employes;

	@OneToMany
	private List<Entreprise> entreprise;

	// Const

	public Reclamation(Long idReclamation, String contenue, List<Employe> employes, List<Entreprise> entreprise) {
		super();
		this.idReclamation = idReclamation;
		this.contenue = contenue;
		this.employes = employes;
		this.entreprise = entreprise;
	}

	public Reclamation() {
		super();
	}

	// Getters and Setters

	public Long getIdReclamation() {
		return idReclamation;
	}

	public void setIdReclamation(Long idReclamation) {
		this.idReclamation = idReclamation;
	}

	public String getContenue() {
		return contenue;
	}

	public void setContenue(String contenue) {
		this.contenue = contenue;
	}

	public List<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	public List<Entreprise> getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(List<Entreprise> entreprise) {
		this.entreprise = entreprise;
	}

}
