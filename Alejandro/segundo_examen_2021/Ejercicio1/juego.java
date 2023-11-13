public class juego extends producto {
    private String titulo;
    private String consola;
    private double precio;

    public juego(String titulo, double precio) {
        super();
        this.titulo = titulo;
        this.precio = precio;
        int aleatorio = (int)(Math.random()*3);

        switch (aleatorio) {
            case 0:
                this.consola = "PS5";
                break;
            case 1:
                this.consola = "XBOX ONE S";
                break;
            case 2:
                this.consola = "Switch OLED";
                break;
        }
    }

    @Override
    public String toString() {
        return "El juego se llama: " +  this.titulo + 
                "\n la consola es: " + this.consola + 
                "\n su precio es: " + this.precio + 
                "\n su nacionalidad es: " + this.getMade_in() + 
                "\n hay " + this.getNumero_unidades() +  "unidades.";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println(toString());
    }
}
