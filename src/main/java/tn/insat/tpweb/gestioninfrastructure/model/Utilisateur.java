package tn.insat.tpweb.gestioninfrastructure.model;

import java.io.Serializable;

public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;


	private Integer idUtilisateur;
	private String login;
	private String password;
	
	// ********************Début getter & Setter ************************

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	// ********************Fin getter & Setter ************************




}
