package tn.esprit.pidev.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Reaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idreac;
	@ManyToOne
	private Publication pubreac;
	public Long getIdreac() {
		return idreac;
	}
	public void setIdreac(Long idreac) {
		this.idreac = idreac;
	}
	public Publication getPubreac() {
		return pubreac;
	}
	public void setPubreac(Publication pubreac) {
		this.pubreac = pubreac;
	}
	public Reaction(Long idreac, Publication pubreac) {
		super();
		this.idreac = idreac;
		this.pubreac = pubreac;
	} 
	
/*	
	@ManyToOne
	private Employe empreaction;*/
	
	//Cont



}
