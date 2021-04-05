
package crudmvc;

import controlador.ControladorPersona;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaPersona;


public class CRUDMVC {


  public static void main(String[] args) {
   VistaPersona vista = new VistaPersona();
   Persona persona = new Persona();
   ConsultasPersona modelo = new ConsultasPersona();
   ControladorPersona controlador = new ControladorPersona(vista, persona, modelo);
    
   controlador.iniciar();
   vista.setVisible(true);
  
  }
  
}
