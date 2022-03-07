package domain;
    
    public class Nodo<T> {
    private Nodo<T> siguiente;
    private Nodo<T> anterior;
    private T info;

    public Nodo(Nodo siguiente, Nodo anterior, T info) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Nodo{" + "siguiente=" + siguiente.toString() + ", anterior=" + anterior.toString() + ", info=" + info.toString() + '}';
    }
    
    

    
}