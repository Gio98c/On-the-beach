package it.unical.ingsw.onthebeach.persistenza.dao;
import it.unical.ingsw.onthebeach.model.Recensione;

import java.util.List;

import java.util.List;

import it.unical.ingsw.onthebeach.model.Recensione;

public interface RecensioneDao {
<<<<<<< HEAD

	public List<Recensione> findAll();
	public Recensione findByPrimaryKey(long id);
	public List<Recensione> findByUtente(String username);
	public List<Recensione> findByLido(String nome);
	public boolean saveOrUpdate(long id);
	public boolean delete(long id);
=======
    public List<Recensione> findAll();
    public Recensione findByPrimaryKey(long id);
    public List<Recensione> findByUtente(String username);
    public List<Recensione> findByLido(String nome);
    public boolean saveOrUpdate(Recensione recensione);
    public boolean delete(long id);
>>>>>>> branch 'develop' of https://github.com/Gio98c/On-the-beach.git
}
