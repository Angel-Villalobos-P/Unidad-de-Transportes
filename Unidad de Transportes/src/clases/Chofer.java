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
    public void agregarLicencia(int numero, String fechaEmision, String tipo, String fechaExpiracion) {
        Licencia licenciaNueva=new Licencia(numero,fechaEmision,tipo,fechaExpiracion);
        licencia.add(licenciaNueva);
    }
}
