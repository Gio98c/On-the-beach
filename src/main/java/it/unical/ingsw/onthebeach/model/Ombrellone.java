package it.unical.ingsw.onthebeach.model;

public class Ombrellone {

    private long idOmbrellone;
    private boolean occupato;
    private String nomeLido;

    public Ombrellone(){
    }

    public Ombrellone(long idOmbrellone, boolean occupato, String nomeLido){
        this.idOmbrellone=idOmbrellone;
        this.occupato=occupato;
        this.nomeLido=nomeLido;
    }

    public long getIdOmbrellone() {
        return idOmbrellone;
    }

    public void setIdOmbrellone(long idOmbrellone) {
        this.idOmbrellone = idOmbrellone;
    }

    public boolean getOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }

    public String getNomeLido() {
        return nomeLido;
    }

    public void setNomeLido(String nomeLido) {
        this.nomeLido = nomeLido;
    }


}
