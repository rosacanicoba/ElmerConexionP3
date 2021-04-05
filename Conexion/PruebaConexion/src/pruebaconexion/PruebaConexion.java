
package pruebaconexion;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//import static pruebaconexion.Conexion.URL;
//import static pruebaconexion.Conexion.contrasena;
//import static pruebaconexion.Conexion.usuario;

public class PruebaConexion {

//private static String DRIVER    ="com.mysql.jdbc.Driver";
private static String DRIVER    ="com.mysql.cj.jdbc.Driver";
private static String USUARIO   ="root";
private static String PASSWORD  ="";
private static String URL       ="jdbc:mysql://localhost:8080/prueba";

static {
    try {
        Class.forName(DRIVER);       
    } catch (ClassNotFoundException e) {
        JOptionPane.showMessageDialog(null,"Error en el DRIVER: "+e);
    }
    
}
    
    public Connection getConnection(){
        
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(URL,USUARIO,PASSWORD);  //getConnetion(URL,USUARIO,PASSWORD);
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la Conexion"+ e);
        }
    return con;
}    
    
     /* public java.sql.Connection getConnection(){
  java.sql.Connection conexion = null;
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      conexion = (java.sql.Connection)DriverManager.getConnection(URL, usuario, contrasena);
      JOptionPane.showMessageDialog(null, "Conexion Exitosa");
      
    }catch(Exception ex){
      System.err.println("Error, "+ex);
    }
  return conexion;
  }*/
    
}
