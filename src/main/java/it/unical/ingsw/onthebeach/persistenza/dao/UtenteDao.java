package it.unical.ingsw.onthebeach.persistenza.dao;
import it.unical.ingsw.onthebeach.model.Utente;

import java.util.List;

public interface UtenteDao {
<<<<<<< HEAD
<<<<<<< HEAD

=======
    int i=0;
>>>>>>> branch 'develop' of https://github.com/Gio98c/On-the-beach.git
=======
    public List<Utente> findAll();
    public Utente findByPrimaryKey(String username);
    public boolean save(Utente utente);
    public boolean update(Utente utente);
    public boolean delete(Utente utente);
>>>>>>> branch 'develop' of https://github.com/Gio98c/On-the-beach.git
}
