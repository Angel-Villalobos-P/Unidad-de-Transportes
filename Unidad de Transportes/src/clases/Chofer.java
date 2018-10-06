package clases;
import java.util.ArrayList;

public class Chofer {

    private Persona datos;
    private ArrayList<Licencia> licencia;

    public Chofer(Persona datos) {
        this.datos = datos;
        licencia=new ArrayList<Licencia>();
    }
    
    
    public Persona getDatos() {
        return datos;
    }
    public void setDatos(Persona pDatos) {
        datos = pDatos;
    }
    public ArrayList<Licencia> getLicencia() {
        return licencia;
    }
    public void agregarLicencia(Licencia licenciaNueva) {
        //Licencia licenciaNueva=new Licencia(numero,fechaEmision,tipo,fechaExpiracion);esto se agrega en el main
        licencia.add(licenciaNueva);
    }
}
