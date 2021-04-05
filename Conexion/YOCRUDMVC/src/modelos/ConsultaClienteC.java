
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConsultaClienteC extends Conexion{
  PreparedStatement ps;
  ResultSet rs;

  public boolean insertar(ClienteC cliente) {
    Connection conexion = getConnection();

    try {
      //CAMBIA NOMBRE DE LA TABLA Y LOS CAMPOS RESPECTIVAMENTE (es sentencia SQL)
      ps = conexion.prepareStatement("insert into cliente(codCli,dniCli,nomCli,apeCli,telfCli,dirCli) values (?,?,?,?,?,?)");
      ps.setString(1, cliente.getCodigo() );
      ps.setInt(2, cliente.getDni());
      ps.setString(3, cliente.getNombre());
      ps.setString(4, cliente.getApellido());
      ps.setInt(5, cliente.getTelefono());
      ps.setString(6, cliente.getDireccion());
      
      int resultado = ps.executeUpdate(); // Ejecutamos la insercion

      if (resultado > 0) {
        return true;
        //JOptionPane.showMessageDialog(null, "Resgistro insertado correctamente!");
      } else {
        return false;
      }
      //JOptionPane.showMessageDialog(null, "Error, registro no insertado");
      // }
      
    } catch (Exception ex) {
        System.err.println("Error, " + ex);
        return false;
    } finally {
      try {
        conexion.close();
      } catch (Exception ex) {
        System.err.println("Error" + ex);
      }
    }
  }
}

 