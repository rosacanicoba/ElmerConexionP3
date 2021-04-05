
package aplicacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Persona2 extends javax.swing.JFrame {

 /* public static final String URL = "jdbc:mysql://localhost:3306/escuela";
  public static final String usuario = "root";
  public static final String contrasena = "";
  PreparedStatement ps;
  ResultSet rs;

  public Connection getConnection() {
    Connection conexion = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conexion = (Connection) DriverManager.getConnection(URL, usuario, contrasena);

    } catch (Exception ex) {
      System.err.println("Error, " + ex);
    }
    return conexion;
  }

  public Persona2() {
    initComponents();
    cajaID.setVisible(false);
    setLocationRelativeTo(null);
  }*/

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    cajaNombre = new javax.swing.JTextField();
    botonBuscar = new javax.swing.JButton();
    cajaID = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    botonInsertar = new javax.swing.JToggleButton();
    botonModificar = new javax.swing.JToggleButton();
    botonEliminar = new javax.swing.JToggleButton();
    botonLimpiar = new javax.swing.JToggleButton();
    cajaBuscar = new javax.swing.JTextField();
    cajaClave = new javax.swing.JTextField();
    cajaCelular = new javax.swing.JTextField();
    cajaDomicilio = new javax.swing.JTextField();
    cajaCorreoelectronico = new javax.swing.JTextField();
    cajaFechaDeNacimiento = new javax.swing.JTextField();
    comboGenero = new javax.swing.JComboBox<>();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    jPanel1.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 128, 334, -1));

    botonBuscar.setText("Buscar");
    jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 24, -1, -1));

    cajaID.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cajaIDActionPerformed(evt);
      }
    });
    jPanel1.add(cajaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 62, 91, -1));

    jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel1.setText("Nombre:");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 128, -1, -1));

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel2.setText("Clave:");
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 92, -1, -1));

    jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel3.setText("Domicilio:");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 164, -1, -1));

    jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel4.setText("Celular: ");
    jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 202, -1, -1));

    jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel5.setText("Fecha de nacimiento:");
    jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 278, -1, -1));

    jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel6.setText("CorreoElectronico:");
    jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

    jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel7.setText("Genero:");
    jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 316, -1, -1));

    botonInsertar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    botonInsertar.setText("Insertar");
    botonInsertar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonInsertarActionPerformed(evt);
      }
    });
    jPanel1.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 384, -1, -1));

    botonModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    botonModificar.setText("Modificar");
    jPanel1.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 384, -1, -1));

    botonEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    botonEliminar.setText("Eliminar");
    jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 384, -1, -1));

    botonLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    botonLimpiar.setText("Limpiar");
    jPanel1.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 384, -1, -1));
    jPanel1.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 28, 133, -1));
    jPanel1.add(cajaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 92, 334, -1));
    jPanel1.add(cajaCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 204, 337, -1));
    jPanel1.add(cajaDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 166, 334, -1));
    jPanel1.add(cajaCorreoelectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 242, 228, -1));
    jPanel1.add(cajaFechaDeNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 280, 228, -1));

    comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
    jPanel1.add(comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 317, 228, -1));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void cajaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIDActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cajaIDActionPerformed

  private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
    /*Connection conexion = null;

    try {
      conexion = getConnection();
      ps = conexion.prepareStatement("insert into persona(clave,nombre,domicilio,celular,correo_electronico,fecha_nacimiento,genero) values(?,?,?,?,?,?,?)");
      ps.setString(1, cajaClave.getText());
      ps.setString(2, cajaNombre.getText());
      ps.setString(3, cajaDomicilio.getText());
      ps.setString(4, cajaCelular.getText());
      ps.setString(5, cajaCorreoelectronico.getText());
      ps.setDate(6,Date.valueOf(cajaFechaDeNacimiento.getText()));
      ps.setString(7, comboGenero.getSelectedItem().toString());
      
      int resultado = ps.executeUpdate(); // Ejecutamos la insercion
      
      if(resultado>0){
        JOptionPane.showMessageDialog(null, "Resgitro insertado correctamente!");
      }else{
        JOptionPane.showMessageDialog(null, "Error, registro no insertado");
      }
      conexion.close();
      
    } catch (Exception ex) {
      System.err.println("Error, "+ex);
    }*/
  }//GEN-LAST:event_botonInsertarActionPerformed

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
      java.util.logging.Logger.getLogger(Persona2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Persona2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Persona2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Persona2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Persona2().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton botonBuscar;
  private javax.swing.JToggleButton botonEliminar;
  private javax.swing.JToggleButton botonInsertar;
  private javax.swing.JToggleButton botonLimpiar;
  private javax.swing.JToggleButton botonModificar;
  private javax.swing.JTextField cajaBuscar;
  private javax.swing.JTextField cajaCelular;
  private javax.swing.JTextField cajaClave;
  private javax.swing.JTextField cajaCorreoelectronico;
  private javax.swing.JTextField cajaDomicilio;
  private javax.swing.JTextField cajaFechaDeNacimiento;
  private javax.swing.JTextField cajaID;
  private javax.swing.JTextField cajaNombre;
  private javax.swing.JComboBox<String> comboGenero;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  // End of variables declaration//GEN-END:variables
}
