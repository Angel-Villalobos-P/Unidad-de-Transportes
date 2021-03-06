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
import java.util.ArrayList;
/*
 *
 * @author angel
 */
public class FuncionesAdministrador {
    
    public String registrarChofer(String pNombre, String pCedula, String pCorreo, String pTelefono,String pProvincia,String pCanton,String pDistrito,String pSeñas
    ,int numero, String fechaEmision, String tipo, String fechaExpiracion) throws IOException{
        
        ReaderJSON datos=new ReaderJSON();
        JsonArray choferes= datos.Reader("Chofer");
        
        /*for(int elemento=0; elemento <= choferes.size()-1; elemento++){
            Gson g = new Gson();
            Chofer p = g.fromJson(choferes.get(elemento), Chofer.class);
            
             if(pCedula==p.getDatos()){ nose que comparar
                return ("Error, existe una coincidencia de cédula con un pasajero previamente registrado");
        }*/
        Direccion direccion=new Direccion(pProvincia,pCanton, pDistrito, pSeñas);
        Persona info=new Persona(pNombre,pCedula,direccion,pCorreo,pTelefono);
        Licencia nuevaLicencia= new Licencia(numero,fechaEmision,tipo,fechaExpiracion);
        Chofer nuevoChofer=new Chofer(info);
        nuevoChofer.agregarLicencia(nuevaLicencia);
        
        Gson gson=new Gson();
        String obj = gson.toJson(nuevoChofer);
        choferes.add(obj);
        datos.EscribirJson("Chofer",choferes);
        return "El Chofer se ha registrado con éxito";
    }
    
    public  String registrarVehiculo(String pPlaca, String pAnnoFabricacion, String pColor, String pMarca, int pCapacidad, float pKilometraje, int pVin, String pSede) throws IOException{
        ReaderJSON datos=new ReaderJSON();
        JsonArray vehiculos= datos.Reader("Vehiculos");
        
        for(int elemento=0; elemento <= vehiculos.size()-1; elemento++){
            Gson g = new Gson();
            Vehiculo p = g.fromJson(vehiculos.get(elemento), Vehiculo.class);
            
             if(pPlaca==p.getPlaca()){
                return ("Error, existe una coincidencia de placa con un vehiculo previamente registrado");
             }
             if(pVin==p.getVin()){
                 return ("Error, existe una coincidencia de Vin con un vehiculo previamente registrado");
             }
        }
        Vehiculo nuevoVehiculo= new Vehiculo(pPlaca,pAnnoFabricacion,pColor,pMarca,pCapacidad,pKilometraje,pVin,pSede,"Servicio");
        Gson gson=new Gson();
        String obj = gson.toJson(nuevoVehiculo);
        vehiculos.add(obj);
        datos.EscribirJson("Vehiculos",vehiculos);
        return "Se ha registrado correctamente";
    }
    
    public Object listarViajes(String busqueda) throws IOException{
        ReaderJSON listaViajes=new ReaderJSON();
        JsonArray viajes= listaViajes.Reader("Viajes");
        ArrayList viajesEncontrados=new ArrayList();
        
        for(int elemento=0; elemento <= viajes.size()-1; elemento++){
            Gson g = new Gson();
            Viaje p = g.fromJson(viajes.get(elemento), Viaje.class);
            
             if(busqueda==p.getEstado()){
                viajesEncontrados.add(p);
             }
             if(busqueda==p.getDestino()){  //Falta el de la feha pero como es de tipo date no me deja comparar
                viajesEncontrados.add(p);
             }
        }
        return viajesEncontrados;
    }
    
    public  String aprobarSolicitudDeViaje(Viaje viajePendiente) throws IOException{
        ReaderJSON listaViajes=new ReaderJSON();
        JsonArray choferes= listaViajes.Reader("Choferes");
        JsonArray vehiculo= listaViajes.Reader("Vehiculos");
       
        Gson gson=new Gson();
        int sizeChof=choferes.size();
        int sizeVehi= vehiculo.size();
        int numero = (int) (Math.random() * sizeChof) + 1;
        int num = (int) (Math.random() * sizeVehi) + 1;
        Persona choferElegido = gson.fromJson(choferes.get(numero), Persona.class);
        Vehiculo vehiculoAsignado=gson.fromJson(choferes.get(num), Vehiculo.class);
        
        viajePendiente.setEstado("Aprobado");
        viajePendiente.setChofer(choferElegido.getNombre()+choferElegido.getTelefono());
        viajePendiente.setVehiculo(vehiculoAsignado.getPlaca());
        
        return"Este viaje ha sido aprobado";
    }
            
    
    public String registrarNuevaSecretaria(String pNombreCompleto, String pDepartamento, String pUsername, String pTelefono, String pPassword,String pCorreo) throws IOException{
        ReaderJSON datos=new ReaderJSON();
        JsonArray secretarias= datos.Reader("Secretaria");
     
        
        for(int elemento=0; elemento <= secretarias.size()-1; elemento++){
            Gson g = new Gson();
            Funcionario p = g.fromJson(secretarias.get(elemento), Funcionario.class);
//JsonObject pasajero = pasajeros.get(elemento).getAsJsonObject();
            
            if(pNombreCompleto==p.getNombreCompleto() ){
                return ("Error, existe una coincidencia con los datos de una secreetaria previamente registrada");
            }
        }
        if(validarContraseña(pPassword)==true){
            Funcionario nuevoFuncionario=new Funcionario(pNombreCompleto,pDepartamento,pUsername,pTelefono,pPassword,pCorreo);
            String mensaje=nuevoFuncionario.getPassword()+nuevoFuncionario.getUsername();
            EnviarCorreo correo=new EnviarCorreo(mensaje,pCorreo,"Datos para ingresar ");
            correo.SendMail();
            
            Gson gson=new Gson();
            String obj = gson.toJson(nuevoFuncionario);
            secretarias.add(obj);
            datos.EscribirJson("Secretaria",secretarias);
            return"Se creó exitosamente";
        } 
        else{
            return"Error en la contraseña";
        }
    }
    
   
    public boolean validarContraseña(String password){
        
        if (password.length()<8 || password.length()>12){
            return false;
        }
        if (password.indexOf("!")==-1 || password.indexOf("#")==-1 || password.indexOf("$")==-1|| password.indexOf("@")==-1){
            return false;
        }
        else{
            return true;
        }    
    }
  
    
    
    public void consultarDatos(){
        
    }
    
}
