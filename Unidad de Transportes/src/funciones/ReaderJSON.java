
package funciones;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;

/**
 *
 * @author M Fer
 */
public class ReaderJSON {
    public void Reader(String nombre) throws java.io.IOException {
	
	        JsonParser parser = new JsonParser();
	        FileReader fr = new FileReader(nombre+".json");
	        JsonElement datos = parser.parse(fr);
	        dumpJSONElement(datos);
	    }
	//Se tendría que hacer una por JSON
    
	public static void dumpJSONElement(JsonElement elemento) {
	JsonArray array = elemento.getAsJsonArray();
	
        int i;
	for(i=0;i<8;i++) {
		JsonObject obj = array.get(i).getAsJsonObject();
		//Empresa objeto=new Empresa(obj.get("Cedula Juridica",..));
                
		}

	}
}
