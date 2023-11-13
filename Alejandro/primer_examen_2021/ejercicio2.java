import java.util.Scanner;

public class ejercicio2 {
    public static Scanner datoScanner = new Scanner(System.in);

    public static int limite_inferior;
    public static int limite_superior;
    static int numero;
    static int tamaño;

    public static boolean es_primo_con_limite(int numero, int limite_inferior, int limite_superior) {
        if (numero>limite_inferior || numero>limite_superior) {
            return false;
        } else {
            for (int i = numero; i > 1 ; i--) {
                if(numero%i==0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int[] crea_ini_array() {
        int tamaño = 0;
        int[] array=null;

        do {
            System.out.print("Introduce el tamaño: ");
            tamaño = datoScanner.nextInt();
            if (tamaño<=0) {
                System.out.println("Has introducido un dato no valido");
            } else {
                array = new int[tamaño];
            }
        } while (tamaño<=0);
        return array;
    }

    public static void rellenar_array(int [] array) {
        boolean valido = false;
        int actual;
        for (int i = 0; i < array.length; i++) {
            valido=false;
            while (valido==false) {
                System.out.print("Introduce valores para el array: ");
                actual = datoScanner.nextInt();
                valido = es_primo_con_limite(actual, limite_inferior, limite_superior);
                if (valido==true) {
                    array[i] = actual;
                    System.out.println("Valor introducido");
                } else {
                    System.out.println("Valor no valido");
                }
            }

        }
    }

    public static void pide_limites() {
        boolean valido = false;
        do {
            System.out.print("Ingresa el limite inferior: ");
            limite_inferior = datoScanner.nextInt();
            System.out.print("Ingresa el limite superior: ");
            limite_superior = datoScanner.nextInt();
            if (limite_superior>limite_inferior) {
                if (limite_inferior>=0 && limite_superior>=0) {
                    valido=true;
                }
            }
        } while (valido==true);
        System.out.println("Los limites son " + limite_superior + " para el superior y " + limite_inferior + " para el inferior");
    }

    public static void mostrar_array(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        //int[] array = crea_ini_array();
        //System.out.println(array.length);
        //System.out.println(es_primo_con_limite(3, 1, 7));
        pide_limites();
        int [] array = crea_ini_array();
        rellenar_array(array);
        mostrar_array(array);
    }
}
