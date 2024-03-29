package tn.esprit.pidev.entities;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Voyage   {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdVoyage;
	private String Depart; 
	private String Destinisation;
	private String privateDuree;
	private Date DateDep;
	private Date DateRet;
	
	@Enumerated(EnumType.STRING)
	private ObjetVoyage Objet_voyage;




	




	public Date getDateDep() {
		return DateDep;
	}




	public void setDateDep(Date dateDep) {
		DateDep = dateDep;
	}




	public Date getDateRet() {
		return DateRet;
	}




	public void setDateRet(Date dateRet) {
		DateRet = dateRet;
	}




	
	
	@ManyToOne
	private Hotel hotel;
	
	@ManyToMany(mappedBy="voyages")
	private List <Employe>employes;

	
	//Const
	
	
	


	
	
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

	



	public Voyage(String depart, String destinisation, String privateDuree, Date dateDep, Date dateRet,
			ObjetVoyage objet_voyage, Hotel hotel, List<Employe> employes) {
		super();
		Depart = depart;
		Destinisation = destinisation;
		this.privateDuree = privateDuree;
		DateDep = dateDep;
		DateRet = dateRet;
		Objet_voyage = objet_voyage;
		this.hotel = hotel;
		this.employes = employes;
	}




	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
		
		
	}




	public Voyage() {
		super();
		// TODO Auto-generated constructor stub
	}




	public List<Employe> getEmployes() {
		return employes;
	}




	public void setEmployes(List<Employe> employes) {
		this.employes = employes;
	}




	public ObjetVoyage getObjet_voyage() {
		return Objet_voyage;
	}




	public void setObjet_voyage(ObjetVoyage objet_voyage) {
		Objet_voyage = objet_voyage;
	}




	@Override
	public int hashCode() {
		return Objects.hash(DateDep, DateRet, Depart, Destinisation, Objet_voyage, privateDuree);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voyage other = (Voyage) obj;
		return Objects.equals(DateDep, other.DateDep) && Objects.equals(DateRet, other.DateRet)
				&& Objects.equals(Depart, other.Depart) && Objects.equals(Destinisation, other.Destinisation)
				&& Objet_voyage == other.Objet_voyage && Objects.equals(privateDuree, other.privateDuree);
	}




	@Override
	public String toString() {
		return "Voyage [Depart=" + Depart + ", Destinisation=" + Destinisation + ", privateDuree=" + privateDuree
				+ ", DateDep=" + DateDep + ", DateRet=" + DateRet + ", Objet_voyage=" + Objet_voyage + "]";
	}

}
