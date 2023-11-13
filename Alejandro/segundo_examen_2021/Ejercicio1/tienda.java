import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class tienda {
    private ArrayList <producto> losproductos;
    private double ganancia;
    private Scanner datos = new Scanner(System.in);
    public tienda() {
        this.losproductos = new ArrayList();
        this.ganancia=0;
    }

    public boolean añadir_juego() {
        try {
            System.out.println("Elige el nombre del juego");
            String nombre = datos.nextLine();
            if (nombre.length()<1) {
                throw new excepcion("Has introducido un valor no valido en el nombre");
            }
            System.out.println("Introduce el precio del juego");
            double precio = datos.nextDouble();
            juego juego_actual = new juego(nombre, precio);
            this.losproductos.add(juego_actual);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se ha podido introducir el juego");
            return false;
        }
    }

    public boolean añadir_pelicula() {
        boolean salida = false;
        do {
            try {
            System.out.println("Elige el nombre de la pelicula");
            String nombre = datos.nextLine();
            if (nombre.length()<1) {
                throw new excepcion("Has introducido un valor no valido en el nombre");
            }
            System.out.println("Elige el nombre del director");
            String director = datos.nextLine();
            if (director.length()<1) {
                throw new excepcion("Has introducido un valor no valido en el director");
            }
            System.out.println("Introduce el precio de la pelicula");
            double precio = datos.nextDouble();
            peliculaDVD lapeli = new peliculaDVD(nombre, director, precio);
            this.losproductos.add(lapeli);
            salida = true;
            } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se ha podido introducir el juego");
            datos.next();
            }
        } while (salida == false);
        return salida;
    }

    public void ver_peliculas() {
        Iterator <producto> mIterator = this.losproductos.iterator();
        producto aProducto;
        boolean hay_peliculas = false;
        while (mIterator.hasNext()) {
            aProducto = mIterator.next();

            if (aProducto instanceof peliculaDVD) {
                aProducto.mostrar();
                hay_peliculas = true;
            }
        }
        if (!hay_peliculas) {
            System.out.println("No hay juegos en la tienda");
        }
    }

    public void ver_juegos() {
        Iterator <producto> mIterator = this.losproductos.iterator();
        producto aProducto;
        boolean hay_juegos = false;
        while (mIterator.hasNext()) {
            aProducto = mIterator.next();

            if (aProducto instanceof juego) {
                aProducto.mostrar();
                hay_juegos = true;
            }
        }
        if (!hay_juegos) {
            System.out.println("No hay juegos en la tienda");
        }
    }

    public void vender_producto() {
        System.out.println("Introduce el producto que deseas");
        String actual = datos.nextLine();
        Iterator elIterator = this.losproductos.iterator();
        boolean encontrado = false;
        while (elIterator.hasNext() && encontrado == false) {
            producto aProducto = elIterator.next();
            if (aProducto instanceof juego) {
                 
            }
        }
    }

    public void mostrar_tienda() {
        for (producto actual : this.losproductos) {
            System.out.println(actual);
        }
    }
}
