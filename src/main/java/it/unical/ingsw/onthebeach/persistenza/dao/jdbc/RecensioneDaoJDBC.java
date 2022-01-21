package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;

import it.unical.ingsw.onthebeach.persistenza.dao.RecensioneDao;

import java.sql.Connection;

public class RecensioneDaoJDBC implements RecensioneDao {
    Connection conn;
    public RecensioneDaoJDBC(Connection conn){
        this.conn=conn;
    }
}
