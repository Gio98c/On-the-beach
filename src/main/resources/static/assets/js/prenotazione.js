


/*
window.addEventListener("load", function () {
    aggiungiEventi();

    function prenota(nomeLido) {
        console.log(numOmbrelloni);

        $.ajax({
            type: "POST",
            url: "/prenota",
            contentType: "application/json",
            data: {"nomeLido" : nomeLido},
            success: function (risposta) {
                console.log(risposta);
                if(risposta === "prenotazioneCreata")
                    console.log("prenotazione creata");
            },
            error: function (xhr) {
                console.log(xhr);
            }
        });
    }
});*/

var ombrelloni = [];


function Prenotazione(prezzoTotale, descrizione, dataPrenotazione, dataInizio, dataFine, usrCliente, nomeLido) {
    this.prezzoTotale = prezzoTotale;
    this.descrizione = descrizione;
    this.dataPrenotazione = dataPrenotazione;
    this.dataInizio = dataInizio;
    this.dataFine = dataFine;
    this.usrCliente = usrCliente;
    this.nomeLido = nomeLido;
}


function prenota() {
    var selectCheckedBoxes = document.querySelectorAll("input:checked");

    if(selectCheckedBoxes.lenght > 0) {
        selectCheckedBoxes.forEach(function (checkBox, indice) {
           console.log(checkBox);
           checkBox.log(checkBox.getAttribute("id"));

           ombrelloni.push(checkBox.getAttribute("id"));
           //ombrelloni[indice] = checkBox.getAttribute("id");

        });
    } else {
        alert("Si prega di selezionare almeno un elemnto");
    }

    //var dataInizio = document.getElementById("dataInizio");
    //var dataFine = new Date(document.getElementById("dataFine"));

    var dF = document.getElementById("dataFine").value = new Date();
    var dI = document.getElementById("dataInizio").value = new Date();

    var dateTest = new Date();
    var dataPrenotazione = dateTest.getFullYear()+'/'+(dateTest.getMonth()+1)+'/'+dateTest.getDate();


    var nomeLido1 = document.querySelector("#nomeLido").value;
        //document.getElementById("nomeLido").value;

    var prezzoTotale;
    for (const o in ombrelloni) {
        prezzoTotale += document.getElementById("prezzoOmbrellone").value;
    }

    var intervallo = dF.getDate() - dI.getDate();
    if(intervallo !== 0)
        prezzoTotale *= intervallo;

    var dataInizioFinish = dI.getFullYear()+'/'+dI.getMonth()+'/'+dI.getDate();
    var dataFineFinish = dF.getFullYear()+'/'+dF.getMonth()+'/'+dF.getDate();

    var prenotazioneAggiungere = new Prenotazione(prezzoTotale, "", dataPrenotazione, dataInizioFinish, dataFineFinish, "", nomeLido1);

    $.ajax({
        type: "POST",
        url: "/prenota",
        dataType: "application/json",
        data: JSON.stringify(prenotazioneAggiungere),
        success: function (risposta) {
            console.log(risposta);
            if(risposta === "prenotazioneCreata")
                console.log("prenotazione creata");
        },
        error: function (xhr) {
            console.log(xhr);
        }
    });

    delete ombrelloni;

}

/*
function prenota(nomeLido) {
    console.log(numOmbrelloni);

    $.ajax({
        type: "POST",
        url: "/prenota",
        data: {"nomeLido" : nomeLido},
        success: function (risposta) {
            console.log(risposta);
            if(risposta === "prenotazioneCreata")
                console.log("prenotazione creata");
        },
        error: function (xhr) {
            console.log(xhr);
        }
    });
}
*/

$('btnPagamentoInSede').click(function () {

    $.ajax({
        type: "POST",
        url: "/pagamentoInSede",
        success: function (risposta) {
            console.log(risposta);
            if(risposta === "emailInviata")
                alert("Pagamento in sede approvato!");
        },
        error: function (xhr) {
            console.log(xhr);
        }
    });
});
