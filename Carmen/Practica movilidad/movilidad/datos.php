<?php
    include("estilos.php");
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        if (isset($_POST['tipo'])) {
            $tipo = $_POST['tipo'];
    
            if ($tipo == 'taxis') {
                echo "
                    <h1 class='h1'>Taxis</h1>
                    <hr>
                    <form id=\"emt\" action=\"". htmlspecialchars($_SERVER["PHP_SELF"])."\" method=\"POST\">
                        <div class='mb-3'>
                            <label for='matricula' class='form-label'>Matrícula:</label>
                            <input type='text' class='form-control' id='matricula' placeholder='Ingrese la matrícula'>
                        </div>
                        <div class='mb-3'>
                            <label for='nombreTaxista' class='form-label'>Nombre del taxista:</label>
                            <input type='text' class='form-control' id='nombreTaxista' placeholder='Ingrese el nombre del taxista'>
                        </div>
                        <div class='mb-3'>
                            <label for='certificado' class='form-label'>Nombre del taxista:</label>
                            <input type='file' class='form-control' id='certificado' placeholder='Certificado'>
                        </div>
                    </form>
                    <input type='submit' value='Enviar' class='btn btn-primary'>
                    <input type='button' onClick='history.go(-1)' value='Volver' class='btn btn-danger'>
                    <input type='button' onClick='history.go(-2)' value='A casa' class='btn btn-success'>
                ";
            } elseif ($tipo == 'logistica') {
                echo "
                    <h1 class='h1'>Logistica</h1>
                    <hr>
                    <form>
                        <div class='mb-3'>
                            <label for='matricula' class='form-label'>Matrícula:</label>
                            <input type='text' class='form-control' id='matricula' placeholder='Ingrese la matrícula'>
                        </div>
                        <div class='mb-3'>
                            <label for='nombreEmpresa' class='form-label'>Nombre de empresa:</label>
                            <input type='text' class='form-control' id='nombreEmpresa' placeholder='Ingrese el nombre de la empresa'>
                        </div>
                    </form>
                    <input type='submit' value='Enviar' class='btn btn-primary'>
                    <input type='button' onClick='history.go(-1)' value='Volver' class='btn btn-danger'>
                    <input type='button' onClick='history.go(-2)' value='A casa' class='btn btn-success'>
                ";
            } elseif ($tipo == 'emt') {
                echo "
                    <h1 class='h1'>Empresa municipal de transportes</h1>
                    <hr>
                    <form>
                        <div class='mb-3'>
                            <label for='matricula' class='form-label'>Matrícula:</label>
                            <input type='text' class='form-control' id='matricula' placeholder='Ingrese la matrícula'>
                        </div>
                        <div class='mb-3'>
                            <label for='linea' class='form-label'>Linea:</label>
                            <input type='text' class='form-control' id='linea' placeholder='Ingrese el numero de linea'>
                        </div>
                    </form>
                    <input type='submit' value='Enviar' class='btn btn-primary'>
                    <input type='button' onClick='history.go(-1)' value='Volver' class='btn btn-danger'>
                    <input type='button' onClick='history.go(-2)' value='A casa' class='btn btn-success'>
                ";
            } elseif ($tipo == 'residentes') {
                echo "
                    <h1 class='h1'>Residentes o turistas</h1>
                    <hr>
                    <form>
                        <div class='mb-3'>
                            <label for='matricula' class='form-label'>Matrícula:</label>
                            <input type='text' class='form-control' id='matricula' placeholder='Ingrese la matrícula'>
                        </div>
                        <div class='mb-3'>
                            <label for='direccion' class='form-label'>Domicilio u hotel:</label>
                            <input type='text' class='form-control' id='direccion' placeholder='Ingrese la direccion'>
                        </div>
                        <div class='mb-3'>
                            <label for='fechaEntrada' class='form-label'>Fecha llegada:</label>
                            <input type='date' class='form-control' id='fechaEntrada' placeholder='Ingrese la fecha de entrada'>
                        </div>
                        <div class='mb-3'>
                            <label for='fechaSalida' class='form-label'>Fecha salida:</label>
                            <input type='date' class='form-control' id='fechaSalida' placeholder='Ingrese la fecha de salida'>
                        </div>
                        <div class='mb-3'>
                            <label for='certificado' class='form-label'>Certificado:</label>
                            <input type='file' class='form-control' id='certificado' placeholder='Certificado'>
                        </div>
                    </form>
                    <input type='submit' value='Enviar' class='btn btn-primary'>
                    <input type='button' onClick='history.go(-1)' value='Volver' class='btn btn-danger'>
                    <input type='button' onClick='history.go(-2)' value='A casa' class='btn btn-success'>
                ";
            } elseif ($tipo == 'servicios') {
                echo "
                    <h1 class='h1'>Servicios</h1>
                    <hr>
                    <form>
                        <div class='mb-3'>
                            <label for='matricula' class='form-label'>Matrícula:</label>
                            <input type='text' class='form-control' id='matricula' placeholder='Ingrese la matrícula'>
                        </div>
                        <div class='mb-3'>
                            <label for='nombreServicio' class='form-label'>Nombre del servicio:</label>
                            <input type='text' class='form-control' id='nombreServicio' placeholder='Ingrese el nombre del servicio'>
                        </div>
                    </form>
                    <input type='submit' value='Enviar' class='btn btn-primary'>
                    <input type='button' onClick='history.go(-1)' value='Volver' class='btn btn-danger'>
                    <input type='button' onClick='history.go(-2)' value='A casa' class='btn btn-success'>
                ";
            }
        }
    }
