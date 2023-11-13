import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner numeroScanner = new Scanner(System.in);

        int numero=0, ceros=0, positivos=0, total=0, mayor=0, posicion=0;
        double media=0;

        do {
            System.out.print("Introduce un numero: ");
            numero = numeroScanner.nextInt();
            if (numero>0) {
                positivos++;
                total++;
            } else if (numero==0) {
                ceros++;
                total++;
            }
            if (numero>=0) {
                media=media + numero;
            }
            if (numero>mayor) {
                mayor=numero;
                posicion++;
            }
        } while (numero>=0);
        

        System.out.println("Hay " + ceros + " ceros");
        System.out.println("Hay " + positivos + " positivos");
        System.out.println("La media es: " + media/total);
        System.out.println("El mayor es: " + mayor + " en la posicion " + posicion);

    }
}