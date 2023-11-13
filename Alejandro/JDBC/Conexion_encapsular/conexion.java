package Conexion_encapsular;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class conexion {
    private Scanner datoScanner = new Scanner(System.in);
    private Connection laConnection;
    private Statement miStatement;
    private ResultSet miResultSet;
    private String nombreBase;
    private String tabla;
    private ArrayList<String> losCampos = new ArrayList<>();

    public conexion() throws Exception {
        String host = "jdbc:mysql://localhost:3306/";
        System.out.println("Introduce nombre de la BD: ");
        this.nombreBase = datoScanner.next();
        System.out.println("Introduce nommbre de usuario: ");
        String nombreUsuario = datoScanner.next();
        System.out.println("Introduce contraseña: ");
        String contraseña = datoScanner.next();
        this.laConnection = DriverManager.getConnection(host + this.nombreBase, nombreUsuario, contraseña);
    }

    public boolean comprobarTabla() throws Exception {
        System.out.println("Nombre de la tabla a consultar: ");
        String tabla = datoScanner.next();
        this.miStatement = this.laConnection.createStatement();
        this.miResultSet = this.miStatement.executeQuery("SHOW FULL TABLES FROM " + this.nombreBase);

        while (this.miResultSet.next()) {
            if (tabla.equalsIgnoreCase(miResultSet.getString("Tables_in_" + this.nombreBase))) {
                this.miResultSet.close();
                this.miStatement.close();
                return true;
            }
        }

        this.miResultSet.close();
        this.miStatement.close();
        return false;
    }

    public boolean comprobarCampo() throws Exception {
        System.out.println("Introduce los campos a comprobar: ");
        String campos = datoScanner.next();
        this.losCampos.add(campos);
        this.miStatement = this.laConnection.createStatement();
        this.miResultSet = this.miStatement.executeQuery("Show columns from" + tabla + "from" + nombreBase);

        while (miResultSet.next()) {
            if (campos.equalsIgnoreCase(miResultSet.getString("Field"))) {
                this.miResultSet.close();
                this.miStatement.close();
                return true;
            }
        }

        this.miResultSet.close();
        this.miStatement.close();
        return false;
    }

    public void consultar() throws Exception {
        if (comprobarTabla() && comprobarCampo() && comprobarCampo() && comprobarCampo() == true) {
            this.miStatement = this.laConnection.createStatement();
            this.miResultSet = this.miStatement.executeQuery("Select " + this.losCampos.get(0) + ", "
                    + this.losCampos.get(1) + ", " + this.losCampos.get(2) + " from " + tabla);

            while (miResultSet.next()) {
                System.out.println(this.losCampos.get(0) + ": " + this.miResultSet.getString(this.losCampos.get(0)));
                System.out.println(this.losCampos.get(1) + ": " + this.miResultSet.getString(this.losCampos.get(1)));
                System.out.println(this.losCampos.get(2) + ": " + this.miResultSet.getString(this.losCampos.get(2)));
                System.out.println("-------------------------------------------");
            }
        } else {
            System.out.println("Error");
        }
    }
}
