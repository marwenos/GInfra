package tn.insat.tpweb.gestioninfrastructure.beans;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.File;
import java.io.Serializable;


@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	private String name;
	private String mdp;
	private File file;
 

	// ********************Début getter & Setter ************************

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String welcome(){
		System.out.println("Bonjour");
		return"succes";
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}

	// ********************Fin getter & Setter ************************

}