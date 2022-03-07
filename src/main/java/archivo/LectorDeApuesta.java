
package archivo;

import domain.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;

public class LectorDeApuesta {

     //File=archivo
    //FileReader necesita a un archivo para poder leerlo
    //BufferedReader lee el texto del archivo
    public static ListaDoble leerFichero(File archivo, JTextArea text) throws FileNotFoundException, IOException {
        // crea el arreglo para ingresar el vehiculo
        
        ListaDoble lista = new ListaDoble();
        
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        
        while ((linea = br.readLine()) != null) {
            
            //con la linea leida, separamos los campos
            String[] campos = linea.split(",");
            
            //evaluo que tenga como parametros minimos el nombre y el monto
            if (campos.length>2) {
                Apuesta nuevo = ConstructorApuesta.construirApuesta(campos);
                //Se agrega a una pila entonces 
                lista.insertarAlFinal(nuevo);
            }
            
            text.append("\n"+linea);
        }
        fr.close(); 
        return lista;
        
    }
    
}
