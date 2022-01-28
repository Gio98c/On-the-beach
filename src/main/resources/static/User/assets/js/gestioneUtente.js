function Utente(nome, cognome, email, dataNascita, tipoUtente) {
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.dataNascita = dataNascita;
    this.tipoUtente = tipoUtente;
}



var btnUpdateInfoUtente = document.querySelector("#btnUpdateInfoUtente");
btnUpdateInfoUtente.addEventListener("click", function () {

    var campoNome = document.querySelector("#inputNome");
    var campoCognome = document.querySelector("#inputCognome");
    var campoEmail = document.querySelector("#inputEmail");

    //var utente = new Utente(nome, cognome, email, dataNascita, tipoUtente);

    //prendi la tupla con l'username che dvi cambiare e cambia solo i campi che ti servono
    //accedere al database non riesco da qua

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

})