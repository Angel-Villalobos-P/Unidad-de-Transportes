package clases;

public class Funcionario {
    private String nombreCompleto;
    private String departamento;
    private String username;
    private String telefono;
    private String password;
    private String correo;
   
    

    public Funcionario(String nombreCompleto, String departamento, String username, String telefono, String password,String correo) {
        this.nombreCompleto = nombreCompleto;
        this.departamento = departamento;
        this.username = username;
        this.telefono = telefono;
        this.password = password;
        this.correo=correo;
        
    }

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String pNombreCompleto) {
        nombreCompleto = pNombreCompleto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String pDepartamento) {
        departamento = pDepartamento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String pUsername) {
        username = pUsername;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String pTelefono) {
        telefono = pTelefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pPassword) {
        password = pPassword;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}