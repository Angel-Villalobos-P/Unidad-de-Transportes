package clases;

public class Direccion {
    private String provincia;
    private String canton;
    private String distrito;
    private String señas;
    private String direccionCompleta;

    public Direccion(String pProvincia, String pCanton, String pDistrito, String pSeñas){
        setProvincia(pProvincia);
        setCanton(pCanton);
        setDistrito(pDistrito);
        setSeñas(pSeñas);
    }

    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String pProvincia) {
        provincia = pProvincia;
    }
    public String getCanton() {
        return canton;
    }
    public void setCanton(String pCanton) {
        canton = pCanton;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String pDistrito) {
        distrito = pDistrito;
    }
    public String getSeñas() {
        return señas;
    }
    public void setSeñas(String pSeñas) {
        señas = pSeñas;
    }
    public String getDireccionCompleta(){
        direccionCompleta+= "Provincia: "+ provincia+". Cantón:"+ canton+". Distrito: "+distrito+". "+señas;
        return direccionCompleta;
    }
}
