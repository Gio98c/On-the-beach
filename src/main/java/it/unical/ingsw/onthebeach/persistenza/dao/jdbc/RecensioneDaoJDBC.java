package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;

import it.unical.ingsw.onthebeach.model.Recensione;
import it.unical.ingsw.onthebeach.model.Utente;
import it.unical.ingsw.onthebeach.persistenza.dao.RecensioneDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecensioneDaoJDBC implements RecensioneDao {
    Connection conn;
    public RecensioneDaoJDBC(Connection conn){
        this.conn=conn;
    }


    @Override
    public List<Recensione> findAll() {
        List<Recensione> recensioni = new ArrayList<Recensione>();
        String query = "select * from Recensione";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Recensione r = new Recensione();
                r.setTesto(rs.getString("testo"));
                r.setStar(rs.getInt("star"));
                r.setUsername_cliente(rs.getString("cognome"));
                r.setId_prenotazione(rs.getLong("id_prenotazione"));
                recensioni.add(r);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return recensioni;
    }

    @Override
    public Recensione findByPrimaryKey(long id) {
        Recensione r = null;
        String query = String.format("select * from Recensione where id_prenotazione = %d", id);
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                r = new Recensione();
                r.setTesto(rs.getString("testo"));
                r.setStar(rs.getInt("star"));
                r.setUsername_cliente(rs.getString("cognome"));
                r.setId_prenotazione(rs.getLong("id_prenotazione"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();}
        return r;
    }

    @Override
    public List<Recensione> findByUtente(String username) {
        List<Recensione> recensioni = new ArrayList<Recensione>();
        String query = String.format("select * from Recensione,Utente where Username = %s", username);
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                Recensione r = new Recensione();
                r.setTesto(rs.getString("testo"));
                r.setStar(rs.getInt("star"));
                r.setUsername_cliente(rs.getString("cognome"));
                r.setId_prenotazione(rs.getLong("id_prenotazione"));
                recensioni.add(r);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();}
        return recensioni;
    }

    @Override
    public List<Recensione> findByLido(String nome) {
        List<Recensione> recensioni = new ArrayList<Recensione>();
        String query = String.format("select * from Recensione,Lido where nome = %s", nome);
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                Recensione r = new Recensione();
                r.setTesto(rs.getString("testo"));
                r.setStar(rs.getInt("star"));
                r.setUsername_cliente(rs.getString("cognome"));
                r.setId_prenotazione(rs.getLong("id_prenotazione"));
                recensioni.add(r);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();}
        return recensioni;
    }

    @Override
    public boolean saveOrUpdate(Recensione recensione) {
        if (recensione.getId_prenotazione() == 0) {
            //INSERT
            try {
                //recensione.setId(IdBrokerRecensione.getId(conn));
                String query = "insert into recensione "
                        + "values (?, ?, ?, ?)";
                PreparedStatement st = conn.prepareStatement(query);
                st.setString(1, recensione.getTesto());
                st.setInt(2, recensione.getStar());
                st.setString(3, recensione.getUsername_cliente());
                st.setLong(4, recensione.getId_prenotazione());
                st.executeUpdate();

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
        }else {
            //UPDATE
            try {
                String query = "update recensione "
                        + "set testo = ?, star = ?, username_cliente = ? "
                        + "where id_prenotazione = ?";
                PreparedStatement st = conn.prepareStatement(query);
                st.setString(1, recensione.getTesto());
                st.setInt(2, recensione.getStar());
                st.setString(3, recensione.getUsername_cliente());
                st.setLong(4, recensione.getId_prenotazione());

                st.executeUpdate();

            } catch (SQLException e) {

                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
        }
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean delete(Recensione recensione) {
        try {
            String query = "delete from recensione "
                    + "where id_prenotazione = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setLong(1, recensione.getId_prenotazione());
            st.executeUpdate();
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
