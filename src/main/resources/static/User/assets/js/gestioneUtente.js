function Utente(nome, cognome, email, dataNascita, tipoUtente) {
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.dataNascita = dataNascita;
    this.tipoUtente = tipoUtente;
}

var utente = new Utente(nome, cognome, email, dataNascita, tipoUtente);

$.ajax({
   type: "POST",
    url: "/updateInfoUtente",
    contentType: "application/json",
    data: JSON.stringify(utente),
    success: function (risposta) {
        console.log(risposta);
        if(risposta.status === "OK")
            alert("Modifica dati, avvenuta con successo!");
    },
    error: function (xhr) {
        console.log(xhr);
        alert(xhr.responseText);
    } 

});