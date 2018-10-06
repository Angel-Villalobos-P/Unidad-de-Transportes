
package funciones;

;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author M Fer
 */
public class ReaderJSON {
    public JsonArray Reader(String nombre) throws java.io.IOException {
	
	        JsonParser parser = new JsonParser();
	        FileReader fr = new FileReader(nombre+".json");
	        JsonElement datos = parser.parse(fr);
	        //dumpJSONElement(datos);
                JsonArray array = datos.getAsJsonArray();
                return array;
	    }

    public void EscribirJson(String nombre,JsonArray lista){
            Gson gson=new Gson();
        try{
          
            //Abro stream, crea el fichero si no existe
            FileWriter fw=new FileWriter(nombre+".json");
            //Escribimos en el fichero un String y un caracter 97 (a)
            //String obj = gson.toJson(lista);//convierto el objeto en un  JSON
            //var myJsonString = JSON.stringify(yourArray);
            for(int i=0;i<lista.size();i++){
               String obj = gson.toJson(lista.get(i));
               fw.write(obj);
            }
                   
            //fw.write(97);
            //Cierro el stream
            fw.close(); 
                //Abro el stream, el fichero debe existir
           /* FileReader fr=new FileReader("document.json");
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
            //Cerramos el stream
            fr.close();*/
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }

}
