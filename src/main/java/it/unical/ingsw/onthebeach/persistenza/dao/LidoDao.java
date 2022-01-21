package it.unical.ingsw.onthebeach.persistenza.dao;

import java.util.List;

import it.unical.ingsw.onthebeach.model.Lido;

public interface LidoDao {

	public List<Lido> findAll();
	public Lido findByPrimaryKey(String nome);
	public boolean saveOrUpdate(String nome);
	public boolean delete(String nome);
}
