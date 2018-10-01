package clases;
import java.util.ArrayList;

public class Chofer {

    private Persona datos;
    private ArrayList<Licencia> licencia;

    public Persona getDatos() {
        return datos;
    }
    public void setDatos(Persona pDatos) {
        datos = pDatos;
    }
    public ArrayList<Licencia> getLicencia() {
        return licencia;
    }
    public void setLicencia(ArrayList<Licencia> pLicencia) {
        licencia = pLicencia;
    }
}
