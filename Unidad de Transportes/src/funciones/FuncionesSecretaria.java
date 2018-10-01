/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;
import clases.Direccion;
import clases.Persona;


/**
 *
 * @author angel
 */
public class FuncionesSecretaria {
    
    public void registrarPasajero(String pNombre, String pCedula, Direccion pDireccion, String pCorreo, String pTelefono){
        for(int elemento=0; elemento <= pasajeros.size()-1; elemento++){
            Persona pasajero= pasajeros.get(elemento);
            if(pCedula==pasajero.getCedula() ){
                return ("Error, esiste una coincidencia de cédula con un pasajero previamente registrado");

            }
        }
        Persona pasajero= new Persona(pNombre, pCedula, pDireccion, pCorreo, pTelefono);
        pasajeros.add(pasajero);
        return "El pasajero se ha registrado con éxito";

    }
    
    public void solicitarServicioDeViaje(){
        
    }
    
    public void listarSolicitudesDeViaje(){
        
    }
    
    public void consultarDetalleDeSolicitud(){
        
    }
    
    public void cancelarSolicitudDeViaje(){
        
    }
    
}
