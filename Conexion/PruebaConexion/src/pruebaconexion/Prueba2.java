
package pruebaconexion;
import java.sql.DriverManager;
import java.sql.*;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;


public class Prueba2 {
  Connection conectar=null;
public Connection conexion(){   
  try{
    //Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
    Class.forName("com.mysql.cj.jdbc.Driver");//.newInstance();
    conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
    //conectar=DriverManager.getConnection("jdbc:mysql://192.168.1.5:3306/personas","luis","");
    
  }catch(Exception ex) {
             JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
  //}catch(ClassNotFoundException ex) {  
  }
  return conectar;
  }

    void getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           

}
