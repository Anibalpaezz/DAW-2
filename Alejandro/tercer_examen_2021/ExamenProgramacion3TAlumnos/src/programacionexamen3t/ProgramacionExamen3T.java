package programacionexamen3t;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;

public class ProgramacionExamen3T {
    public static String[] obtenerPaths(String ruta, String[] losPaths) {
        try {
            FileReader flujoLector = new FileReader(ruta);
            BufferedReader elLector = new BufferedReader(flujoLector);

            losPaths[0] = elLector.readLine();
            losPaths[1] = elLector.readLine();

            elLector.close();
            flujoLector.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        return losPaths;
    }

    public static boolean compruebaArchivos(String path) {
        File elArchivo = new File(path);
        return elArchivo.exists();
    }

    public static infoEmpresa leeAcciones(String rutaAcciones) {
        infoEmpresa laEmpresa = new infoEmpresa();

        try {
            FileReader flujoLector = new FileReader(rutaAcciones);
            BufferedReader elLector = new BufferedReader(flujoLector);

            String linea = elLector.readLine();

            do {
                String[] infoAcciones = new String[4];
                infoAcciones = linea.split(":");
                Acciones nuevaAcciones = new Acciones(Integer.valueOf(infoAcciones[0]),
                infoAcciones[1], Integer.valueOf(infoAcciones[2]), Double.valueOf(infoAcciones[3]));
                laEmpresa.añadirAcciones(nuevaAcciones);
                linea = elLector.readLine();
            } while (linea!=null);
            elLector.close();
            flujoLector.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        return laEmpresa;
    }

    public static void guardarDatos(infoEmpresa lEmpresa, String path) {
        try {
            FileOutputStream elFlujo = new FileOutputStream(path);
            ObjectOutputStream miObjectOutputStream = new ObjectOutputStream(elFlujo);
            miObjectOutputStream.writeObject(lEmpresa);
            System.out.println("Mi empresa serializada");
            miObjectOutputStream.close();
            elFlujo.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
   
    public static void main(String[] args) {
        String ruta = "path.txt";
        String [] losPaths = new String[2];

        losPaths = obtenerPaths(ruta, losPaths);

        if (compruebaArchivos(losPaths[1])) {
            //Existe debo cargarlo
            System.out.println("Existe");
        } else {
            //No existe debo crearlo
            System.out.println("No existe");
            infoEmpresa lEmpresa = leeAcciones(losPaths[0]);
            lEmpresa.verAcciones();
        }

        try {
            
        } catch (Exception e) {
            System.out.println("Fatal error");
        }
    }
}
