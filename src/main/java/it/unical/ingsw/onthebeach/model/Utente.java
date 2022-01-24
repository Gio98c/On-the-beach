package it.unical.ingsw.onthebeach.model;

import java.sql.Date;

public class Utente {

    private String username;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String tipoUtente;
    private Date dataNascita;

    public Utente(){
    }

    public Utente(String username, String nome, String cognome, String email, String password, String tipoUtente, Date dataNascita){
        super();
        this.username=username;
        this.nome=nome;
        this.cognome=cognome;
        this.email=email;
        this.password=password;
        this.tipoUtente=tipoUtente;
        this.dataNascita=dataNascita;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUtente() {
        return tipoUtente;
    }

    public void setTipoUtente(String tipo_utente) {
        this.tipoUtente = tipo_utente;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }
}
