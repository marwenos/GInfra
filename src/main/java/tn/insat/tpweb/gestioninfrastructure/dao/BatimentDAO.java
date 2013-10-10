package tn.insat.tpweb.gestioninfrastructure.dao;

import java.util.List;

import tn.insat.tpweb.gestioninfrastructure.model.Batiment;
import tn.insat.tpweb.gestioninfrastructure.model.Gouvernorat;

public interface BatimentDAO {
	
	public void insertBatiment(Batiment batiment);
	public List<Batiment> getListBatiment();
	public Batiment getBatimentById(Integer id);
	public List<Gouvernorat> getListGouvernorat();

}
