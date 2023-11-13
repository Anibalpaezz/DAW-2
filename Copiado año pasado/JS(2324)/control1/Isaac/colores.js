var tabla = document.getElementById("colores");

for (var i = 0; i < 10; i++) {
    var tr = document.createElement("tr");
    for (var b = 0; b < 10; b++) {
        var td = document.createElement("td");
        td.setAttribute("id", i + "-" + b);
        td.addEventListener("click", click);
        tr.appendChild(td);
    }
    tabla.appendChild(tr);
}

function click(e) {
    var clickeado = e.currentTarget;
    var id = clickeado.id;
    if (clickeado.style.backgroundColor == "red") {
        alert("Ya esta clikeado");
    }
    else {


        for (var i = 0; i < 10; i++) {
            for (var b = 0; b < 10; b++) {
                document.getElementById(i + "-" + b).style.backgroundColor = "white";
            }
        }
        console.log("entra");

        console.log(id);
        idT = id.split("-");
        console.log(idT);
        document.getElementById(idT[0] + "-" + idT[1]).style.backgroundColor = "green";
        for (var i = -1; i < 2; i++) {
            for (var b = -1; b < 2; b++) {
                var column = parseInt(idT[0]) + i;
                var fil = parseInt(idT[1]) + b;
                if (document.getElementById(column + "-" + fil) !== null) {
                    document.getElementById(column + "-" + fil).style.backgroundColor = "green";
                }
            }
        }
        clickeado.style.backgroundColor = "red";
    }
}