<?php
    //Ejemplo de leer linea a linea de un fichero
    /* $leer = fopen('prueba.txt');
    while (!feof($leer)) {
        echo fgetc($leer).'<br>';
    }
    fclose($leer); */

    //Ejemplo de leer el fichero de una vez
    /* $leer = fopen('prueba.txt');
    foreach ($leer as $linea)
    echo $linea.'<br>'; */

    //Ejemplo de mostrar una pagina web de otro sitio aunque las imagenes no se van a mostrar si la URL es relativa
    /* $leer = fopen('https://aulavirtual33.educa.madrid.org/ies.domenicoscarlat.aranjuez/course/view.php?id=60');
    foreach ($leer as $linea)
    echo $linea; */
?>