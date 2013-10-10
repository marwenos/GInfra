package tn.insat.tpweb.gestioninfrastructure.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import tn.insat.tpweb.gestioninfrastructure.dao.GouvernoratDAO;
import tn.insat.tpweb.gestioninfrastructure.model.Gouvernorat;

public class GouvernoratDAOImpl extends HibernateDaoSupport implements GouvernoratDAO {
	public GouvernoratDAO gouvernoratDAO;
	

	public GouvernoratDAOImpl(){
		
	}
	public GouvernoratDAO getGouvernoratDAO() {
		return gouvernoratDAO;
	}

	public void setGouvernoratDAO(GouvernoratDAO gouvernoratDAO) {
		this.gouvernoratDAO = gouvernoratDAO;
	}

	@Override
	public List<Gouvernorat> getListGouvernorat() {
		
		StringBuilder req = new StringBuilder();
		req.append("from Gouvernorat ");
		return (List<Gouvernorat>) this.getHibernateTemplate().find(req.toString());
	}

	@Override
	public Gouvernorat getGouvernoratById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
