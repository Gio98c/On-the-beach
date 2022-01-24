package it.unical.ingsw.onthebeach.model;

import java.util.Objects;

public class Recensione {
    private String testo;
    private int star;
    private String usernameCliente;
    private long idPrenotazione;
    private long idRecensione;

    public Recensione(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recensione that = (Recensione) o;
        return star == that.star && idPrenotazione == that.idPrenotazione && idRecensione == that.idRecensione && Objects.equals(testo, that.testo) && usernameCliente.equals(that.usernameCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testo, star, usernameCliente, idPrenotazione, idRecensione);
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
