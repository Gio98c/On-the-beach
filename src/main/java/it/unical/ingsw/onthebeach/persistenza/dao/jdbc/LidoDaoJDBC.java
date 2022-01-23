package it.unical.ingsw.onthebeach.persistenza.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import it.unical.ingsw.onthebeach.model.Lido;
import it.unical.ingsw.onthebeach.persistenza.dao.LidoDao;

public class LidoDaoJDBC implements LidoDao {

   Connection conn;
   
   public LidoDaoJDBC(Connection conn) {
      this.conn = conn;
   }
   
   @Override
   public List<Lido> findAll() {
      List<Lido> lidi = new ArrayList<Lido>();
      String query = "SELECT * FROM Lido;";
      PreparedStatement st = null;
      ResultSet rs = null;
      try {
         st = conn.prepareStatement(query);
         rs = st.executeQuery();
         while(rs.next()) {
            Lido lido = new Lido();
            lido.setNome(rs.getString("nome"));
            lido.setPosizione(rs.getString("posizione"));
            lido.setNumero(rs.getString("numero"));
            lido.setEmail(rs.getString("email"));
            lido.setDescrizione(rs.getString("descrizione"));
            lido.setFoto(rs.getBytes("foto"));
            lido.setNumeroOmbrelloni(rs.getInt("numero_ombrelloni"));
            lido.setUsernameGestore(rs.getString("username_gestore"));
            lidi.add(lido);
         }
      } catch(SQLException e) {
         e.printStackTrace();
      } finally {
         closeResult(rs);
         closeStatement(st);
      }
      return lidi;
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
   
   
   private void closeStatement(PreparedStatement statement) {
      try {
         statement.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   
   private void closeResult(ResultSet result) {
      try {
         result.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}