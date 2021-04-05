package modelo;

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
     } else {
        return false;
      }
    
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
    public boolean buscar(Persona persona) {
    Connection conexion = getConnection();

    try {
      ps = conexion.prepareStatement("select * from persona where clave=?");
      ps.setString(1, persona.getClave());
      rs = ps.executeQuery();
      
      if (rs.next()) {
        persona.setIdPersona(rs.getInt("idPersona"));
        persona.setClave(rs.getString("clave"));
        persona.setNombre(rs.getString("nombre"));
        persona.setDomicilio(rs.getString("domicilio"));
        persona.setCelular(rs.getString("celular"));
        persona.setCorreo_electronico(rs.getString("correo_electronico"));//
        persona.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
        persona.setGenero(rs.getString("genero"));
         return true;      
      } else {
        return false;
      }
      
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
    
   public boolean modificar(Persona persona) {
    Connection conexion = getConnection();

    try {
      ps = conexion.prepareStatement("update persona set clave=?,nombre=?,domicilio=?,celular=?,correo_electronico=?,fecha_nacimiento=?,genero=? where idPersona=?");
      ps.setString(1, persona.getClave());
      ps.setString(2, persona.getNombre());
      ps.setString(3, persona.getDomicilio());
      ps.setString(4, persona.getCelular());
      ps.setString(5, persona.getCorreo_electronico());
      ps.setDate(6, persona.getFecha_nacimiento());
      ps.setString(7, persona.getGenero());
      ps.setInt(8, persona.getIdPersona());

      int resultado = ps.executeUpdate(); // Ejecutamos la Modificacion
       if (resultado > 0) {
        return true;
      } else {
        return false;
      }
      
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
    
    public boolean eliminar(Persona persona) {
    Connection conexion = getConnection();

    try {
      ps = conexion.prepareStatement("delete from persona where idPersona=?");
      ps.setInt(1, persona.getIdPersona());
      
      int resultado = ps.executeUpdate(); // Ejecutamos la Eliminacion
       if (resultado > 0) {
        return true;
      } else {
        return false;
      }
      
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

