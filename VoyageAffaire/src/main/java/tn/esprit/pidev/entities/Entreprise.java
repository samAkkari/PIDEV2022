package tn.esprit.pidev.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Entreprise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEntreprise;
	private String NomEntreprise ;
	private String matrciule   ;
	private String tel;
	private String DomaineAcitivites;
	@Enumerated(EnumType.STRING)
	private ObjetVoyage ObjetVoyage;
	
	@OneToMany(mappedBy="entreprisepublication")
	@JsonIgnore
	private List<Publication>publications; 

	@OneToMany(mappedBy="entrepriseinvit")
	@JsonIgnore
	private List<Invitation>invitations; 
	
	

	@ManyToOne
	private Reclamation reclamEntreprise ;
	
	@ManyToMany
	private List<Evenemment> evenementsentreprise;
	
	//Constructeur
	
	public Entreprise(Long idEntreprise, String nomEntreprise, String matrciule, String tel, String domaineAcitivites,
			tn.esprit.pidev.entities.ObjetVoyage objetVoyage, List<Publication> publications,
			List<Invitation> invitations, Reclamation reclamEntreprise, List<Evenemment> evenementsentreprise) {
		super();
		this.idEntreprise = idEntreprise;
		this.NomEntreprise = nomEntreprise;
		this.matrciule = matrciule;
		this.tel = tel;
		this.DomaineAcitivites = domaineAcitivites;
		this.ObjetVoyage = objetVoyage;
		this.publications = publications;
		this.invitations = invitations;
		this.reclamEntreprise = reclamEntreprise;
		this.evenementsentreprise = evenementsentreprise;
	}

		
	

	public Entreprise(Long idEntreprise) {
		super();
		this.idEntreprise = idEntreprise;
	}
	
	


	//Getters and setters
	
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Reclamation getReclamEntreprise() {
		return reclamEntreprise;
	}

	public Long getIdEntreprise() {
		return idEntreprise;
	}


	public void setIdEntreprise(Long idEntreprise) {
		this.idEntreprise = idEntreprise;
	}


	public void setReclamEntreprise(Reclamation reclamEntreprise) {
		this.reclamEntreprise = reclamEntreprise;
	}

	public String getNomEntreprise() {
		return NomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		NomEntreprise = nomEntreprise;
	}

	public String getMatrciule() {
		return matrciule;
	}

	public void setMatrciule(String matrciule) {
		matrciule = matrciule;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDomaineAcitivites() {
		return DomaineAcitivites;
	}

	public void setDomaineAcitivites(String domaineAcitivites) {
		DomaineAcitivites = domaineAcitivites;
	}

	public ObjetVoyage getObjetVoyage() {
		return ObjetVoyage;
	}

	public void setObjetVoyage(ObjetVoyage objetVoyage) {
		ObjetVoyage = objetVoyage;
	}

	
	
	public List<Publication> getPublications() {
		return publications;
	}

	public void setPublications(List<Publication> publications) {
		this.publications = publications;
	}

	public List<Invitation> getInvitations() {
		return invitations;
	}

	public void setInvitations(List<Invitation> invitations) {
		this.invitations = invitations;
	}









	public List<Evenemment> getEvenementsentreprise() {
		return evenementsentreprise;
	}









	public void setEvenementsentreprise(List<Evenemment> evenementsentreprise) {
		this.evenementsentreprise = evenementsentreprise;
	}

	
	
	

}
