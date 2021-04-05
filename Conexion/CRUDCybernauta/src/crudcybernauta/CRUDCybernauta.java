
package crudcybernauta;

import controladores.OyenteClienteC;
import modelos.ClienteC;
import modelos.ConsultaClienteC;
import vistas.VClienteCybernauta;


public class CRUDCybernauta {

  public static void main(String[] args) {
    
   ClienteC cliente = new ClienteC();                                          // MODELO  
   ConsultaClienteC modeloC = new ConsultaClienteC();                          // MODELO2
   VClienteCybernauta vistaC = new VClienteCybernauta();                       // VISTA 
   OyenteClienteC controladores = new OyenteClienteC(vistaC, cliente, modeloC);// CONTROLADOR
    
   controladores.iniciarC();
   vistaC.setVisible(true);
   
  }
  
}
