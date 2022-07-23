package tn.esprit.pidev.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.lang.NonNull;
@Entity
public class Evenemment {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvenement;
	@NonNull private String nomEvenement, libelle,description,localisation;
	private int nbreIntervenant=0;
	@Enumerated(EnumType.STRING)
	private Domaine domaine;
	//@Temporal (TemporalType.DATE)
	@NonNull private java.util.Date datedebEvenement;
	//@Temporal (TemporalType.DATE)
	@NonNull private java.util.Date datefinEvenement;
	
@ManyToMany(mappedBy="evenementsemp")
private List<Employe>empolyes;

@ManyToMany(mappedBy="evenementsentreprise")
private List<Entreprise>entreprise;

public int getIdEvenement() {
	return idEvenement;
}

public void setIdEvenement(int idEvenement) {
	this.idEvenement = idEvenement;
}

public String getNomEvenement() {
	return nomEvenement;
}

public void setNomEvenement(String nomEvenement) {
	this.nomEvenement = nomEvenement;
}

public String getLibelle() {
	return libelle;
}

public void setLibelle(String libelle) {
	this.libelle = libelle;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getLocalisation() {
	return localisation;
}

public void setLocalisation(String localisation) {
	this.localisation = localisation;
}

public int getNbreIntervenant() {
	return nbreIntervenant;
}

public void setNbreIntervenant(int nbreIntervenant) {
	this.nbreIntervenant = nbreIntervenant;
}

public Domaine getDomaine() {
	return domaine;
}

public void setDomaine(Domaine domaine) {
	this.domaine = domaine;
}

public java.util.Date getDatedebEvenement() {
	return datedebEvenement;
}

public void setDatedebEvenement(java.util.Date datedebEvenement) {
	this.datedebEvenement = datedebEvenement;
}

public java.util.Date getDatefinEvenement() {
	return datefinEvenement;
}

public void setDatefinEvenement(java.util.Date datefinEvenement) {
	this.datefinEvenement = datefinEvenement;
}

public List<Employe> getEmpolyes() {
	return empolyes;
}

public void setEmpolyes(List<Employe> empolyes) {
	this.empolyes = empolyes;
}

public List<Entreprise> getEntreprise() {
	return entreprise;
}

public void setEntreprise(List<Entreprise> entreprise) {
	this.entreprise = entreprise;
}

public Evenemment() {
	super();
	// TODO Auto-generated constructor stub
}




}