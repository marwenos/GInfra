package tn.insat.tpweb.gestioninfrastructure.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import tn.insat.tpweb.gestioninfrastructure.dao.QuartierDAO;
import tn.insat.tpweb.gestioninfrastructure.model.Quartier;

public class QuartierDAOImpl extends HibernateDaoSupport implements QuartierDAO{

	QuartierDAO quartierDAO;
	
	
	public QuartierDAO getQuartierDAO() {
		return quartierDAO;
	}

	public void setQuartierDAO(QuartierDAO quartierDAO) {
		this.quartierDAO = quartierDAO;
	}

	@Override
	public void insertQuartier(Quartier quartier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Quartier> getListQuartier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Quartier getQuartierById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
