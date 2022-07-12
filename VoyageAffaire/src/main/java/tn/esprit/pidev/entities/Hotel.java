package tn.esprit.pidev.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdHotel;
	private String NomHotel; 
	private String Localisation;
	private String Note;
	private String Capacite; 
	@OneToMany (mappedBy ="hotel")
	private List <Voyage> Voyages;
	
	//Constructeur
	
	
	public Hotel(Long idHotel, String nomHotel, String localisation, String note, String capacite,
			List<Voyage> voyages) {
		super();
		IdHotel = idHotel;
		NomHotel = nomHotel;
		Localisation = localisation;
		Note = note;
		Capacite = capacite;
		Voyages = voyages;
	}	
	
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Getters and setters


	public String getNomHotel() {
		return NomHotel;
	}

	

	public Long getIdHotel() {
		return IdHotel;
	}


	public void setIdHotel(Long idHotel) {
		IdHotel = idHotel;
	}


	public void setNomHotel(String nomHotel) {
		NomHotel = nomHotel;
	}

	public String getLocalisation() {
		return Localisation;
	}

	public void setLocalisation(String localisation) {
		Localisation = localisation;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	public String getCapacite() {
		return Capacite;
	}

	public void setCapacite(String capacite) {
		Capacite = capacite;
	}

	public List<Voyage> getVoyages() {
		return Voyages;
	}

	public void setVoyages(List<Voyage> voyages) {
		Voyages = voyages;
	}
	
	
	
	

	

	
	
	
}
