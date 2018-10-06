/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 *
 * @author angel
 */
public class ValidacionCredenciales {
    /**
     * asigna las credenciales obtenidas de JSONReader
     */
    private String username;
    private String password;
    private JsonArray datos = new JsonArray();
    private JsonObject info = new JsonObject();
    private boolean aceptado;
        
    /*
    Recibe las credenciales del logIn y verifica si son iguales al del JSON
    */
    public ValidacionCredenciales(String pUser, String pPassword, JsonArray array){
        this.username = pUser;
        this.password = pPassword;
        this.datos = array;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public boolean aceptarUsuario(){        
        while(aceptado == false){
            for (Object o: datos){
            info = (JsonObject) o;
            String user = (String) info.get("username").getAsString();
            String passw = (String) info.get("password").getAsString();
            
            //if(getUsername().equals(user) && getPassword().equals(passw)){
              //  this.aceptado = true;
            //}
            aceptado = (user.equals(username) && this.paš.equals(passw));
        }
    }   return aceptado;
}
    
}
