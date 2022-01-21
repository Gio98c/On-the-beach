package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;

import java.sql.Connection;
import java.util.List;

import it.unical.ingsw.onthebeach.model.Lido;
import it.unical.ingsw.onthebeach.persistenza.dao.LidoDao;

public class LidoDaoJDBC implements LidoDao{

	Connection conn;
	
	public LidoDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public List<Lido> findAll() {
		String query = "SELECT * FROM Lido;";
	}

	@Override
	public Lido findByPrimaryKey(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveOrUpdate(String nome) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String nome) {
		// TODO Auto-generated method stub
		return false;
	}

}
