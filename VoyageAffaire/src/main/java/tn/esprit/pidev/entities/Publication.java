package tn.esprit.pidev.entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Publication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPublication;
	private String contenue;
	

	@OneToMany(mappedBy="pubreac")	
	private List<Reaction>reac;
	
	@OneToMany(mappedBy="pubcomm")	
	private List<Commentaire>comm;
	
	

	@ManyToOne
	private Employe employepublication;
	
	@ManyToOne
	private Entreprise entreprisepublication;
	//const
	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

	public Publication(Long idPublication, String contenue, List<Reaction> reac, List<Commentaire> comm,
			Employe employepublication, Entreprise entreprisepublication) {
		super();
		this.idPublication = idPublication;
		this.contenue = contenue;
		this.reac = reac;
		this.comm = comm;
		this.employepublication = employepublication;
		this.entreprisepublication = entreprisepublication;
	}




//Getters and setters

	public Long getIdPublication() {
		return idPublication;
	}






	public void setIdPublication(Long idPublication) {
		this.idPublication = idPublication;
	}






	public String getContenue() {
		return contenue;
	}

	

	public void setContenue(String contenue) {
		this.contenue = contenue;
	}

	public List<Reaction> getReac() {
		return reac;
	}

	public void setReac(List<Reaction> reac) {
		this.reac = reac;
	}

	public List<Commentaire> getComm() {
		return comm;
	}

	public void setComm(List<Commentaire> comm) {
		this.comm = comm;
	}

	public Employe getEmployepublication() {
		return employepublication;
	}

	public void setEmployepublication(Employe employepublication) {
		this.employepublication = employepublication;
	}

	public Entreprise getEntreprisepublication() {
		return entreprisepublication;
	}

	public void setEntreprisepublication(Entreprise entreprisepublication) {
		this.entreprisepublication = entreprisepublication;
	}


	
}
