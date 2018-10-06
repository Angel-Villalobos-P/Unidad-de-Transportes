/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import clases.Direccion;
import clases.Persona;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.io.IOException;

/**
 *
 * @author M Fer
 */


public class FuncionesSecretaria {
    

    public String registrarPasajero(String pNombre, String pCedula, String pCorreo, String pTelefono,String pProvincia, String pCanton, String pDistrito, String pSeñas) throws IOException{
        ReaderJSON datos=new ReaderJSON();
        JsonArray pasajeros= datos.Reader("Pasajeros");
     
        
        for(int elemento=0; elemento <= pasajeros.size()-1; elemento++){
            Gson g = new Gson();
            Persona p = g.fromJson(pasajeros.get(elemento), Persona.class);
//JsonObject pasajero = pasajeros.get(elemento).getAsJsonObject();
            
            if(pCedula==p.getCedula() ){
                return ("Error, existe una coincidencia de cédula con un pasajero previamente registrado");
            }
        }
        Gson gson=new Gson();
        Direccion direccion=new Direccion(pProvincia,pCanton, pDistrito, pSeñas);
        Persona pasajero= new Persona(pNombre, pCedula, direccion, pCorreo, pTelefono);
        String obj = gson.toJson(pasajero);
        pasajeros.add(obj);
        datos.EscribirJson("Pasajeros",pasajeros);
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

