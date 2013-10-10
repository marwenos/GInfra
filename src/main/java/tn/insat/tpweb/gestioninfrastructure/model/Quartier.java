package tn.insat.tpweb.gestioninfrastructure.model;

import java.io.Serializable;

public class Quartier implements Serializable {


	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nom;
	private Ville ville;
	private Gouvernorat gouvernorat;
	private String connecte;


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

	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	public Gouvernorat getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(Gouvernorat gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	public String getConnecte() {
		return connecte;
	}
	public void setConnecte(String connecte) {
		this.connecte = connecte;
	}
	// ********************Fin getter & Setter ************************

}
