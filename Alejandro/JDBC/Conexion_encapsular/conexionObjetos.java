package Conexion_encapsular;
public class conexionObjetos {
    public static void main(String[] args) {
        try {
            conexion miConexion = new conexion();
            miConexion.consultar();
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }
}
