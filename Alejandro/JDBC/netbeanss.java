import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

public class netbeanss {
    public static void main(String[] args) {
        try {
            Scanner miScanner = new Scanner(System.in);
            String ruta, bd, usuario, password, tabla;
            System.out.println("Nombre de la BD");
            bd = miScanner.nextLine();
            System.out.println("Nombre de usuario");
            usuario = miScanner.nextLine();
            System.out.println("Password del usuario");
            password = miScanner.nextLine();
            ruta = "jdbc://mysql:/localhost:3306/" + bd;
            Connection mConnection = DriverManager.getConnection(ruta, usuario, password);
            Statement miStatement = mConnection.createStatement();
            System.out.println("Tabla a mostrar");
            tabla = miScanner.nextLine();
            ResultSet mResultSet = miStatement.executeQuery("Select * from" + tabla);
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
