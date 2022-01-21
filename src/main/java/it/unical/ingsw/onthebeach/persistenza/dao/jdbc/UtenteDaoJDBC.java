package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;
import it.unical.ingsw.onthebeach.persistenza.dao.UtenteDao;

import java.sql.Connection;

public class UtenteDaoJDBC implements UtenteDao{
    Connection conn;
    public UtenteDaoJDBC(Connection conn){
        this.conn=conn;
    }
}
