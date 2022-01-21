package it.unical.ingsw.onthebeach.persistenza.dao;

import java.util.List;

import it.unical.ingsw.onthebeach.model.Recensione;

public interface RecensioneDao {

	public List<Recensione> findAll();
	public Recensione findByPrimaryKey(long id);
	public List<Recensione> findByUtente(String username);
	public List<Recensione> findByLido(String nome);
	public boolean saveOrUpdate(long id);
	public boolean delete(long id);
}
