package tn.esprit.pidev.entities;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Voyage  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdVoyage;
	private String Depart; 
	private String Destinisation;
	private String privateDuree;
	private Date DateVoyage;
	private String Objet_voyage;
	
	@ManyToOne
	private Hotel hotel;
	
	@ManyToMany(mappedBy="voyages")
	private List <Employe>employes;

	
	//Const
	
	
	public Voyage(Long idVoyage, String depart, String destinisation, String privateDuree, Date dateVoyage,
			String objet_voyage, Hotel hotel, List<Employe> employes) {
		super();
		IdVoyage = idVoyage;
		Depart = depart;
		Destinisation = destinisation;
		this.privateDuree = privateDuree;
		DateVoyage = dateVoyage;
		Objet_voyage = objet_voyage;
		this.hotel = hotel;
		this.employes = employes;
	}


	public Voyage() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	//Getters and setters
	

	



	public String getDepart() {
		return Depart;
	}

	

	public Long getIdVoyage() {
		return IdVoyage;
	}




	public void setIdVoyage(Long idVoyage) {
		IdVoyage = idVoyage;
	}




	public void setDepart(String depart) {
		Depart = depart;
	}

	public String getDestinisation() {
		return Destinisation;
	}

	public void setDestinisation(String destinisation) {
		Destinisation = destinisation;
	}

	public String getPrivateDuree() {
		return privateDuree;
	}

	public void setPrivateDuree(String privateDuree) {
		this.privateDuree = privateDuree;
	}

	public Date getDateVoyage() {
		return DateVoyage;
	}

	public void setDateVoyage(Date dateVoyage) {
		DateVoyage = dateVoyage;
	}

	public String getObjet_voyage() {
		return Objet_voyage;
	}

	public void setObjet_voyage(String objet_voyage) {
		Objet_voyage = objet_voyage;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
		
		
	}




	public List<Employe> getEmployes() {
		return employes;
	}




	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}
	
	

	
	
	

	
	

	
	
	
	
}
