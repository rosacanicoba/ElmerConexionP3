
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


// CONEXION CON LA BD DE WORKBENCH, DE MySQL 
public class Conexion { 
  public static final String URL = "jdbc:mysql://localhost:3306/elcybernauta"; //cambiar nombre de la BD
  public static final String usuario = "root";
  public static final String contrasena = "";

  public Connection getConnection() {
    Connection conexion = null;
    
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conexion = (Connection) DriverManager.getConnection(URL, usuario, contrasena);
      JOptionPane.showMessageDialog(null, "Conexion exitosa");
      
    } catch (Exception ex) {
      System.err.println("Error, " + ex);
    }
    return conexion;
  }
}
 
  
  
  

