
package vistas;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class VistaPersona extends javax.swing.JFrame {

    public VistaPersona() {
        initComponents();
      
         cajaId.setVisible(false);
         setLocationRelativeTo(null);
    }

  public static final String URL = "jdbc:mysql://localhost:3306/escuela";
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
  
  public void limpiarCajas() {
   tBuscar.setText(null);
   tClave.setText(null);
   tNom.setText(null);
   tDom.setText(null);
   tCel.setText(null);
   tCorreo.setText(null);
   tFecha.setText(null);
   cGenero.setSelectedIndex(0);          
  }         
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    tBuscar = new javax.swing.JTextField();
    cajaId = new javax.swing.JTextField();
    bBuscar = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    tClave = new javax.swing.JTextField();
    tNom = new javax.swing.JTextField();
    tDom = new javax.swing.JTextField();
    tCel = new javax.swing.JTextField();
    tCorreo = new javax.swing.JTextField();
    tFecha = new javax.swing.JTextField();
    cGenero = new javax.swing.JComboBox<>();
    bInsertar = new javax.swing.JButton();
    bModificar = new javax.swing.JButton();
    bEliminar = new javax.swing.JButton();
    bLimpiar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(0, 255, 255));

    tBuscar.setName("tBuscar"); // NOI18N

    bBuscar.setText("BUSCAR");
    bBuscar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bBuscarActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel1.setText("Clave");

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel2.setText("Nombre");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel3.setText("Domicilio");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel4.setText("Celular");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel5.setText("Fecha nacimiento");

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel6.setText("Correo electronico");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jLabel7.setText("Género");

    cGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Masculino ", "Femenino" }));

    bInsertar.setText("INSERTAR");
    bInsertar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bInsertarActionPerformed(evt);
      }
    });

    bModificar.setText("MODIFICAR");
    bModificar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bModificarActionPerformed(evt);
      }
    });

    bEliminar.setText("ELIMINAR");
    bEliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bEliminarActionPerformed(evt);
      }
    });

    bLimpiar.setText("LIMPIAR");
    bLimpiar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        bLimpiarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(178, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(tBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(bBuscar)
            .addGap(58, 58, 58))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(66, 66, 66))))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(bEliminar)
                .addGap(27, 27, 27)
                .addComponent(bLimpiar)
                .addGap(16, 16, 16))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(tClave)
                  .addComponent(tNom)
                  .addComponent(tDom)
                  .addComponent(tCel)
                  .addComponent(cGenero, 0, 264, Short.MAX_VALUE)
                  .addComponent(tFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                  .addComponent(tCorreo, javax.swing.GroupLayout.Alignment.TRAILING)))))
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(bInsertar)
            .addGap(18, 18, 18)
            .addComponent(bModificar)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(tBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(bBuscar))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(tClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(tNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(tDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(21, 21, 21)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(tCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel6)
          .addComponent(tCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(19, 19, 19)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel7)
          .addComponent(cGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(bInsertar)
          .addComponent(bModificar)
          .addComponent(bEliminar)
          .addComponent(bLimpiar))
        .addContainerGap(51, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void bInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertarActionPerformed
/*    Connection conexion = null;

    try {
      conexion = getConnection();
      ps = conexion.prepareStatement("insert into persona(clave,nombre,domicilio,celular,correo_electronico,fecha_nacimiento,genero) values(?,?,?,?,?,?,?)");
      ps.setString(1, tClave.getText());
      ps.setString(2, tNom.getText());
      ps.setString(3, tDom.getText());
      ps.setString(4, tCel.getText());
      ps.setString(5, tCorreo.getText());
      ps.setDate(6,Date.valueOf(tFecha.getText()));
      ps.setString(7, cGenero.getSelectedItem().toString());
      
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
  }//GEN-LAST:event_bInsertarActionPerformed

  private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed

      limpiarCajas();
  }//GEN-LAST:event_bLimpiarActionPerformed

  private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
   /* Connection conexion = null;
    try {
      conexion = getConnection();
      ps = conexion.prepareStatement("select * from persona where clave=?");
      ps.setString(1,tBuscar.getText());
      rs = ps.executeQuery();
      
      if(rs.next()) {
        cajaId.setText(String.valueOf(rs.getInt("idPersona")));
        tClave.setText(rs.getString("clave"));
        tNom.setText(rs.getString("nombre"));
        tDom.setText(rs.getString("domicilio"));
        tCel.setText(rs.getString("celular"));
        tCorreo.setText(rs.getString("correo_electronico"));
        tFecha.setText(String.valueOf(rs.getString("fecha_nacimiento")));
        cGenero.setSelectedItem(rs.getString("genero"));
        
      }
      else{
        JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
      }
      conexion.close();
      
    } catch (Exception ex) {
      System.out.println("Error, "+ex);
    }*/
  }//GEN-LAST:event_bBuscarActionPerformed

  private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
 
  /*  Connection conexion = null;

    try {
      conexion = getConnection();
      ps = conexion.prepareStatement("update persona set clave=?,nombre=?,domicilio=?,celular=?,correo_electronico=?,fecha_nacimiento=?,genero=? where idpersona=?");
      ps.setString(1, tClave.getText());
      ps.setString(2, tNom.getText());
      ps.setString(3, tDom.getText());
      ps.setString(4, tCel.getText());
      ps.setString(5, tCorreo.getText());
      ps.setDate(6,Date.valueOf(tFecha.getText()));
      ps.setString(7, cGenero.getSelectedItem().toString());
      ps.setInt(8, Integer.parseInt(cajaId.getText()));
      
      int resultado = ps.executeUpdate(); // Ejecutamos la modificacion
      
      if(resultado>0){
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente!");
        limpiarCajas();
      }else{
        JOptionPane.showMessageDialog(null, "Error, al modificar registro");
        limpiarCajas();
      }
      
      conexion.close();
      
    } catch (Exception ex) {
      System.err.println("Error, "+ex);
    }*/
  }//GEN-LAST:event_bModificarActionPerformed

  private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
   
   /* Connection conexion = null;

    try {
      conexion = getConnection();
      ps = conexion.prepareStatement("delete from persona where idpersona=?");
      ps.setInt(1, Integer.parseInt(cajaId.getText()));
      
      int resultado = ps.executeUpdate(); // Ejecutamos la eliminacion
      
      if(resultado>0){
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente!");
        limpiarCajas();
      }else{
        JOptionPane.showMessageDialog(null, "Error, al eliminar el registro");
        limpiarCajas();
      }
      
      conexion.close();
      
    } catch (Exception ex) {
      System.err.println("Error, "+ex);
    }
    */
   
  }//GEN-LAST:event_bEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPersona().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.JButton bBuscar;
  public javax.swing.JButton bEliminar;
  public javax.swing.JButton bInsertar;
  public javax.swing.JButton bLimpiar;
  public javax.swing.JButton bModificar;
  public javax.swing.JComboBox<String> cGenero;
  public javax.swing.JTextField cajaId;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  public javax.swing.JTextField tBuscar;
  public javax.swing.JTextField tCel;
  public javax.swing.JTextField tClave;
  public javax.swing.JTextField tCorreo;
  public javax.swing.JTextField tDom;
  public javax.swing.JTextField tFecha;
  public javax.swing.JTextField tNom;
  // End of variables declaration//GEN-END:variables
}
