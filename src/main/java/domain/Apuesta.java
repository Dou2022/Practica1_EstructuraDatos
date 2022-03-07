package domain;

public class Apuesta{
    
    private String nombre;
    private double monto;
    private int[] posiciones;
    private int puntos;
    private int pasos;
    

    public Apuesta(String nombre, double monto, int[] posiciones) {
        this.nombre = nombre;
        this.monto = monto;
        this.posiciones = posiciones;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int[] getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(int[] posiciones) {
        this.posiciones = posiciones;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }
    
    private String listadoPosiciones(){
        String lista = "";
        for (int i = 0; i < getPosiciones().length; i++) {
            if (getPosiciones()[i] != 0) {
                lista +=  ","+getPosiciones()[i];
            }
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Apuesta{" + "nombre=" + nombre + ", monto=" + monto + ", posiciones=" +listadoPosiciones()+ ", puntos=" + puntos + '}';
    }
}


