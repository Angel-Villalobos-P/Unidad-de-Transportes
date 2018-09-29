
package clases;

/**
 *
 * @author angel
 */
public class Empresa {
    private String razonSocial;
    private String cedulaJuridica;
    private String telefono;
    private String direccion;

    public Empresa(String razonSocial, String cedulaJuridica, String telefono, String direccion) {
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
