package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.IdBroker;
import it.unical.ingsw.onthebeach.model.Ombrellone;
import it.unical.ingsw.onthebeach.model.Recensione;
import it.unical.ingsw.onthebeach.persistenza.dao.OmbrelloneDao;
public class OmbrelloneDaoJDBC implements OmbrelloneDao{
    Connection conn;
    public OmbrelloneDaoJDBC(Connection conn){
        this.conn=conn;
    }

    @Override
    public boolean saveOrUpdate(Ombrellone ombrellone) {
        if (ombrellone.getId_ombrellone() == 0) {
            //INSERT
            try {
                ombrellone.setId_ombrellone(IdBroker.getId(conn));
                String query = "insert into ombrellone "
                        + "values (?, ?, ?)";
                PreparedStatement st = conn.prepareStatement(query);
                st.setLong(1, ombrellone.getId_ombrellone());
                st.setBoolean(2, ombrellone.getOccupato());
                st.setString(3, ombrellone.getNome_lido());
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
                        + "set occupato = ?, nome_lido = ?"
                        + "where id_ombrellone = ?";
                PreparedStatement st = conn.prepareStatement(query);
                st.setBoolean(1, ombrellone.getOccupato());
                st.setString(2, ombrellone.getNome_lido());
                st.setLong(3, ombrellone.getId_ombrellone());

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
        String query = String.format("select * from Ombrellone where id_ombrellone = %d", id);
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                o = new Ombrellone();
                o.setId_ombrellone(rs.getLong("id_ombrellone"));
                o.setOccupato(rs.getBoolean("occupato"));
                o.setNome_lido(rs.getString("nome_lido"));
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
            st.setLong(1, ombrellone.getId_ombrellone());
            st.executeUpdate();
        } catch (SQLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
