package it.unical.ingsw.onthebeach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import it.unical.ingsw.onthebeach.persistenza.dao.UtenteDao;
import it.unical.ingsw.onthebeach.persistenza.dao.RecensioneDao;
import it.unical.ingsw.onthebeach.persistenza.dao.OmbrelloneDao;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.UtenteDaoJDBC;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.RecensioneDaoJDBC;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.OmbrelloneDaoJDBC;

public class Database {

	private static Database instance = null;
	Connection conn;

	public static Database getInstance() {
		if(instance == null)
			instance = new Database();
		return instance;
	}
	private Database() {
		try {
			conn = DriverManager.getConnection("");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	


	public UtenteDao getUtenteDao(){
		return new UtenteDaoJDBC(conn);
	}

	public RecensioneDao getRecensioneDao(){
		return new RecensioneDaoJDBC(conn);
	}
	public OmbrelloneDao getOmbrelloneDao(){
		return new OmbrelloneDaoJDBC(conn);
	}
}
