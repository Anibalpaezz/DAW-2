public class peliculaDVD extends producto {
    private String nombre;
    private String director;
    private double precio;

    public peliculaDVD(String nombre, String director, double precio) {
        super();
        this.nombre = nombre;
        this.director = director;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "La pelicula se llama: " +  this.nombre + 
                "\n el director es: " + this.director + 
                "\n su precio es: " + this.precio + 
                "\n su nacionalidad es: " + this.getMade_in() + 
                "\n hay " + this.getNumero_unidades() +  "unidades.";
    }

    public void mostrar() {
        System.out.println(toString());
    }
}
