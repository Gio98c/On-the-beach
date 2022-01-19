package it.unical.ingsw.onthebeach.model;

import java.sql.Date;

public class Prenotazione {

	private int idPrenotazione;
	private float prezzoTotale;
	private String descrizione;
	private Date dataPrenotazione;
	private Date dataInizio;
	private Date dataFine;
	private String usernameCliente;
	private String nomeLido;
	
	public Prenotazione() {}
	
	public int getIdPrenotazione() {
		return idPrenotazione;
	}
	
	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}
	
	public float getPrezzoTotale() {
		return prezzoTotale;
	}
	
	public void setPrezzoTotale(float prezzoTotale) {
		this.prezzoTotale = prezzoTotale;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}
	
	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	
	public Date getDataInizio() {
		return dataInizio;
	}
	
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	
	public Date getDataFine() {
		return dataFine;
	}
	
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	
	public String getUsernameCliente() {
		return usernameCliente;
	}
	
	public void setUsernameCliente(String usernameCliente) {
		this.usernameCliente = usernameCliente;
	}
	
	public String getNomeLido() {
		return nomeLido;
	}
	
	public void setNomeLido(String nomeLido) {
		this.nomeLido = nomeLido;
	}
}
