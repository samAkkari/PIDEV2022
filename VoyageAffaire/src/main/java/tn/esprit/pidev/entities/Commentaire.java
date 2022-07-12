package tn.esprit.pidev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long idcom; 
	private String contenu;
	@ManyToOne
	private Publication pubcomm;
	@ManyToOne
	private Employe empcommentaire;

	
	
	
	public Commentaire() {
		super();
	}





	public Commentaire(Long idcom, Publication pubcomm, Employe empcommentaire, String contenu) {
		super();
		this.idcom = idcom;
		this.contenu = contenu;
		this.pubcomm = pubcomm;
		this.empcommentaire = empcommentaire;
	}
	
	
	
	

	public Long getIdcom() {
		return idcom;
	}

	public void setIdcom(Long idcom) {
		this.idcom = idcom;
	}

	public Publication getPubcomm() {
		return pubcomm;
	}

	public void setPubcomm(Publication pubcomm) {
		this.pubcomm = pubcomm;
	}

	public Employe getEmpcommentaire() {
		return empcommentaire;
	}

	public void setEmpcommentaire(Employe empcommentaire) {
		this.empcommentaire = empcommentaire;
	}





	public String getContenu() {
		return contenu;
	}





	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	
	

}
