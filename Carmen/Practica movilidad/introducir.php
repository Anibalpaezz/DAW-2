<?php
    include("estilos.php");
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        if (isset($_POST['opcion'])) {
            $opcion = $_POST['opcion'];

            if ($opcion == 'introducir') {
                echo "
                    <h1 class='h1'>Tipo de permiso</h1>
                    <hr>
                    <form action='datos.php' method='post'>
                        <div class='mb-3'>
                            <label for='tipo' class='form-label'>Seleccione el tipo:</label>
                            <select class='form-select' name='tipo' id='tipo'>
                                <option value='taxis'>Taxis</option>
                                <option value='logistica'>Logística</option>
                                <option value='emt'>EMT</option>
                                <option value='residentes'>Residentes/Turistas</option>
                                <option value='servicios'>Servicios</option>
                            </select>
                        </div>
                        <input type='submit' value='Enviar' class='btn btn-primary'>
                        <input type='button' onClick='history.go(-1)' value='Volver' class='btn btn-danger'>
                    </form>
                ";
            } elseif ($opcion == 'infractores') {
                echo "Infractores";
            }
        }
    }
?>
