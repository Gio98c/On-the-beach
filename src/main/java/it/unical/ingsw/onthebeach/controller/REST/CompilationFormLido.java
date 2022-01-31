package it.unical.ingsw.onthebeach.controller.REST;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Lido;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@RestController
public class CompilationFormLido {

    @PostMapping("/registrationeLido")
    public String addLido(HttpServletRequest req, HttpServletResponse resp, String nome, String usernameGestore, String posizione, String numero, String email, int numeroOmbrelloni, String foto, String descrizione) throws IOException {
        Lido lido = new Lido();
        lido.setNome(nome);
        lido.setUsernameGestore(usernameGestore);
        lido.setPosizione(posizione);
        lido.setNumero(numero);
        lido.setEmail(email);
        lido.setNumeroOmbrelloni(numeroOmbrelloni);
        lido.setFoto(foto);
        lido.setDescrizione(descrizione);

        try {
            if(Database.getInstance().getLidoDao().saveOrUpdate(lido)) {
                resp.sendRedirect("index");
                return "registrazioneLidoEffettuata";
            }
            else
                return "errore";
        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendRedirect("Form");
        }

        return null;
    }
}
