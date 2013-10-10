package tn.insat.tpweb.gestioninfrastructure.model;

import java.io.Serializable;

public class Batiment implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Ville ville;
	private Gouvernorat gouvernorat;
	private String codePostal;
	private Quartier quartier;
	private String statutDeploiement;
	private String adress;
	private Integer numRue;
	private String coordonneesGPS;
	private String typeBatiment;
	private String nomResidence;
	private String blocResidence;
	private Integer numBloc;
	private Integer numEtage;
	private Integer numSTEG;
	private Integer numPorte;
	private String verticaliteDeploye;
	private String conventionSyndic;


	// ********************Début getter & Setter ************************

	public Integer getNumPorte() {
		return numPorte;
	}
	public void setNumPorte(Integer numPorte) {
		this.numPorte = numPorte;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getCp() {
		return codePostal;
	}
	public void setCp(String cp) {
		this.codePostal = cp;
	}
	public Quartier getQuartier() {
		return quartier;
	}
	public void setQuartier(Quartier quartier) {
		this.quartier = quartier;
	}
	public String getStatutDep() {
		return statutDeploiement;
	}
	public void setStatutDep(String statutDep) {
		this.statutDeploiement = statutDep;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Integer getNumRue() {
		return numRue;
	}
	public void setNumRue(Integer numRue) {
		this.numRue = numRue;
	}
	public String getCoordonneesGPS() {
		return coordonneesGPS;
	}
	public void setCoordonneesGPS(String coordonneesGPS) {
		this.coordonneesGPS = coordonneesGPS;
	}
	public String getTypeBatiment() {
		return typeBatiment;
	}
	public void setTypeBatiment(String typeBatiment) {
		this.typeBatiment = typeBatiment;
	}
	public String getNomResidence() {
		return nomResidence;
	}
	public void setNomResidence(String nomResidence) {
		this.nomResidence = nomResidence;
	}
	public String getBlocResidence() {
		return blocResidence;
	}
	public void setBlocResidence(String blocResidence) {
		this.blocResidence = blocResidence;
	}
	public Integer getNumBloc() {
		return numBloc;
	}
	public void setNumBloc(Integer numBloc) {
		this.numBloc = numBloc;
	}
	public Integer getNumEtage() {
		return numEtage;
	}
	public void setNumEtage(Integer numEtage) {
		this.numEtage = numEtage;
	}
	public Integer getNumSTEG() {
		return numSTEG;
	}
	public void setNumSTEG(Integer numSTEG) {
		this.numSTEG = numSTEG;
	}
	public String getVerticaliteDep() {
		return verticaliteDeploye;
	}
	public void setVerticaliteDep(String verticaliteDep) {
		this.verticaliteDeploye = verticaliteDep;
	}
	public String getConventionSyndic() {
		return conventionSyndic;
	}
	public void setConventionSyndic(String conventionSyndic) {
		this.conventionSyndic = conventionSyndic;
	}


	// ********************Fin getter & Setter ************************


	@Override
	public String toString() {
		return "Batiment [ville=" + ville + ", gouvernorat=" + gouvernorat
				+ ", compteur=" + codePostal + ", quartier=" + quartier + ", statutDepense="
				+ statutDeploiement + ", adress=" + adress + ", numRue=" + numRue
				+ ", coordonneesGPS=" + coordonneesGPS + ", typeBatiment="
				+ typeBatiment + ", nomBatiment=" + nomResidence
				+ ", blocResidence=" + blocResidence + ", numBloc=" + numBloc
				+ ", numEtage=" + numEtage + ", numSTEG=" + numSTEG
				+ ", verticaliteDep=" + verticaliteDeploye + ", conventionSyndic="
				+ conventionSyndic + "]";
	}

}
