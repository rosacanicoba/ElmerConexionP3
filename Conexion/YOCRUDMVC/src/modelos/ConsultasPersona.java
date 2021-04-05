package modelos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultasPersona extends Conexion {
  PreparedStatement ps;
  ResultSet rs;

  public boolean insertar(Persona persona) {
    Connection conexion = getConnection();

    try {
      ps = conexion.prepareStatement("insert into persona(clave,nombre,domicilio,celular,correo_electronico,fecha_nacimiento,genero) values (?,?,?,?,?,?,?)");
      ps.setString(1, persona.getClave());
      ps.setString(2, persona.getNombre());
      ps.setString(3, persona.getDomicilio());
      ps.setString(4, persona.getCelular());
      ps.setString(5, persona.getCorreo_electronico());
      ps.setDate(6, persona.getFecha_nacimiento());
      ps.setString(7, persona.getGenero());

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
