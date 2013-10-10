package tn.insat.tpweb.gestioninfrastructure.services;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.insat.tpweb.gestioninfrastructure.model.Batiment;
import tn.insat.tpweb.gestioninfrastructure.model.Gouvernorat;


public interface BatimentService {
	
	public void insertBatiment(Batiment batiment);
	public List<Batiment> getListBatiment();
	public Batiment getBatimentById(Integer id);
	public List<Gouvernorat> getListGouvernorat();

}
