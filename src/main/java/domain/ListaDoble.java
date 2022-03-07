
package domain;



public class ListaDoble {
    private Nodo<Apuesta> inicio;
    private Nodo<Apuesta> finish;
    //constructor
    public ListaDoble(){
        inicio=null;
        finish=null;
    }
    //insertar
    public void insertarAlInicio(Apuesta info){
        if(inicio==null){
            inicio= new Nodo(null, null, info);
            finish= inicio;
        }else{
            Nodo<Apuesta> nuevo = new Nodo(inicio, null, info);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
        }
    }
    public void insertarAlFinal(Apuesta dato){
        if(inicio==null){
            finish= new Nodo(null, null, dato);
            inicio = finish;
        }else{
            Nodo<Apuesta> nuevo = new Nodo(null, finish, dato);
            finish.setSiguiente(nuevo);
            finish=nuevo;
        }
    }
    //imprimit datos inicio final, y viceversa
    public void imprimirInicioFin(){
        Nodo temporal=inicio;
        while (temporal!=null) {
            System.out.println(temporal.getInfo());
            temporal=temporal.getSiguiente();
        }
    }
    public void imprimirFinInicio(){
        Nodo<Apuesta> temporal=finish;
        while (temporal!=null) {
            System.out.println(temporal.getInfo());
            temporal=temporal.getAnterior();
        }
    }
    public Nodo getInicio() {
        return inicio;
    }
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    public Nodo getFinish() {
        return finish;
    }
    public void setFinish(Nodo finish) {
        this.finish = finish;
    }

}
