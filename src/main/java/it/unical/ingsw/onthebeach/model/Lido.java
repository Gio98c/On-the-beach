package it.unical.ingsw.onthebeach.model;

public class Lido {

	private String nome;
	private String posizione;
	private String numero;
	private String email;
	private String descrizione;
	private byte[] foto;
	private int numeroOmbrelloni;
	private String usernameGestore;
	
	public Lido() {}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getPosizione() {
		return posizione;
	}
	
	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public byte[] getFoto() {
		return foto;
	}
	
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	public int getNumeroOmbrelloni() {
		return numeroOmbrelloni;
	}
	
	public void setNumeroOmbrelloni(int numeroOmbrelloni) {
		this.numeroOmbrelloni = numeroOmbrelloni;
	}
	
	public String getUsernameGestore() {
		return usernameGestore;
	}
	
	public void setUsernameGestore(String usernameGestore) {
		this.usernameGestore = usernameGestore;
	}
}
