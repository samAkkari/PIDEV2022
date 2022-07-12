package tn.esprit.pidev.entities;
import java.util.List;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Invitation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdInvitation;
	private String Titre;
	private String DateInvit; 
	private String Mail;
	
	@OneToMany(mappedBy="invitemp")	
	private List<Employe>employes;
	
	@ManyToOne
	private Entreprise entrepriseinvit;
	
	//Constructeur
	public Invitation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Invitation(Long idInvitation, String titre, String dateInvit, String mail, List<Employe> employes,
			Entreprise entrepriseinvit) {
		super();
		IdInvitation = idInvitation;
		Titre = titre;
		DateInvit = dateInvit;
		Mail = mail;
		this.employes = employes;
		this.entrepriseinvit = entrepriseinvit;
	}



	//Getters and setters 
	
	public Entreprise getEntrepriseinvit() {
		return entrepriseinvit;
	}
	
	
	public void setEntrepriseinvit(Entreprise entrepriseinvit) {
		this.entrepriseinvit = entrepriseinvit;
	}
	
	
	public List<Employe> getEmployes() {
			return employes;
		}

	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}

	

	public Long getIdInvitation() {
		return IdInvitation;
	}


	public void setIdInvitation(Long idInvitation) {
		IdInvitation = idInvitation;
	}


	public String getTitre() {
		return Titre;
	}


	public void setTitre(String titre) {
		Titre = titre;
	}


	public String getDateInvit() {
		return DateInvit;
	}


	public void setDateInvit(String dateInvit) {
		DateInvit = dateInvit;
	}


	public String getMail() {
		return Mail;
	}


	public void setMail(String mail) {
		Mail = mail;
	}


	



	
	
}
