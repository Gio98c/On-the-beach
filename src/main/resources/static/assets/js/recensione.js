
function stelline(star) {

    //var span = "<span class='fa fa-star checked'></span>";
    var tag = document.createElement("span");
    tag.className = "fa fa-star checked";
    var takeFather = document.getElementById("headRecensione");
    for(let i=0; i<star; ++i)
        takeFather.appendChild(tag);
}