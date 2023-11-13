import java.util.Scanner;

public abstract class producto {
    private String made_in;
    private int numero_unidades;
    private String [] nacionalidades = {"USA", "España", "Francia", "Japon"};
    private Scanner datos = new Scanner(System.in);

    public producto() {
        this.numero_unidades = (int)(Math.random()*11+1);
        boolean salida = false;
        String seleccion="";
        
        do {
            try {
                System.out.println("Elige un valor de nacionalidad: ");
                for (int i = 0; i < nacionalidades.length; i++) {
                    System.out.println((i+1) + ":" + this.nacionalidades[i]);
                }
                seleccion = datos.nextLine();
                for (String actual : this.nacionalidades) {
                    if (actual.equalsIgnoreCase(seleccion)) {
                        this.made_in = actual;
                        salida = true;
                    }
                }
                if (salida == false) {
                    throw new excepcion("Has introducido un valor no valido");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (salida == false);
    }


    public void vender() {
        this.numero_unidades--;
    }

    public abstract void mostrar();

    public String getMade_in() {
        return made_in;
    }

    public int getNumero_unidades() {
        return numero_unidades;
    }

    public String[] getNacionalidades() {
        return nacionalidades;
    }

    
}
