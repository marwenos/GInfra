package tn.insat.tpweb.gestioninfrastructure.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import tn.insat.tpweb.gestioninfrastructure.dao.BatimentDAO;
import tn.insat.tpweb.gestioninfrastructure.model.Batiment;
import tn.insat.tpweb.gestioninfrastructure.model.Gouvernorat;

public class BatimentDAOImpl extends HibernateDaoSupport implements BatimentDAO {

	private BatimentDAO batimentDAO;
	
	public BatimentDAOImpl(){
		
	}
	
	public BatimentDAO getBatimentDAO() {
		return batimentDAO;
	}

	public void setBatimentDAO(BatimentDAO batimentDAO) {
		this.batimentDAO = batimentDAO;
	}
	

	@Override
	public void insertBatiment(Batiment batiment) {
		this.getHibernateTemplate().save(batiment);
	}

	@Override
	public List<Batiment> getListBatiment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Batiment getBatimentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Gouvernorat> getListGouvernorat() {
		StringBuilder req = new StringBuilder();
		req.append("from Gouvernorat ");
		return (List<Gouvernorat>) this.getHibernateTemplate().find(req.toString());
	}

}
