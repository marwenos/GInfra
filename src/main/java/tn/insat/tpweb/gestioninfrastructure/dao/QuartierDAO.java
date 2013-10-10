package tn.insat.tpweb.gestioninfrastructure.dao;

import java.util.List;

import tn.insat.tpweb.gestioninfrastructure.model.Quartier;


public interface QuartierDAO {

	public void insertQuartier(Quartier quartier);
	public List<Quartier> getListQuartier();
	public Quartier getQuartierById(Integer id);
}
