package clases;
import java.util.ArrayList;

public class Funcionario {
    private String nombreCompleo;
    private String departamento;
    private String username;
    private String telefono;
    private String password;
    private String tipo;
    private ArrayList<Funcionario> administrador;
    private ArrayList<Funcionario> secretaria;

    public Funcionario(String pNombreCompleto, String pDepartamento, String pUsername, String pTelefono, String pPassword) {
        setNombreCompleo(pNombreCompleto);
        setDepartamento(pDepartamento);
        setUsername(pUsername);
        setTelefono(pTelefono);
        setPassword(pPassword);

    }

    public String getNombreCompleo() {
        return nombreCompleo;
    }

    public void setNombreCompleo(String pNombreCompleto) {
        nombreCompleo = pNombreCompleto;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String pTipo) {
        tipo = pTipo;
    }

    public ArrayList<Funcionario> getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Funcionario pAdministrador) {
        administrador.add(pAdministrador);
    }

    public ArrayList<Funcionario> getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Funcionario pSecretaria) {
        secretaria.add(pSecretaria);
    }
}