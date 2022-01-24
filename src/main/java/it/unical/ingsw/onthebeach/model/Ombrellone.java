package it.unical.ingsw.onthebeach.model;

public class Ombrellone {

    private long id_ombrellone;
    private boolean occupato;
    private String nome_lido;

    public Ombrellone(){
    }

    public Ombrellone(long id_ombrellone, boolean occupato, String nome_lido){
        this.id_ombrellone=id_ombrellone;
        this.occupato=occupato;
        this.nome_lido=nome_lido;
    }

    public long getId_ombrellone() {
        return id_ombrellone;
    }

    public void setId_ombrellone(long id_ombrellone) {
        this.id_ombrellone = id_ombrellone;
    }

    public boolean getOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }

    public String getNome_lido() {
        return nome_lido;
    }

    public void setNome_lido(String nome_lido) {
        this.nome_lido = nome_lido;
    }


}
