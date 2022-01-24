package it.unical.ingsw.onthebeach.model;

public class Recensione {
    private String testo;
    private int star;
    private String usernameCliente;
    private long idPrenotazione;
    private long idRecensione;

    public Recensione(){

    }

    public Recensione(long idRecensione, String testo, int star, String usernameCliente, long idPrenotazione){
        this.idRecensione=idRecensione;
        this.testo=testo;
        this.star=star;
        this.usernameCliente=usernameCliente;
        this.idPrenotazione=idPrenotazione;
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

    public String getUsernameCliente() {
        return usernameCliente;
    }

    public void setUsernameCliente(String username_cliente) {
        this.usernameCliente = usernameCliente;
    }

    public long getIdPrenotazione() {
        return idPrenotazione;
    }

    public void setIdPrenotazione(long idPrenotazione) {
        this.idPrenotazione = idPrenotazione;
    }

    public long getIdRecensione() {
        return idRecensione;
    }

    public void setIdRecensione(long idRecensione) {
        this.idRecensione = idRecensione;
    }
}
