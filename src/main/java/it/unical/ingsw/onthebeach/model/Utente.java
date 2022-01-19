package it.unical.ingsw.onthebeach.model;

import java.sql.Date;

public class Utente {

    private String username;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private String tipo_utente;
    private Date data_nascita;

    public Utente(){
    }

    public Utente(String username, String nome, String cognome, String email, String password, String tipo_utente, Date data_nascita){
        super();
        this.username=username;
        this.nome=nome;
        this.cognome=cognome;
        this.email=email;
        this.password=password;
        this.tipo_utente=tipo_utente;
        this.data_nascita=data_nascita;
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

    public String getTipo_utente() {
        return tipo_utente;
    }

    public void setTipo_utente(String tipo_utente) {
        this.tipo_utente = tipo_utente;
    }

    public Date getData_nascita() {
        return data_nascita;
    }

    public void setData_nascita(Date data_nascita) {
        this.data_nascita = data_nascita;
    }
}
