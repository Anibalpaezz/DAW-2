public class ejercicio1 {

    public void mostrar_menu() {
        System.out.println("Elige una opcion valida");
        System.out.println("-");
        System.out.println("-");
        System.out.println("-");
        System.out.println("-");
        System.out.println("-");
        System.out.println("G-");
        System.out.println("S-");
    }
    

    public static void main(String[] args) {
        tienda latienda = new tienda();
        System.out.println(latienda.añadir_juego());
    }
}
