package it.unical.ingsw.onthebeach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import it.unical.ingsw.onthebeach.persistenza.dao.UtenteDao;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.UtenteDaoJDBC;

public class Database {

	private static Database instance = null;
	Connection conn;
	
	private Database() {
		try {
			conn = DriverManager.getConnection("");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Database getInstance() {
		if(instance == null)
			instance = new Database();
		return instance;
	}
}
