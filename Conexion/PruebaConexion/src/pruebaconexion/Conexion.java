
package pruebaconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Conexion extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:8080/prueba";
    public static final String usuario = "root";
    public static final String contrasena = "";
    
  public Conexion() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    botonConectar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    botonConectar.setText("Boton Conectar");
    botonConectar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonConectarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(133, 133, 133)
        .addComponent(botonConectar)
        .addContainerGap(149, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(123, 123, 123)
        .addComponent(botonConectar)
        .addContainerGap(145, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void botonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConectarActionPerformed
    Connection conexion = getConnection();
    
    PreparedStatement ps;
    ResultSet rs;
    
    try{
      ps = conexion.prepareStatement("select * from persona");
      rs = ps.executeQuery();
      
      if(rs.next()){ //se trabaja con while cuando hay varios registros
        JOptionPane.showMessageDialog(null,"Nombre: "+rs.getString("nombre")+
          "\nDomicilio: "+rs.getString("domicilio")+
          "\nCelular: "+rs.getString("celular")+
          "\nCorreo Electronico: "+rs.getString("correo_electronico")+
          "\nFecha de Naciminento: "+String.valueOf(rs.getDate("fecha_nacimiento"))+ 
          "\nGenero: "+rs.getString("genero")+"\n");
      }else{
        JOptionPane.showMessageDialog(null, "No existen registros!");
      }
      conexion.close();
    }catch(Exception ex){
      System.err.println("Error, "+ex);
    }
    
  }//GEN-LAST:event_botonConectarActionPerformed

  public Connection getConnection(){
  Connection conexion = null;
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      conexion = (Connection)DriverManager.getConnection(URL, usuario, contrasena);
      JOptionPane.showMessageDialog(null, "Conexion Exitosa");
      
    }catch(Exception ex){
      System.err.println("Error, "+ex);
    }
  return conexion;
  }
  
 

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton botonConectar;
  // End of variables declaration//GEN-END:variables
}
