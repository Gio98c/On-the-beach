package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;

import it.unical.ingsw.onthebeach.model.Recensione;
import it.unical.ingsw.onthebeach.persistenza.dao.RecensioneDao;

import java.sql.Connection;
import java.util.List;

public class RecensioneDaoJDBC implements RecensioneDao {
    Connection conn;
    public RecensioneDaoJDBC(Connection conn){
        this.conn=conn;
    }


    @Override
    public List<Recensione> findAll() {
        return null;
    }

    @Override
    public Recensione findByPrimaryKey(long id) {
        return null;
    }

    @Override
    public List<Recensione> findByUtente(String username) {
        return null;
    }

    @Override
    public List<Recensione> findByLido(String nome) {
        return null;
    }

    @Override
    public boolean saveOrUpdate(long id) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
