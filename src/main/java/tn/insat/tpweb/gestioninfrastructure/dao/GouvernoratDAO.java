package tn.insat.tpweb.gestioninfrastructure.dao;

import java.util.List;

import tn.insat.tpweb.gestioninfrastructure.model.Gouvernorat;


public interface GouvernoratDAO {

	public List<Gouvernorat> getListGouvernorat();
	public Gouvernorat getGouvernoratById(Integer id);
}
