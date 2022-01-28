package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;

import java.sql.*;

import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.IdBroker;
import it.unical.ingsw.onthebeach.model.Ombrellone;
import it.unical.ingsw.onthebeach.model.Recensione;
import it.unical.ingsw.onthebeach.persistenza.dao.OmbrelloneDao;
public class OmbrelloneDaoJDBC implements OmbrelloneDao{
    Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestoreLido2",
            "postgres", "root");
    public OmbrelloneDaoJDBC(Connection conn) throws SQLException {
        this.conn=conn;
    }

    @Override
    public boolean saveOrUpdate(Ombrellone ombrellone) {
        if (ombrellone.getIdOmbrellone() == 0) {
            //INSERT
            try {
                ombrellone.setIdOmbrellone(IdBroker.getId(conn));
                String query = "insert into ombrellone "
                        + "values (?, ?, ?, ?)";
                PreparedStatement st = conn.prepareStatement(query);
                st.setLong(1, ombrellone.getIdOmbrellone());
                st.setBoolean(2, ombrellone.getOccupato());
                st.setString(3, ombrellone.getNomeLido());
                st.setFloat(4, ombrellone.getPrezzo());
                st.executeUpdate();

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
        }else {
            //UPDATE
            try {
                String query = "update ombrellone "
                        + "set occupato = ?, nome_lido = ?, prezzo = ?"
                        + "where id_ombrellone = ?";
                PreparedStatement st = conn.prepareStatement(query);
                st.setBoolean(1, ombrellone.getOccupato());
                st.setString(2, ombrellone.getNomeLido());
                st.setFloat(3, ombrellone.getPrezzo());
                st.setLong(4, ombrellone.getIdOmbrellone());

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
    public Ombrellone findByPrimaryKey(long id) {
        Ombrellone o = null;
        String query = "select * from ombrellone where id_ombrellone = ?";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setLong(1,id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                o = new Ombrellone();
                o.setIdOmbrellone(rs.getLong("id_ombrellone"));
                o.setOccupato(rs.getBoolean("occupato"));
                o.setNomeLido(rs.getString("nome_lido"));
                o.setPrezzo(rs.getFloat(("prezzo")));
                st.executeUpdate();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();}
        return o;
    }

    @Override
    public boolean delete(Ombrellone ombrellone) {
        try {
            String query = "delete from ombrellone "
                    + "where id_ombrellone = ?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setLong(1, ombrellone.getIdOmbrellone());
            st.executeUpdate();
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean switchOccupato(Ombrellone ombrellone) {
            try {
                String query = "update ombrellone "
                        + "set occupato = ? "
                        + "where id_ombrellone = ?";
                PreparedStatement st = conn.prepareStatement(query);
                st.setBoolean(1, !ombrellone.getOccupato());
                st.setLong(2, ombrellone.getIdOmbrellone());

                st.executeUpdate();

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return false;
            }
            return true;
    }
}