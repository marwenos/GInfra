package tn.insat.tpweb.gestioninfrastructure.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.insat.tpweb.gestioninfrastructure.dao.GouvernoratDAO;
import tn.insat.tpweb.gestioninfrastructure.model.Gouvernorat;
import tn.insat.tpweb.gestioninfrastructure.services.GouvernoratService;

@Service("gouvernoratService")
public class GouvernoratServiceImpl implements GouvernoratService{

	GouvernoratDAO gouvernoratDAO;
	
	
	public GouvernoratDAO getGouvernoratDAO() {
		return gouvernoratDAO;
	}

	public void setGouvernoratDAO(GouvernoratDAO gouvernoratDAO) {
		this.gouvernoratDAO = gouvernoratDAO;
	}

	public List<Gouvernorat> getListGouvernorat() {
		return gouvernoratDAO.getListGouvernorat();
	}

	@Override
	public Gouvernorat getGouvernoratById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
