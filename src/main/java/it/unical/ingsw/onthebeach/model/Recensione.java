package it.unical.ingsw.onthebeach.model;

public class Recensione {
    private String testo;
    private int star;
    private String username_cliente;
    private int id_prenotazione;

    public Recensione(){

    }

    public Recensione(String testo, int star, String usernameCliente, int idPrenotazione){
        this.testo=testo;
        this.star=star;
        this.username_cliente=usernameCliente;
        this.id_prenotazione=idPrenotazione;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getUsername_cliente() {
        return username_cliente;
    }

    public void setUsername_cliente(String username_cliente) {
        this.username_cliente = username_cliente;
    }

    public int getId_prenotazione() {
        return id_prenotazione;
    }

    public void setId_prenotazione(int id_prenotazione) {
        this.id_prenotazione = id_prenotazione;
    }
}
