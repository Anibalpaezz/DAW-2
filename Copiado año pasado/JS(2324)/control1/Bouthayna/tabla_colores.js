var tabla = document.createElement("table");
var celdaAnterior = null; // Variable para almacenar la celda anterior
var celdasAmarillas = []; // Almacena las celdas adyacentes que se volvieron amarillas

for (var i = 0; i < 10; i++) {
    var fila = tabla.insertRow(i);
    for (var j = 0; j < 10; j++) {
        var celda = fila.insertCell(j);

        celda.addEventListener("click", function (event) {
            var fila = event.target.parentNode.rowIndex;
            var columna = event.target.cellIndex;

            // Restablecer el color de la celda anterior (si existe) a blanco
            if (celdaAnterior !== null) {
                celdaAnterior.style.backgroundColor = 'white';
            }

            // Restablecer el color de las celdas adyacentes que se volvieron amarillas a blanco
            for (var i = 0; i < celdasAmarillas.length; i++) {
                celdasAmarillas[i].style.backgroundColor = 'white';
            }
            celdasAmarillas = []; // Limpiar el arreglo de celdas amarillas

            event.target.style.backgroundColor = 'red';
            alert("Hiciste clic en esta celda");
            // Almacenar la celda actual como celda anterior
            celdaAnterior = event.target;

            cambiarColorCeldasAdyacentes(tabla, fila, columna, celdasAmarillas);
        });
    }
}

document.body.appendChild(tabla);

function cambiarColorCeldasAdyacentes(tabla, fila, columna, celdasAmarillas) {
    var direcciones = [
        { x: -1, y: 0 }, // Arriba  Este objeto indica que para moverse hacia arriba, debes restar 1 a la fila (x) y mantener la columna (y) sin cambios. En tÃ©rminos de coordenadas, moverse hacia arriba implica ir a la fila anterior.
        { x: 1, y: 0 },  // Abajo  sumar 1 a la fila(x) y mantener la columna(y) sin cambios
        { x: 0, y: -1 }, // Izquierda mantener la fila(x) y restar 1 a la columna(y)
        { x: 0, y: 1 },  // Derecha mantener la fila(x) y sumar 1 a la columna(y)
        //las esquinas 
        { x: -1, y: -1 },
        { x: 1, y: 1 },
        { x: -1, y: 1 },
        { x: 1, y: -1 }
    ];

    for (var i = 0; i < direcciones.length; i++) {
        var nuevaFila = fila + direcciones[i].x;
        var nuevaColumna = columna + direcciones[i].y;

        if (nuevaFila >= 0 && nuevaFila < tabla.rows.length && nuevaColumna >= 0 && nuevaColumna < tabla.rows[nuevaFila].cells.length) {
            var celda = tabla.rows[nuevaFila].cells[nuevaColumna];
            celda.style.backgroundColor = 'yellow';
            celdasAmarillas.push(celda); // Agregar la celda al arreglo de celdas amarillas
        }
    }
}
