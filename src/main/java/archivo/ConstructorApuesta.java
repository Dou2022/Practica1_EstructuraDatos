package archivo;

import domain.Apuesta;
import domain.ListaDoble;
import domain.Nodo;


public class ConstructorApuesta {
 
    public static Apuesta construirApuesta(String[] apuesta){
        int[] posiciones = new int[10];
        double cantidad = 0;
        
        try{
            cantidad = Double.parseDouble(apuesta[1]);
            for (int i = 2; i < apuesta.length; i++) {
                posiciones[i-2] = Integer.parseInt(apuesta[i]);
            }
        }catch(Exception e){
            System.out.println("No realizo la convesrsion a int o la conversion de monto "+apuesta[0]);
            posiciones = new int[1];
        }
        
        return new Apuesta(apuesta[0],cantidad,posiciones);
    }
    
    public static void verificarApuesta(Nodo<Apuesta> inicio, ListaDoble errores){
        
        if (inicio == null)
            return;
     
        //Si la apuesta no cumple con los valores de las posiciones eliminar
        if ( !verificarPosiciones( inicio.getInfo().getPosiciones()) ) {
            errores.insertarAlInicio(inicio.getInfo());
            if (inicio.getAnterior()!=null) {
                inicio.getAnterior().setSiguiente(inicio.getSiguiente());
            }
            if (inicio.getSiguiente() != null) {
                inicio.getSiguiente().setAnterior(inicio.getAnterior());
            }
        }
        if (inicio.getSiguiente()!=null) {
            verificarApuesta(inicio.getSiguiente(),errores);
        }else{return;}
                
    }
    private static boolean verificarPosiciones(int[] posiciones){
        
        int[] valores = new int[10];
        //evaluar que el arreglo sea de 10
        if (posiciones.length !=10) { return false; }
        
        // O(n) en la evaluacion de las posiciones de los caballos
        for (int i = 0; i < posiciones.length; i++) {
            //evaluar que los valor de la posicion este en los parametros de 1 a 10
            if (posiciones[i]<=0 || posiciones[i]>10) { return false; }
            //evaluar cada una de las posiciones que no esten repetidas
            if (valores[posiciones[i]-1] == 0) {
                valores[posiciones[i]-1] = posiciones[i];
            } else { return false; }
        }
        
        return true;
    }
    
    public static void conteoApuesta(Nodo<Apuesta> inicio ,int[] posiciones){
        
        if (inicio == null) 
            return;
        
        int contador = 0;
       
        for (int i = 0; i < posiciones.length; i++) {
            if (inicio.getInfo().getPosiciones()[i] == posiciones[i]) {
                contador += 10-i;
            }
        }
        inicio.getInfo().setPuntos(contador);
        
        if (inicio.getSiguiente() != null) {
             conteoApuesta(inicio.getSiguiente(),posiciones);
        }else{return;}
        
    }
    public static void ordenarResultadoPunto(Nodo<Apuesta> inicio){
        if (inicio == null) 
            return;
        
        Nodo<Apuesta> s = inicio.getAnterior();
        
        
        if ( (inicio.getAnterior() != null) && (inicio.getInfo().getPuntos()< s.getInfo().getPuntos()) ) {
            
            Nodo<Apuesta> aux = new Nodo(inicio.getAnterior().getSiguiente(),inicio.getAnterior().getAnterior(),inicio.getAnterior().getInfo());
            inicio.getAnterior().setAnterior(inicio);
            inicio.getAnterior().setSiguiente(inicio.getSiguiente());
            inicio.setSiguiente(inicio.getAnterior());
            inicio.setAnterior(aux.getAnterior());
            ordenarResultadoPunto(inicio);
            
        }else{
            ordenarResultadoPunto(inicio.getSiguiente());
           
            
        }
        
   
              
    }
    
}
