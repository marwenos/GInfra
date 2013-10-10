package tn.insat.tpweb.gestioninfrastructure.beans.recherche;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import tn.insat.tpweb.gestioninfrastructure.model.Batiment;
import tn.insat.tpweb.gestioninfrastructure.model.Gouvernorat;
import tn.insat.tpweb.gestioninfrastructure.model.Ville;
import tn.insat.tpweb.gestioninfrastructure.services.BatimentService;

@ManagedBean
@ViewScoped
public class BatimentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{batimentService}")
	private BatimentService batimentService;
	
	
	private Integer gouvernorat;
	private Integer ville;
	private String cp;
	private Integer quartier;
	private String nom;
	private Integer statutDep;
	private String adresse;
	private Integer numRue;
	private String gps;
	private Integer typeBatiment;
	private Integer blocResidence; 
	private Integer numBloc;
	private Integer numEtage;
	private Integer numPorte;
	private Integer numCompteurSTEG;
	private Integer verticaliteDeployee;
	private Integer conventionSyndic;
	private List<Batiment> listBatiment;
	
	private List<Gouvernorat> listGouvernorat;
	
	
	//Recherche BAtiment
	private String nomVille;
	private String nomGouv;
	
	 
	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public String getNomGouv() {
		return nomGouv;
	}

	public void setNomGouv(String nomGouv) {
		this.nomGouv = nomGouv;
	}

	public List<Batiment> getListBatiment() {
		
		listBatiment = new ArrayList<Batiment>();
			Batiment b= new Batiment();
			Gouvernorat g = new Gouvernorat();
			Ville v = new Ville();
			v.setNom("ARIANA");
			g.setNom("LA MARSA");
			b.setGouvernorat(g);
			b.setCp(""+3024);
			b.setTypeBatiment("R");
			b.setVille(v);
			
			setNomVille(v.getNom());
			setNomGouv(g.getNom());
			
			listBatiment.add(b);
			
		return listBatiment;
	}

	public void setListBatiment(List<Batiment> listBatiment) {
		this.listBatiment = listBatiment;
	}
	
	public Integer getNumRue() {
		return numRue;
	}

	public void setNumRue(Integer numRue) {
		this.numRue = numRue;
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

	public Integer getNumPorte() {
		return numPorte;
	}

	public void setNumPorte(Integer numPorte) {
		this.numPorte = numPorte;
	}

	public Integer getNumCompteurSTEG() {
		return numCompteurSTEG;
	}

	public void setNumCompteurSTEG(Integer numCompteurSTEG) {
		this.numCompteurSTEG = numCompteurSTEG;
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

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public Integer getQuartier() {
		return quartier;
	}

	public void setQuartier(Integer quartier) {
		this.quartier = quartier;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getStatutDep() {
		return statutDep;
	}

	public void setStatutDep(Integer statutDep) {
		this.statutDep = statutDep;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public Integer getTypeBatiment() {
		return typeBatiment;
	}

	public void setTypeBatiment(Integer typeBatiment) {
		this.typeBatiment = typeBatiment;
	}

	public Integer getBlocResidence() {
		return blocResidence;
	}

	public void setBlocResidence(Integer blocResidence) {
		this.blocResidence = blocResidence;
	}

	public Integer getVerticaliteDeployee() {
		return verticaliteDeployee;
	}

	public void setVerticaliteDeployee(Integer verticaliteDeployee) {
		this.verticaliteDeployee = verticaliteDeployee;
	}

	public Integer getConventionSyndic() {
		return conventionSyndic;
	}

	public void setConventionSyndic(Integer conventionSyndic) {
		this.conventionSyndic = conventionSyndic;
	}
	
	public BatimentService getBatimentService() {
		return batimentService;
	}

	public void setBatimentService(BatimentService batimentService) {
		this.batimentService = batimentService;
	}
	
	

	// ********************Fin getter & Setter ************************
	
	
	public String recherche(){
		return"recBatiment";
	}
	
	
	public String rechercher(){
		return"liste";
	}
	
	public String nouveauBatiment(){
		adresse= new String();
		return"nouveauBatiment";
	}
	
	public String enregistrerBatiment(){
		//System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		Batiment bat = new Batiment();
		bat.setAdress(adresse);
		bat.setBlocResidence(""+blocResidence);
		bat.setConventionSyndic(""+conventionSyndic);
		bat.setCoordonneesGPS(gps);
		bat.setCp(cp);
		bat.setNomResidence(nom);
		bat.setNumBloc(numBloc);
		bat.setNumEtage(numEtage);
		bat.setNumPorte(numPorte);
		bat.setVerticaliteDep(""+verticaliteDeployee);
		bat.setConventionSyndic(""+conventionSyndic);
		
		batimentService.insertBatiment(bat);
		
		return "enregistrerBat";
	}
	
	//Consultation d'un batiment
	public String onSelectActivite(){
		System.out.println("Batiment"+nomVille);
		return "consultBatiment";
	}

	// Liste des gouvernorats
	public List<Gouvernorat> getListGouvernorat() {
		listGouvernorat = new ArrayList<Gouvernorat>();
		listGouvernorat = batimentService.getListGouvernorat();
		return listGouvernorat;
	}

	public void setListGouvernorat(List<Gouvernorat> listGouvernorat) {
		this.listGouvernorat = listGouvernorat;
	}
	
}
