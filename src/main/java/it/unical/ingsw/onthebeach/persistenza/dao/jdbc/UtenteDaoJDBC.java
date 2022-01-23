package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;
import it.unical.ingsw.onthebeach.persistenza.dao.UtenteDao;
import it.unical.ingsw.onthebeach.model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteDaoJDBC implements UtenteDao {
    Connection conn;

    public UtenteDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Utente> findAll() {
        List<Utente> utenti = new ArrayList<Utente>();
        String query = "select * from Utente";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Utente u = new Utente();
                u.setUsername(rs.getString("username"));
                u.setNome(rs.getString("nome"));
                u.setCognome(rs.getString("cognome"));
                u.setEmail(rs.getString("email"));
                u.setTipo_utente(rs.getString("tipo_utente"));
                u.setData_nascita(rs.getDate("data_nascita"));
                u.setPassword(rs.getString("password"));

                utenti.add(u);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return utenti;
    }

    @Override
    public Utente findByPrimaryKey(String username) {
        Utente utente = null;
        String query = String.format("select * from Utente where id = %s", username);
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                utente = new Utente();
                utente.setUsername(rs.getString("username"));
                utente.setNome(rs.getString("nome"));
                utente.setCognome(rs.getString("cognome"));
                utente.setEmail(rs.getString("email"));
                utente.setTipo_utente(rs.getString("tipo_utente"));
                utente.setData_nascita(rs.getDate("data_nascita"));
                utente.setPassword((rs.getString("password")));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return utente;
    }

    @Override
    public boolean save(Utente utente) {
        //INSERT
        try {
            String query = "insert into utente "
                    + "values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, utente.getUsername());
            st.setString(2, utente.getNome());
            st.setString(3, utente.getCognome());
            st.setString(4, utente.getEmail());
            st.setString(5, utente.getPassword());
            st.setDate(6, utente.getData_nascita());
            st.setString(7, utente.getTipo_utente());
            st.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Utente utente) {
        //UPDATE
        try {
            String query = "update utente "
                    + "set nome = ?, cognome = ?, email = ?, password = ?, data_nascita = ?, tipo_utente=? "
                    + "where id = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, utente.getTipo_utente());
            st.setString(2, utente.getNome());
            st.setString(3, utente.getCognome());
            st.setString(4, utente.getEmail());
            st.setString(5, utente.getPassword());
            st.setDate(6, utente.getData_nascita());
            st.setString(7, utente.getUsername());

            st.executeUpdate();

        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(Utente utente) {
        try {
            String query = "delete from utente "
                    + "where id = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, utente.getUsername());
            st.executeUpdate();
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

}