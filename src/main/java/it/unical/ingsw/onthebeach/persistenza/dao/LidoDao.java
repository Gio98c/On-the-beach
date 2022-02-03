package it.unical.ingsw.onthebeach.persistenza.dao;

import it.unical.ingsw.onthebeach.model.Lido;

import java.util.List;

public interface LidoDao {

	public List<Lido> findAll();
	public Lido findByPrimaryKey(String nome);
	public List<Lido> findBest3();
	public boolean saveOrUpdate(Lido lido);
	public boolean delete(Lido lido);
	public Lido findByGestore(String username);
	public byte[] trovaImmagine(String username);

}
