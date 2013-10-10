package tn.insat.tpweb.gestioninfrastructure.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.insat.tpweb.gestioninfrastructure.dao.BatimentDAO;
import tn.insat.tpweb.gestioninfrastructure.model.Batiment;
import tn.insat.tpweb.gestioninfrastructure.model.Gouvernorat;
import tn.insat.tpweb.gestioninfrastructure.services.BatimentService;

//@Service("batimentService")
public class BatimentServiceImpl implements BatimentService{
	
	private BatimentDAO batimentDAO;
	
	

	public BatimentDAO getBatimentDAO() {
		return batimentDAO;
	}

	public void setBatimentDAO(BatimentDAO batimentDAO) {
		this.batimentDAO = batimentDAO;
	}

	public void insertBatiment(Batiment batiment) {
		batimentDAO.insertBatiment(batiment);
		
	}

	public List<Batiment> getListBatiment() {
		
		return batimentDAO.getListBatiment();
	}

	public Batiment getBatimentById(Integer id) {
		return batimentDAO.getBatimentById(id);
	}

	@Override
	public List<Gouvernorat> getListGouvernorat() {
		return batimentDAO.getListGouvernorat();
	}

}
