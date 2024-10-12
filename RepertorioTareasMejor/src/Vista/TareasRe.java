
package Vista;

import Modelo.Tarea;
import java.awt.Graphics;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.nio.file.*;
import java.util.List;
import javax.swing.JOptionPane;
public class TareasRe extends javax.swing.JFrame {
    static String correo;
//ruta del documento

    
    /*
    consiste en inicializar los componentes de la jPanel
    @param correo es un parametro que recibira al iniciar sesion
    lo cual diferenciara de los archivos existentes
    y ubicara el archivo del usuario
    
    */
    public TareasRe(String correo) {
        this.correo=correo;
        initComponents();
        llenar(correo);
    }
    FileWriter fw;
     
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTable = new javax.swing.JTable();
        txtTarea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnComplet = new javax.swing.JButton();
        btnCompletar = new javax.swing.JButton();
        btnConversacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "tarea", "completed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tTable);

        jLabel1.setText("Tarea");

        btnAgregar.setText("agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnComplet.setText("Completar");
        btnComplet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletActionPerformed(evt);
            }
        });

        btnCompletar.setText("completar todo");
        btnCompletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarActionPerformed(evt);
            }
        });

        btnConversacion.setText("Conversaciones");
        btnConversacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnComplet, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConversacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompletar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnComplet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134)
                        .addComponent(btnConversacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCompletar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*
    consiste en agregar una tarea en archivos y mostrarlo en la tabla
    @IOException Previene el cierre inesperado del programa:El manejo de 
    excepciones permite que el programa siga ejecutándose incluso si ocurre un error
    @param modeltable.addRow(new Object[]{texto, false}) al crear poner como falso en la tabla pues 
    no esta completo la tarea
    */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String ruta = "DOCUMENTOS//BD_"+correo+".txt"; 
        DefaultTableModel modeltable = (DefaultTableModel)tTable.getModel();
        //System.out.println("essssss"+rut);
        
        String texto = txtTarea.getText(); // Texto a escribir

        // Usamos try-with-resources para manejar el FileWriter
        try (FileWriter writer = new FileWriter(ruta, true)) { // 'true' para añadir al final del archivo
            writer.write(texto+"-0"); // Escribir el texto
            writer.write(System.lineSeparator()); // Añadir un salto de línea
            modeltable.addRow(new Object[]{texto, false});
            System.out.println("Texto escrito correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
        System.out.println(correo);
        txtTarea.setText("");
    }//GEN-LAST:event_btnAgregarActionPerformed
    /*
    consiste en completar todo mediante el la funcionalidad editar();
    */
    private void btnCompletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletarActionPerformed
        editar();
        DefaultTableModel modelo = (DefaultTableModel) tTable.getModel();

        // Establecer el número de filas a 0 para eliminar todas
        modelo.setRowCount(0);
        llenar(correo);
    }//GEN-LAST:event_btnCompletarActionPerformed
    /*
    consiste en completar los checks
    @param DefaultTableModel modeltalble, crea uno de los parametros necesarios 
    para guardarCambiosEnArchivo()el cual es completar los checks
    */
    private void btnCompletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletActionPerformed
        String ruta = "DOCUMENTOS//BD_"+correo+".txt"; 
        DefaultTableModel modeltable = (DefaultTableModel)tTable.getModel();
        guardarCambiosEnArchivo(ruta,modeltable);
    }//GEN-LAST:event_btnCompletActionPerformed
    /*
    consiste en abrir otro Jframe que es Foro
    @param new Foro(correo).setVisible(true) para abrir el jFrame Foro
    */
    private void btnConversacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversacionActionPerformed
        Foro fr;
        new Foro(correo).setVisible(true);
    }//GEN-LAST:event_btnConversacionActionPerformed
    /*
    consiste en completar todas las tareas
    @param StringBuilder para lograr manipular cadenas de caracteres
    @IOException Previene el cierre inesperado del programa:El manejo de 
    excepciones permite que el programa siga ejecutándose incluso si ocurre un error.
    @param contenidoModificado.append(linea).append(System.lineSeparator()) para
    Añadir la línea modificada (o sin modificar) al contenido final
    @param linea.endsWith("0")condicion para modificar la linea (si el ultimo caracter es "0")
    */
    public void editar(){
        String ruta = "DOCUMENTOS//BD_"+correo+".txt"; 
        // Especificar la ruta del archivo

        try {
            // Leer todas las líneas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(ruta));
            // Crear un StringBuilder para guardar las nuevas líneas
            StringBuilder contenidoModificado = new StringBuilder();

            // Procesar cada línea
            for (String linea : lineas) {
                // Si la línea termina con '0', reemplazarlo con '1'
                if (linea.endsWith("0")) {
                    // Modificar la línea
                    linea = linea.substring(0, linea.length() - 1) + "1";
                }
                // Añadir la línea modificada (o sin modificar) al contenido final
                contenidoModificado.append(linea).append(System.lineSeparator());
            }
            // Escribir el contenido modificado en el archivo
            Files.write(Paths.get(ruta), contenidoModificado.toString().getBytes());
            System.out.println("Archivo actualizado correctamente.");

        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
        /*
    consiste en guardar las tareas cuando se completen y llenar el check dentro del jtable
    @IOException Previene el cierre inesperado del programa:El manejo de 
    excepciones permite que el programa siga ejecutándose incluso si ocurre un error.
    @param estado pregunta si esta completa la tarea mediante el check
    */
    private static void guardarCambiosEnArchivo(String ruta, DefaultTableModel model) {
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ruta));

            for (int i = 0; i < model.getRowCount(); i++) {
                String tarea = (String) model.getValueAt(i, 0);  // Nombre de la tarea
                Boolean completada = (Boolean) model.getValueAt(i, 1);  // Estado de completitud
                String estado = completada ? "-1" : "-0";  // "-1" si completada, "-0" si no
                writer.write(tarea + estado);
                writer.newLine();
            }

            writer.close();
            JOptionPane.showMessageDialog(null, "Tareas guardadas exitosamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TareasRe(correo).setVisible(true);
            }
        });
    }
    /*
    consiste en llenar la jtable de tareas a completar de los archivos.
    @param DefaultTableModel modeltable, declaramos la tabla que esta en el jpanel
    @IOException Previene el cierre inesperado del programa:El manejo de 
    excepciones permite que el programa siga ejecutándose incluso si ocurre un error.
    @param modeltable.addRow()lo usamos para insertar los datos del archivo 
    dependiedo del ultimo caracter que sera 1 o 0 sera true o false.
    
    */
    public void llenar(String ru) {
        String ruta = "DOCUMENTOS//BD_"+ru+".txt"; 
    DefaultTableModel modeltable = (DefaultTableModel)tTable.getModel();
    try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
        String linea1 = br.readLine();
        String linea2 = "";
        
        while (linea1 != null) {
            if (linea1.length() > 2) {
                int num = linea1.length() - 2;
                linea2 = linea1.substring(num + 1); // Obtiene el último carácter
                linea1 = linea1.substring(0, num); // Obtiene el contenido restante
                if (linea2.equals("0")) {
                    modeltable.addRow(new Object[]{linea1, false});
                } else {
                    modeltable.addRow(new Object[]{linea1, true});
                }
            }
            linea1 = br.readLine(); // Mover fuera del if para que se ejecute siempre
        }
    } catch (IOException e) {
        System.err.println("Error al leer el archivo: " + e.getMessage());
    }
    }
    
    class FondoPanel extends JPanel{
        /*
        consiste en adr un fondo simple y comodo para la app
        @param paint en una clase en Java que hereda de una clase que utiliza gráficos para el jpanel. 

        */
        //declaramos la Imagen como image lo cual se utilizara como fondo en el jpanel

        private Image imagen;
        /*
        @param drawImage de la clase Graphics. La imagen se dibuja en la 
        posición (0, 0) del componente y se ajusta a su ancho y alto
        @param paint de la superclase, que garantiza que el componente sigue 
        dibujando sus elementos básicos (como bordes, texto u otros 
        componentes), después de haber dibujado la imagen de fondo.
        */
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/imagen.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnComplet;
    private javax.swing.JButton btnCompletar;
    private javax.swing.JButton btnConversacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tTable;
    private javax.swing.JTextField txtTarea;
    // End of variables declaration//GEN-END:variables
}
