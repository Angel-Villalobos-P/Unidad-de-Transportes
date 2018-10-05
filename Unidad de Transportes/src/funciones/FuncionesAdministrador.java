/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import clases.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.io.IOException;
/**
 *
 * @author angel
 */
public class FuncionesAdministrador {
    
    public String registrarChofer(String pNombre, String pCedula, String pCorreo, String pTelefono,String pProvincia,String pCanton,String pDistrito,String pSeñas
    ,int numero, String fechaEmision, String tipo, String fechaExpiracion) throws IOException{
        ReaderJSON datos=new ReaderJSON();
        JsonArray pasajeros= datos.Reader("Chofer");
       //Verificar si no esta registrado
        Direccion direccion=new Direccion(pProvincia,pCanton, pDistrito, pSeñas);
        Persona info=new Persona(pNombre,pCedula,direccion,pCorreo,pTelefono);
        Chofer nuevoChofer= new Chofer(info,numero,fechaEmision,tipo,fechaExpiracion);
        
        Gson gson=new Gson();
        String obj = gson.toJson(nuevoChofer);
        pasajeros.add(obj);
        datos.EscribirJson("Chofer",pasajeros);
        return "El Chofer se ha registrado con éxito";
    }
    
    public void registrarVehiculo(String pPlaca, String pAnnoFabricacion, String pColor, String pMarca, int pCapacidad, float pKilometraje, int pVin, String pSede, String pEstado){
        //Verificar si no está registrado
        Vehiculo nuevoVehiculo= new Vehiculo(pPlaca,pAnnoFabricacion,pColor,pMarca,pCapacidad,pKilometraje,pVin,pSede, pEstado);
        //Agregar el vehiculo al JSON
    }
    
    public void listarViajes(){
        
    }
    
    public void aprobarSolicitudDeViaje(){
        
    }
    
    public void registrarNuevaSecretaria(){
        
        
        
    }
    
    public void consultarDatos(){
        
    }
    
}
