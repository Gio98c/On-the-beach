package it.unical.ingsw.onthebeach.persistenza.dao;
import it.unical.ingsw.onthebeach.model.Utente;

import java.util.List;

public interface UtenteDao {
    public List<Utente> findAll();
    public Utente findByPrimaryKey(String username);
    public boolean saveOrUpdate(Utente utente);
    public boolean delete(Utente utente);
}
