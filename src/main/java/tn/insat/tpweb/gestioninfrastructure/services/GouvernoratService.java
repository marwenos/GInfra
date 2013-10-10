package tn.insat.tpweb.gestioninfrastructure.services;

import java.util.List;

import tn.insat.tpweb.gestioninfrastructure.model.Gouvernorat;

public interface GouvernoratService {

	public List<Gouvernorat> getListGouvernorat();
	public Gouvernorat getGouvernoratById(Integer id);
}
