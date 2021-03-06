
package vista;

import controladores.ControladorInicio;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class Inicio extends javax.swing.JFrame {


    ControladorInicio controlador;
            
    public Inicio() {
        initComponents();
        controlador = new ControladorInicio(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Conjunto = new javax.swing.JTabbedPane();
        Ingreso = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        vistasExpuesta = new javax.swing.JScrollPane();
        vistaArchivo = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        Resultado = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        Correr = new javax.swing.JPanel();
        corredor1 = new javax.swing.JLabel();
        corredor2 = new javax.swing.JLabel();
        corredor3 = new javax.swing.JLabel();
        corredor4 = new javax.swing.JLabel();
        corredor5 = new javax.swing.JLabel();
        corredor6 = new javax.swing.JLabel();
        corredor7 = new javax.swing.JLabel();
        corredor8 = new javax.swing.JLabel();
        corredor9 = new javax.swing.JLabel();
        corredor10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        p1 = new javax.swing.JComboBox<>();
        p2 = new javax.swing.JComboBox<>();
        p3 = new javax.swing.JComboBox<>();
        p4 = new javax.swing.JComboBox<>();
        p5 = new javax.swing.JComboBox<>();
        p6 = new javax.swing.JComboBox<>();
        p7 = new javax.swing.JComboBox<>();
        p8 = new javax.swing.JComboBox<>();
        p9 = new javax.swing.JComboBox<>();
        p10 = new javax.swing.JComboBox<>();
        inciarCarrera = new javax.swing.JButton();
        regresarPosiciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ingreso de datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        vistaArchivo.setColumns(20);
        vistaArchivo.setRows(5);
        vistasExpuesta.setViewportView(vistaArchivo);

        jButton2.setText("Cierre de apuesta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresoLayout = new javax.swing.GroupLayout(Ingreso);
        Ingreso.setLayout(IngresoLayout);
        IngresoLayout.setHorizontalGroup(
            IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vistasExpuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(IngresoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        IngresoLayout.setVerticalGroup(
            IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngresoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vistasExpuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        Conjunto.addTab("Ingreso", Ingreso);

        jButton3.setText("Exportar Resultado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResultadoLayout = new javax.swing.GroupLayout(Resultado);
        Resultado.setLayout(ResultadoLayout);
        ResultadoLayout.setHorizontalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(591, Short.MAX_VALUE))
        );
        ResultadoLayout.setVerticalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadoLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(671, Short.MAX_VALUE))
        );

        Conjunto.addTab("Resultado", Resultado);

        corredor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor1.setText("C1");

        corredor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor2.setText("C2");

        corredor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor3.setText("C3");

        corredor4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor4.setText("C4");

        corredor5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor5.setText("C5");

        corredor6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor6.setText("C6");

        corredor7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor7.setText("C7");

        corredor8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor8.setText("C8");

        corredor9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor9.setText("C9");

        corredor10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        corredor10.setText("C10");

        jLabel11.setText("Corredor 1");

        jLabel12.setText("Corredor 2");

        jLabel13.setText("Corredor 3");

        jLabel14.setText("Corredor 4");

        jLabel15.setText("Corredor 5");

        jLabel16.setText("Corredor 6");

        jLabel17.setText("Corredor 7");

        jLabel18.setText("Corredor 8");

        jLabel19.setText("Corredor 9");

        jLabel20.setText("Corredor 10");

        p1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        p2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });

        p3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });

        p4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });

        p5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });

        p6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });

        p7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });

        p8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });

        p9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });

        p10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione Posicion", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo", "Noveno", "Decimo" }));
        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10ActionPerformed(evt);
            }
        });

        inciarCarrera.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        inciarCarrera.setText("Aceptar");
        inciarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inciarCarreraActionPerformed(evt);
            }
        });

        regresarPosiciones.setText("Volver a seleccionar");

        javax.swing.GroupLayout CorrerLayout = new javax.swing.GroupLayout(Correr);
        Correr.setLayout(CorrerLayout);
        CorrerLayout.setHorizontalGroup(
            CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorrerLayout.createSequentialGroup()
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CorrerLayout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inciarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regresarPosiciones, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CorrerLayout.createSequentialGroup()
                                .addGap(468, 468, 468)
                                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                            .addComponent(p10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corredor10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                            .addComponent(p9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corredor9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                            .addComponent(p8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corredor8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                            .addComponent(p7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corredor7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                            .addComponent(p6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corredor6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                            .addComponent(p5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corredor5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                            .addComponent(p4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corredor4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                            .addComponent(p3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corredor3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                            .addComponent(p2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(corredor2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CorrerLayout.createSequentialGroup()
                                                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(corredor1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        CorrerLayout.setVerticalGroup(
            CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorrerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corredor1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corredor2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corredor3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorrerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corredor4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corredor5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CorrerLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(inciarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorrerLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(12, 12, 12)
                        .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(corredor6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(regresarPosiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corredor7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corredor8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corredor9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorrerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corredor10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Conjunto.addTab("Carrera", Correr);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Conjunto)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Conjunto)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public JLabel getCorredor1() {
        return corredor1;
    }

    public void setCorredor1(JLabel corredor1) {
        this.corredor1 = corredor1;
    }

    public JLabel getCorredor10() {
        return corredor10;
    }

    public void setCorredor10(JLabel corredor10) {
        this.corredor10 = corredor10;
    }

    public JLabel getCorredor2() {
        return corredor2;
    }

    public void setCorredor2(JLabel corredor2) {
        this.corredor2 = corredor2;
    }

    public JLabel getCorredor3() {
        return corredor3;
    }

    public void setCorredor3(JLabel corredor3) {
        this.corredor3 = corredor3;
    }

    public JLabel getCorredor4() {
        return corredor4;
    }

    public void setCorredor4(JLabel corredor4) {
        this.corredor4 = corredor4;
    }

    public JLabel getCorredor5() {
        return corredor5;
    }

    public void setCorredor5(JLabel corredor5) {
        this.corredor5 = corredor5;
    }

    public JLabel getCorredor6() {
        return corredor6;
    }

    public void setCorredor6(JLabel corredor6) {
        this.corredor6 = corredor6;
    }

    public JLabel getCorredor7() {
        return corredor7;
    }

    public void setCorredor7(JLabel corredor7) {
        this.corredor7 = corredor7;
    }

    public JLabel getCorredor8() {
        return corredor8;
    }

    public void setCorredor8(JLabel corredor8) {
        this.corredor8 = corredor8;
    }

    public JLabel getCorredor9() {
        return corredor9;
    }

    public JComboBox<String> getP1() {
        return p1;
    }

    public void setP1(JComboBox<String> p1) {
        this.p1 = p1;
    }

    public JComboBox<String> getP10() {
        return p10;
    }

    public void setP10(JComboBox<String> p10) {
        this.p10 = p10;
    }

    public JComboBox<String> getP2() {
        return p2;
    }

    public void setP2(JComboBox<String> p2) {
        this.p2 = p2;
    }

    public JComboBox<String> getP3() {
        return p3;
    }

    public void setP3(JComboBox<String> p3) {
        this.p3 = p3;
    }

    public JComboBox<String> getP4() {
        return p4;
    }

    public void setP4(JComboBox<String> p4) {
        this.p4 = p4;
    }

    public JComboBox<String> getP5() {
        return p5;
    }

    public void setP5(JComboBox<String> p5) {
        this.p5 = p5;
    }

    public JComboBox<String> getP6() {
        return p6;
    }

    public void setP6(JComboBox<String> p6) {
        this.p6 = p6;
    }

    public JComboBox<String> getP7() {
        return p7;
    }

    public void setP7(JComboBox<String> p7) {
        this.p7 = p7;
    }

    public JComboBox<String> getP8() {
        return p8;
    }

    public void setP8(JComboBox<String> p8) {
        this.p8 = p8;
    }

    public JComboBox<String> getP9() {
        return p9;
    }

    public void setP9(JComboBox<String> p9) {
        this.p9 = p9;
    }

    public void setCorredor9(JLabel corredor9) {
        this.corredor9 = corredor9;
    }

    public JTextArea getVistaArchivo() {
        return vistaArchivo;
    }

    public void setVistaArchivo(JTextArea vistaArchivo) {
        this.vistaArchivo = vistaArchivo;
    }

    public JScrollPane getVistasExpuesta() {
        return vistasExpuesta;
    }

    public void setVistasExpuesta(JScrollPane vistasExpuesta) {
        this.vistasExpuesta = vistasExpuesta;
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        controlador.leerArchivo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
        controlador.p1Accion();
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        // TODO add your handling code here:
        controlador.p2Accion();
    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
        controlador.p3Accion();
    }//GEN-LAST:event_p3ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
        controlador.p4Accion();
    }//GEN-LAST:event_p4ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        // TODO add your handling code here:
        controlador.p5Accion();
    }//GEN-LAST:event_p5ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        // TODO add your handling code here:
        controlador.p6Accion();
    }//GEN-LAST:event_p6ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
        // TODO add your handling code here:
        controlador.p7Accion();
    }//GEN-LAST:event_p7ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
        // TODO add your handling code here:
        controlador.p8Accion();
    }//GEN-LAST:event_p8ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        // TODO add your handling code here:
        controlador.p9Accion();
    }//GEN-LAST:event_p9ActionPerformed

    private void p10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10ActionPerformed
        // TODO add your handling code here:
        controlador.p10Accion();
    }//GEN-LAST:event_p10ActionPerformed

    private void inciarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inciarCarreraActionPerformed
        // TODO add your handling code here:
        controlador.validandoApuesta();
    }//GEN-LAST:event_inciarCarreraActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        controlador.cierreApuesta();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        controlador.ordenarMonto();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Conjunto;
    private javax.swing.JPanel Correr;
    private javax.swing.JPanel Ingreso;
    private javax.swing.JPanel Resultado;
    private javax.swing.JLabel corredor1;
    private javax.swing.JLabel corredor10;
    private javax.swing.JLabel corredor2;
    private javax.swing.JLabel corredor3;
    private javax.swing.JLabel corredor4;
    private javax.swing.JLabel corredor5;
    private javax.swing.JLabel corredor6;
    private javax.swing.JLabel corredor7;
    private javax.swing.JLabel corredor8;
    private javax.swing.JLabel corredor9;
    private javax.swing.JButton inciarCarrera;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JComboBox<String> p1;
    private javax.swing.JComboBox<String> p10;
    private javax.swing.JComboBox<String> p2;
    private javax.swing.JComboBox<String> p3;
    private javax.swing.JComboBox<String> p4;
    private javax.swing.JComboBox<String> p5;
    private javax.swing.JComboBox<String> p6;
    private javax.swing.JComboBox<String> p7;
    private javax.swing.JComboBox<String> p8;
    private javax.swing.JComboBox<String> p9;
    private javax.swing.JButton regresarPosiciones;
    private javax.swing.JTextArea vistaArchivo;
    private javax.swing.JScrollPane vistasExpuesta;
    // End of variables declaration//GEN-END:variables
}
