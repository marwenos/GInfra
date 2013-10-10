package tn.insat.tpweb.gestioninfrastructure.services;

import java.util.List;

import tn.insat.tpweb.gestioninfrastructure.model.Quartier;

public interface QuartierService {
	
	public void insertQuartier(Quartier quartier);
	public List<Quartier> getListQuartier();
	public Quartier getQuartierById(Integer id);

}
