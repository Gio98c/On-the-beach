var btnReg = document.querySelector("#btnInsertLido");
btnReg.addEventListener("click", function () {

    $.ajax({
        type: "POST",
        url: "/registrationServices",
        //contentType: "application/json",
        //data: JSON.stringify(lido),
        success: function (risposta) {
            console.log(risposta);
            if(risposta === "Inserimento Completato")
                alert("Modifica dati, avvenuta con successo!");
        },
        error: function (xhr) {
            console.log(xhr);
            //alert(xhr.responseText);
        }
    });

});
