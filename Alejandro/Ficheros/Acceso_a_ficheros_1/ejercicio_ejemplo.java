package Ficheros.Acceso_a_ficheros_1;

import java.io.FileReader;
import java.io.IOException;

public class ejercicio_ejemplo {

    public static void main(String[] args) {
        try {
            FileReader mi_lector = new FileReader("C:\\Users\\Anibal\\OneDrive\\Documentos\\DAW\\2º\\Alejandro\\Ficheros\\Acceso_a_ficheros_1\\ejemplo.txt");

            int caracter = mi_lector.read();
            while (caracter !=-1) {
                System.out.print((char)caracter);
                caracter = mi_lector.read();
            }
            System.out.println("\n" + "Lectura completada");
            mi_lector.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }
    }
}
