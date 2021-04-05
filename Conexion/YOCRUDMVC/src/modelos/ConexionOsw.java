package modelos;

//import java.lang.reflect.InvocationTargetException;
import java.sql.*;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class ConexionOsw {
  
/*  public static final String DRIVER = "com.mysql.jdbc.Driver";
  
  private String url;
  private String servidor;
  private String usuario;
  private String password;
  private String nombreBaseDatos;
  private Driver controlador;
  
  public ConexionOsw(String servidor, String usuario, 
    String password, String nombreBaseDatos) {
    this.servidor         =   servidor;
    this.usuario          =   usuario;
    this.password         =   password;
    this.nombreBaseDatos  =   nombreBaseDatos;
    this.url = "jdbc:mysql://" + this.servidor + "/" + this.nombreBaseDatos;
    this.controlador      =   null;
  }
  
  public synchronized Connection getConnection(String driver) throws SQLException {
    if (controlador == null) {
      try {
        Class jdbcDriver = Class.forName(driver);
        this.controlador = (Driver)jdbcDriver.getDeclaredConstructor().newInstance();
        DriverManager.registerDriver(controlador);
      } catch (ClassNotFoundException 
        | IllegalAccessException 
        | IllegalArgumentException 
        | InstantiationException 
        | NoSuchMethodException 
        | SecurityException 
        | InvocationTargetException 
        | SQLException e) {
        System.out.println("Error al cargar el driver: " + e.getMessage());
      }
    }
    
    return DriverManager.getConnection(this.url, this.usuario, this.password);
  }
  
  public void close(Connection cn) {
    try {
      if (cn != null) {
        cn.close();
      }
    } catch (SQLException e) {
      System.out.println("Error al cerrar la conexión: " + e.getMessage());
    }
  }
  
  public void close(ResultSet rs) {
    try {
      if (rs != null) {
        rs.close();
      }
    } catch (SQLException e) {
      System.out.println("Error al cerrar ResultSet: " + e.getMessage());
    }
  }
  
  public void close(Statement st) {
    try {
      if (st != null) {
        st.close();
      }
    } catch (SQLException e) {
      System.out.println("Error al cerrar Statement: " + e.getMessage());
    }
  }
  
  public void close(PreparedStatement ps) {
    try {
      if (ps != null) {
        ps.close();
      }
    } catch (SQLException e) {
      System.out.println("Error al cerrar PreparedStatement: " + e.getMessage());
    }
  }*/
  
}


/*package conexion;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
/*public class Conexion {
  
  public static final String DRIVER = "com.mysql.jdbc.Driver";
  
  private final String url;
  private String servidor;
  private String usuario;
  private String password;
  private String nombreBaseDatos;
  private Driver controlador;
  
  public Conexion(String servidor, String usuario, 
    String password, String nombreBaseDatos) {
    this.servidor         =   servidor;
    this.usuario          =   usuario;
    this.password         =   password;
    this.nombreBaseDatos  =   nombreBaseDatos;
    this.url = "jdbc:mysql://" + this.servidor + "/" + this.nombreBaseDatos;
    this.controlador      =   null;
  }
  
  public synchronized Connection getConnection(String driver) throws SQLException {
    if (controlador == null) {
      try {
        Class jdbcDriver = Class.forName(driver);
        this.controlador = (Driver)jdbcDriver.getDeclaredConstructor().newInstance();
        DriverManager.registerDriver(controlador);
      } catch (ClassNotFoundException 
        | IllegalAccessException 
        | IllegalArgumentException 
        | InstantiationException 
        | NoSuchMethodException 
        | SecurityException 
        | InvocationTargetException 
        | SQLException e) {
        System.out.println("Error al cargar el driver: " + e.getMessage());
      }
    }
    
    return DriverManager.getConnection(this.url, this.usuario, this.password);
  }
  
  public void close(Connection cn) {
    try {
      if (cn != null) {
        cn.close();
      }
    } catch (SQLException e) {
      System.out.println("Error al cerrar la conexión: " + e.getMessage());
    }
  }
  
  public void close(ResultSet rs) {
    try {
      if (rs != null) {
        rs.close();
      }
    } catch (SQLException e) {
      System.out.println("Error al cerrar ResultSet: " + e.getMessage());
    }
  }
  
  public void close(Statement st) {
    try {
      if (st != null) {
        st.close();
      }
    } catch (SQLException e) {
      System.out.println("Error al cerrar Statement: " + e.getMessage());
    }
  }
  
  public void close(PreparedStatement ps) {
    try {
      if (ps != null) {
        ps.close();
      }
    } catch (SQLException e) {
      System.out.println("Error al cerrar PreparedStatement: " + e.getMessage());
    }
  }
  
}*/
