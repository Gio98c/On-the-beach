package it.unical.ingsw.onthebeach.model;

public class Utente {

    private final static int CLIENTE = 0;
    private final static int GESTORE_LIDO = 1;
    private final static int AMMINISTRATORE_SITO = 2;

    private String cf = "";
    private String nome = "";
    private String cognome = "";
    private String email = "";
    private String password = "";
    private String dataNascita = "";
    private int tipoUtente;

    public Utente(String cf, String nome, String cognome, String email, String password, String dataNascita, int tipoUtente) {
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.dataNascita = dataNascita;
        this.tipoUtente = tipoUtente;
    }

    public Utente() {
        this.nome = "";
        this.cognome = "";
        this.email = "";
        this.password = "";
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
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

    public String getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(String dataNascita) {
        this.dataNascita = dataNascita;
    }

    public int getTipoUtente() {
        return tipoUtente;
    }

    public void setTipoUtente(int tipoUtente) {
        this.tipoUtente = tipoUtente;
    }

}
