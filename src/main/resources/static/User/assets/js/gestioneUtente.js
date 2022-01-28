var btnUpdateInfoUtente = document.querySelector("#btnUpdateInfoUtente");
btnUpdateInfoUtente.addEventListener("click", function () {

    $.ajax({
        type: "POST",
        url: "/updateInfoUtente",
        //contentType: "application/json",
        //data: JSON.stringify(utente),
        success: function (risposta) {
            console.log(risposta);
            if(risposta === "Update Completato")
                alert("Modifica dati, avvenuta con successo!");
        },
        error: function (xhr) {
            console.log(xhr);
            //alert(xhr.responseText);
        }

    });

});


function promuovi(username) {
    console.log(username);
    $.ajax({
        type: "POST",
        url: "/promozione",
        data: {"username": username},
        success: function (risposta) {
            console.log(risposta);
            if(risposta === "utentePromosso")
                alert("Utente promosso!");
        },
        error: function (xhr) {
            console.log(xhr);
            //alert(xhr.responseText);
        }

    });
}