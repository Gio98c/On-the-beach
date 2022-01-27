package it.unical.ingsw.onthebeach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import it.unical.ingsw.onthebeach.persistenza.dao.UtenteDao;
import it.unical.ingsw.onthebeach.persistenza.dao.RecensioneDao;
import it.unical.ingsw.onthebeach.persistenza.dao.LidoDao;
import it.unical.ingsw.onthebeach.persistenza.dao.OmbrelloneDao;
import it.unical.ingsw.onthebeach.persistenza.dao.PrenotazioneDao;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.UtenteDaoJDBC;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.RecensioneDaoJDBC;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.LidoDaoJDBC;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.OmbrelloneDaoJDBC;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.PrenotazioneDaoJDBC;

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
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestoreLido2", "postgres", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public LidoDao getLidoDao() throws SQLException {
		return new LidoDaoJDBC(conn);
	}
	
	public PrenotazioneDao getPrenotazioneDao() throws SQLException {
		return new PrenotazioneDaoJDBC(conn);
	}
	
	public UtenteDao getUtenteDao() throws SQLException{
		return new UtenteDaoJDBC(conn);
	}

	public RecensioneDao getRecensioneDao() throws SQLException{
		return new RecensioneDaoJDBC(conn);
	}
	public OmbrelloneDao getOmbrelloneDao() throws SQLException{
		return new OmbrelloneDaoJDBC(conn);
	}
}
