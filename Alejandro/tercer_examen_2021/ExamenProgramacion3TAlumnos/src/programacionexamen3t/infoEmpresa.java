package programacionexamen3t;
import java.io.Serializable;
import java.util.ArrayList;

public class infoEmpresa implements Serializable {
    private ArrayList <Acciones> lasAcciones;

    public infoEmpresa() {
        this.lasAcciones = new ArrayList<>();
    }

    public void verAcciones() {
        for(Acciones actual:this.lasAcciones){
            System.out.println(actual.toString());
        }
    }

    public boolean añadirAcciones(Acciones lAcciones) {
        return this.lasAcciones.add(lAcciones);
    }

    public void eliminarAcciones(int id) {
        for(Acciones actual:this.lasAcciones) {
            if (id == actual.getId()) {
                this.lasAcciones.remove(actual);
            }
        } for (int i = 0; i < this.lasAcciones.size(); i++) {
            this.lasAcciones.get(i).setId(i+1);;
        }

    }
}
