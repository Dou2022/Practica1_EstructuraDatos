package controladores;

import archivo.ConstructorApuesta;
import archivo.EscritorApuestas;
import archivo.LectorDeApuesta;
import domain.ListaDoble;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import vista.Inicio;


public class ControladorInicio {
    
    Inicio vista;
    ListaDoble apuestas;
    ListaDoble apuestasErrores = new ListaDoble();

    public ControladorInicio(Inicio vista) {
        this.vista = vista;
        this.ingresarImagen();
    }
    
    private void ingresarImagen(){
        
        // Corredor 1
        ImageIcon corredor1 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor1.png");
        Image escala1 = corredor1.getImage().getScaledInstance(vista.getCorredor1().getWidth()
                ,vista.getCorredor1().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor1M = new ImageIcon(escala1);
        vista.getCorredor1().setIcon(corredor1M);
        
        
        //Corredor 2
        ImageIcon corredor2 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor2.png");
        Image escala2 = corredor2.getImage().getScaledInstance(vista.getCorredor2().getWidth()
                ,vista.getCorredor2().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor2M = new ImageIcon(escala2);
        vista.getCorredor2().setIcon(corredor2M);
        
        //Corredor 3
        ImageIcon corredor3 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor3.jpg");
        Image escala3 = corredor3.getImage().getScaledInstance(vista.getCorredor3().getWidth()
                ,vista.getCorredor3().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor3M = new ImageIcon(escala3);
        vista.getCorredor3().setIcon(corredor3M);
        
        //Corredor 4
        ImageIcon corredor4 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor4.png");
        Image escala4 = corredor4.getImage().getScaledInstance(vista.getCorredor4().getWidth()
                ,vista.getCorredor4().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor4M = new ImageIcon(escala4);
        vista.getCorredor4().setIcon(corredor4M);
        
        //Corredor 5
        ImageIcon corredor5 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor5.jpg");
        Image escala5 = corredor5.getImage().getScaledInstance(vista.getCorredor5().getWidth()
                ,vista.getCorredor5().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor5M = new ImageIcon(escala5);
        vista.getCorredor5().setIcon(corredor5M);
        
        //Corredor 6
        ImageIcon corredor6 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor6.png");
        Image escala6 = corredor6.getImage().getScaledInstance(vista.getCorredor6().getWidth()
                ,vista.getCorredor6().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor6M = new ImageIcon(escala6);
        vista.getCorredor6().setIcon(corredor6M);
        
        //Corredor 7
        ImageIcon corredor7 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor7.jpg");
        Image escala7 = corredor7.getImage().getScaledInstance(vista.getCorredor7().getWidth()
                ,vista.getCorredor7().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor7M = new ImageIcon(escala7);
        vista.getCorredor7().setIcon(corredor7M);
        //Corredor 8
        ImageIcon corredor8 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor8.png");
        Image escala8 = corredor8.getImage().getScaledInstance(vista.getCorredor8().getWidth()
                ,vista.getCorredor8().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor8M = new ImageIcon(escala8);
        vista.getCorredor8().setIcon(corredor8M);
        
        //Corredor 9
        ImageIcon corredor9 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor9.jpg");
        Image escala9 = corredor9.getImage().getScaledInstance(vista.getCorredor9().getWidth()
                ,vista.getCorredor9().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor9M = new ImageIcon(escala9);
        vista.getCorredor9().setIcon(corredor9M);
        
        //Corredor 10
        ImageIcon corredor10 = new ImageIcon("/media/douglas2021/Dou_job/Programacion/Practica1_EstructuraDatos1_2022/Practica1EstructuraDatos/src/main/java/imagen/corredor10.jpg");
        Image escala10 = corredor10.getImage().getScaledInstance(vista.getCorredor10().getWidth()
                ,vista.getCorredor10().getHeight(), Image.SCALE_SMOOTH );
        Icon corredor10M = new ImageIcon(escala10);
        vista.getCorredor10().setIcon(corredor10M);
    }
    
    public void leerArchivo(){
        
        JFileChooser fileChosser = new JFileChooser();
        int seleccion = fileChosser.showOpenDialog(vista);  

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //aqui selecciono y guardo el FILE que va a utilizar el FileReader
            File fichero = fileChosser.getSelectedFile();
            
            
            try {
                apuestas = LectorDeApuesta.leerFichero(fichero, vista.getVistaArchivo());
                System.out.println("-----------Ingreso en Apuestas--------------------------------");
                apuestas.imprimirFinInicio();
                
                ConstructorApuesta.verificarApuesta(apuestas.getInicio(),apuestasErrores);
                
                System.out.println("-------Aceptado------------------------------------");
                apuestas.imprimirInicioFin();
                System.out.println("-------Errores------------------------------------");
                apuestasErrores.imprimirInicioFin();
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(vista, "Error al leer el archivo");
                ex.printStackTrace();
            }
        }
        
    }
    public void cierreApuesta(){
         ConstructorApuesta.verificarApuesta(apuestas.getInicio(),apuestasErrores);
                
        System.out.println("-------Aceptado------------------------------------");
        apuestas.imprimirInicioFin();
        System.out.println("-------Errores------------------------------------");
        apuestasErrores.imprimirInicioFin();
        
        JFileChooser fileChosser = new JFileChooser();
        fileChosser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = fileChosser.showOpenDialog(vista);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fileChosser.getCurrentDirectory();
            EscritorApuestas.escribirApuestas(apuestas.getInicio(), fichero.getAbsolutePath()+"Aceptadas.csv");
            EscritorApuestas.escribirApuestas(apuestasErrores.getInicio(), fichero.getName()+"Rechazadas.csv");
        }
        
        
    }
    
    public void validandoApuesta(){
        int[] posicionesFinales = new int[10];
        posicionesFinales[0] = posicion((String) vista.getP1().getSelectedItem());
        posicionesFinales[1] = posicion((String) vista.getP2().getSelectedItem());
        posicionesFinales[2] = posicion((String) vista.getP3().getSelectedItem());
        posicionesFinales[3] = posicion((String) vista.getP4().getSelectedItem());
        posicionesFinales[4] = posicion((String) vista.getP5().getSelectedItem());
        posicionesFinales[5] = posicion((String) vista.getP6().getSelectedItem());
        posicionesFinales[6] = posicion((String) vista.getP7().getSelectedItem());
        posicionesFinales[7] = posicion((String) vista.getP8().getSelectedItem());
        posicionesFinales[8] = posicion((String) vista.getP9().getSelectedItem());
        posicionesFinales[9] = posicion((String) vista.getP10().getSelectedItem());
        
        ConstructorApuesta.conteoApuesta(apuestas.getInicio(), posicionesFinales);
        System.out.println("----------------------------Imprimiendo el conteo-------------------------------------------");
        apuestas.imprimirInicioFin();
    }
    
    private int posicion(String posicion){
        String[] posiciones = {"Primero","Segundo","Tercero","Cuarto","Quinto","Sexto","Septimo","Octavo","Noveno","Decimo"};
        for (int i = 0; i < posiciones.length; i++) {
            if (posiciones[i].equals(posicion)) {
                return i+1;
            }
        }       
        return 0;
    }
    
    public void ordenarMonto(){
        ConstructorApuesta.ordenarResultadoPunto(apuestas.getInicio());
        System.out.println("------------------------ordenado-----------------------------");
        apuestas.imprimirInicioFin();
    }
    

    //Movimiento de seleccion
    public void p1Accion(){
        Object eli = vista.getP1().getSelectedItem();
        if (vista.getP1().getSelectedIndex()!=0) {
            vista.getP2().removeItem(eli);
            vista.getP3().removeItem(eli);
            vista.getP4().removeItem(eli);
            vista.getP5().removeItem(eli);
            vista.getP6().removeItem(eli);
            vista.getP7().removeItem(eli);
            vista.getP8().removeItem(eli);
            vista.getP9().removeItem(eli);
            vista.getP10().removeItem(eli);
        }
      
    }
    
    public void p2Accion(){
        Object eli = vista.getP2().getSelectedItem();
        if (vista.getP2().getSelectedIndex()!=0) {
            vista.getP1().removeItem(eli);
            vista.getP3().removeItem(eli);
            vista.getP4().removeItem(eli);
            vista.getP5().removeItem(eli);
            vista.getP6().removeItem(eli);
            vista.getP7().removeItem(eli);
            vista.getP8().removeItem(eli);
            vista.getP9().removeItem(eli);
            vista.getP10().removeItem(eli);
        }
    }
    
    public void p3Accion(){
        Object eli = vista.getP3().getSelectedItem();
        if (vista.getP3().getSelectedIndex()!=0) {
            vista.getP1().removeItem(eli);
            vista.getP2().removeItem(eli);
            vista.getP4().removeItem(eli);
            vista.getP5().removeItem(eli);
            vista.getP6().removeItem(eli);
            vista.getP7().removeItem(eli);
            vista.getP8().removeItem(eli);
            vista.getP9().removeItem(eli);
            vista.getP10().removeItem(eli);
        }
    }
    
    public void p4Accion(){
        Object eli = vista.getP4().getSelectedItem();
        if (vista.getP1().getSelectedIndex()!=0) {
            vista.getP1().removeItem(eli);
            vista.getP3().removeItem(eli);
            vista.getP2().removeItem(eli);
            vista.getP5().removeItem(eli);
            vista.getP6().removeItem(eli);
            vista.getP7().removeItem(eli);
            vista.getP8().removeItem(eli);
            vista.getP9().removeItem(eli);
            vista.getP10().removeItem(eli);
        }
    }
    
    public void p5Accion(){
        Object eli = vista.getP5().getSelectedItem();
        if (vista.getP1().getSelectedIndex()!=0) {
            vista.getP1().removeItem(eli);
            vista.getP3().removeItem(eli);
            vista.getP4().removeItem(eli);
            vista.getP2().removeItem(eli);
            vista.getP6().removeItem(eli);
            vista.getP7().removeItem(eli);
            vista.getP8().removeItem(eli);
            vista.getP9().removeItem(eli);
            vista.getP10().removeItem(eli);
        }
    }
    
    public void p6Accion(){
        Object eli = vista.getP6().getSelectedItem();
        if (vista.getP1().getSelectedIndex()!=0) {
            vista.getP1().removeItem(eli);
            vista.getP3().removeItem(eli);
            vista.getP4().removeItem(eli);
            vista.getP2().removeItem(eli);
            vista.getP5().removeItem(eli);
            vista.getP7().removeItem(eli);
            vista.getP8().removeItem(eli);
            vista.getP9().removeItem(eli);
            vista.getP10().removeItem(eli);
        }
    }
    
    public void p7Accion(){
        Object eli = vista.getP7().getSelectedItem();
        if (vista.getP1().getSelectedIndex()!=0) {
            vista.getP1().removeItem(eli);
            vista.getP3().removeItem(eli);
            vista.getP4().removeItem(eli);
            vista.getP2().removeItem(eli);
            vista.getP6().removeItem(eli);
            vista.getP5().removeItem(eli);
            vista.getP8().removeItem(eli);
            vista.getP9().removeItem(eli);
            vista.getP10().removeItem(eli);
        }
    }
    
    public void p8Accion(){
        Object eli = vista.getP8().getSelectedItem();
        if (vista.getP1().getSelectedIndex()!=0) {
            vista.getP1().removeItem(eli);
            vista.getP3().removeItem(eli);
            vista.getP4().removeItem(eli);
            vista.getP2().removeItem(eli);
            vista.getP6().removeItem(eli);
            vista.getP7().removeItem(eli);
            vista.getP5().removeItem(eli);
            vista.getP9().removeItem(eli);
            vista.getP10().removeItem(eli);
        }
    }
    
    public void p9Accion(){
        Object eli = vista.getP9().getSelectedItem();
        if (vista.getP1().getSelectedIndex()!=0) {
            vista.getP1().removeItem(eli);
            vista.getP3().removeItem(eli);
            vista.getP4().removeItem(eli);
            vista.getP2().removeItem(eli);
            vista.getP6().removeItem(eli);
            vista.getP7().removeItem(eli);
            vista.getP8().removeItem(eli);
            vista.getP5().removeItem(eli);
            vista.getP10().removeItem(eli);
        }
    }
    
    public void p10Accion(){
        Object eli = vista.getP10().getSelectedItem();
        if (vista.getP1().getSelectedIndex()!=0) {
            vista.getP1().removeItem(eli);
            vista.getP3().removeItem(eli);
            vista.getP4().removeItem(eli);
            vista.getP2().removeItem(eli);
            vista.getP6().removeItem(eli);
            vista.getP7().removeItem(eli);
            vista.getP8().removeItem(eli);
            vista.getP5().removeItem(eli);
            vista.getP9().removeItem(eli);
        }
    }
                
}
