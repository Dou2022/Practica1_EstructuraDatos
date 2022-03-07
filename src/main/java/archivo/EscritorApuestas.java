
package archivo;

import domain.Apuesta;
import domain.Nodo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class EscritorApuestas {
    
    public static void escribirApuestas(Nodo<Apuesta> ingresar,String ruta){
        
    Nodo<Apuesta> ingreso = ingresar;
        
     try {
      File myObj = new File(ruta);
      if (myObj.createNewFile()) {
        System.out.println("File creado: " + myObj.getName());
      } else {
        System.out.println("File existe.");
      }
    } catch (IOException e) {
      System.out.println("Un error.");
      e.printStackTrace();
    }    
    try {
      FileWriter myWriter = new FileWriter(ruta);
      while(ingreso != null){
        
           myWriter.write(ingreso.toString()+"\n");
           ingreso = ingreso.getSiguiente();
           
      }
      myWriter.close();
      System.out.println("Termino de escribir.");
    } catch (IOException e) {
      System.out.println("Un error general.");
      e.printStackTrace();
    }
    }
    
}
