package tn.insat.tpweb.gestioninfrastructure.beans.recherche;

public class QuartierBean {
	
	private Integer quartier;
	private Integer connecte;
	private String nomQuartier;
	private Integer gouvernorat;
	private Integer ville;
	
	
	public Integer getQuartier() {
		return quartier;
	}
	
	public void setQuartier(Integer quartier) {
		this.quartier = quartier;
	}

	public Integer getConnecte() {
		return connecte;
	}

	public void setConnecte(Integer connecte) {
		this.connecte = connecte;
	}
	
	public Integer getGouvernorat() {
		return gouvernorat;
	}

	public void setGouvernorat(Integer gouvernorat) {
		this.gouvernorat = gouvernorat;
	}

	public Integer getVille() {
		return ville;
	}

	public void setVille(Integer ville) {
		this.ville = ville;
	}

	public String getNomQuartier() {
		return nomQuartier;
	}

	public void setNomQuartier(String nomQuartier) {
		this.nomQuartier = nomQuartier;
	}

	// ************************ FIN GETTER & SETTER *********************
	//Recherche d'un quartier
	public String consulter(){
		setConnecte(2);
		return "consulterQuartier";
	}
	
	//Vers rechercher Quartier
	public String rechercher(){
		return "rechercheQuartier";
	}
	
	public String nouveauQuartier(){
		return"nouveauQuartier";
	}
}
