


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

ombrelloni = [];

function prenota(nomeLido) {
    var selectCheckedBoxes = document.querySelector("input:checked");

    if(selectCheckedBoxes.lenght > 0) {
        selectCheckedBoxes.forEach(function (checkBox, indice) {
           console.log(checkBox);
           checkBox.log(checkBox.getAttribute("id"));

           ombrelloni[indice] = checkBox.getAttribute("id");

        });
    } else {
        alert("Si prega di selezionare almeno un elemnto");
    }

    var dataInizio = document.getElementById("dataInizio");
    var dataFine = document.getElementById("dataFine");

    $.ajax({
        type: "POST",
        url: "/prenota",
        data: {"nomeLido" : nomeLido, ombrelloni : ombrelloni, "dataInizio" : dataInizio.value, "dataFIne" : dataFine.value},
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
