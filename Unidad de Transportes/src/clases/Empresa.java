
package clases;

/**
 *
 * @author angel
 */
public class Empresa {
    private String razonSocial;
    private String cedulaJuridica;
    private String telefono;
    private Direccion direccion;

    public Empresa(String razonSocial, String cedulaJuridica, String telefono) {
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.telefono = telefono;
        
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
