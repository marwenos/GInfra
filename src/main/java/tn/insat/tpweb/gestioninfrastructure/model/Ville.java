package tn.insat.tpweb.gestioninfrastructure.model;
import java.io.Serializable;

public class Ville implements Serializable{


	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nom;
	
	// ********************Début getter & Setter ************************

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	// ********************Fin getter & Setter ************************


}