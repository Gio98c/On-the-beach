package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;

import java.sql.Connection;
import it.unical.ingsw.onthebeach.persistenza.dao.OmbrelloneDao;
public class OmbrelloneDaoJDBC implements OmbrelloneDao{
    Connection conn;
    public OmbrelloneDaoJDBC(Connection conn){
        this.conn=conn;
    }
}
