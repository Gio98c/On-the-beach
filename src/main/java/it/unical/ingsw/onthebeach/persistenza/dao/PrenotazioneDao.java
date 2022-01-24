package it.unical.ingsw.onthebeach.persistenza.dao;

import java.util.List;

import it.unical.ingsw.onthebeach.model.Prenotazione;

public interface PrenotazioneDao {

	public List<Prenotazione> findAll();
	public Prenotazione findByPrimaryKey(long id);
	public List<Prenotazione> findByUsername(String username);
	public boolean save(Prenotazione prenotazione);
	public boolean delete(Prenotazione prenotazione);
}
