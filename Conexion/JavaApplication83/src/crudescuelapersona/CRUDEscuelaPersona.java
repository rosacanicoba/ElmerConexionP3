
package crudescuelapersona;

import controladores.OyentePersona;
import modelos.*;
import modelos.Persona;
import vistas.VistaPersona;


public class CRUDEscuelaPersona {

  public static void main(String[] args) {
   VistaPersona vista = new VistaPersona();
   Persona persona = new Persona();
   ConsultasPersona modelo = new ConsultasPersona();
   OyentePersona controlador = new OyentePersona(vista, persona, modelo);
    
   controlador.iniciar();
   vista.setVisible(true);
  
  }
  
}
