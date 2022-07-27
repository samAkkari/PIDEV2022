package tn.esprit.pidev.entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;






@Entity

public class Employe {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idEmploye;
private String nom;
private String tel;
private String login; 
private String mdp;
@Enumerated(EnumType.STRING)
private Profession profession;

@ManyToMany
List<Voyage>voyages;

@OneToMany(mappedBy="empcommentaire")
@JsonIgnore
List<Commentaire> commentaires;


@OneToMany(mappedBy="employepublication")
@JsonIgnore
List<Publication>publications; 

@ManyToOne
private Invitation invitemp;

@ManyToMany
List<Evenemment>evenementsemp;










public Employe() {
	super();
	// TODO Auto-generated constructor stub
}



public Employe(Long idEmploye, String nom, String tel, String login, String mdp, Profession profession,
		List<Voyage> voyages, List<Publication> publications, Invitation invitemp, List<Reclamation> reclamEmploye,
		List<Commentaire> commentaires) {
	super();
	this.idEmploye = idEmploye;
	this.nom = nom;
	this.tel = tel;
	this.login = login;
	this.mdp = mdp;
	this.profession = profession;
	this.voyages = voyages;
	this.publications = publications;
	this.invitemp = invitemp;
	
	this.commentaires = commentaires;
	
	
	
}



public Long getIdEmploye() {
	return idEmploye;
}



public void setIdEmploye(Long idEmploye) {
	this.idEmploye = idEmploye;
}



public String getNom() {
	return nom;
}



public void setNom(String nom) {
	this.nom = nom;
}



public String getTel() {
	return tel;
}



public void setTel(String tel) {
	this.tel = tel;
}



public String getLogin() {
	return login;
}



public void setLogin(String login) {
	this.login = login;
}



public String getMdp() {
	return mdp;
}



public void setMdp(String mdp) {
	this.mdp = mdp;
}



public Profession getProfession() {
	return profession;
}



public void setProfession(Profession profession) {
	this.profession = profession;
}



public List<Voyage> getVoyages() {
	return voyages;
}



public void setVoyages(List<Voyage> voyages) {
	this.voyages = voyages;
}



public List<Publication> getPublications() {
	return publications;
}



public void setPublications(List<Publication> publications) {
	this.publications = publications;
}



public Invitation getInvitemp() {
	return invitemp;
}



public void setInvitemp(Invitation invitemp) {
	this.invitemp = invitemp;
}







public List<Commentaire> getCommentaires() {
	return commentaires;
}



public void setCommentaires(List<Commentaire> commentaires) {
	this.commentaires = commentaires;
}



public List<Evenemment> getEvenementsemp() {
	return evenementsemp;
}



public void setEvenementsemp(List<Evenemment> evenementsemp) {
	this.evenementsemp = evenementsemp;
}



@Override
public String toString() {
	return "Employe [idEmploye=" + idEmploye + ", nom=" + nom + ", tel=" + tel + ", login=" + login + ", mdp=" + mdp
			+ ", profession=" + profession + ", voyages=" + voyages + ", commentaires=" + commentaires
			+ ", publications=" + publications + ", invitemp=" + invitemp + ", evenementsemp=" + evenementsemp + "]";
}





}