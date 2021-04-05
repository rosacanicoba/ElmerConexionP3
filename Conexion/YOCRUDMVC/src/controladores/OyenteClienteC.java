
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelos.ClienteC;
import modelos.ConsultaClienteC;
import vistas.VClienteCybernauta;


public class OyenteClienteC implements ActionListener{
  
  private VClienteCybernauta vistaC;
  private ClienteC cliente;
  private ConsultaClienteC modeloC;

  @SuppressWarnings("LeakingThisInConstructor")
   public OyenteClienteC(VClienteCybernauta vistaC, ClienteC cliente, ConsultaClienteC modeloC) {
   this.vistaC = vistaC;
   this.cliente = cliente;
   this.modeloC = modeloC;
   vistaC.bInsertarC.addActionListener(this);
   
   }
  public void iniciarC() {
    vistaC.setTitle("CRUD MVC EL CYBERNAUTA");
    vistaC.setLocationRelativeTo(null);
    vistaC.cajaId.setVisible(false);
  }

  @Override
  public void actionPerformed(ActionEvent ae){
    if (ae.getSource() == vistaC.bInsertarC) {
       cliente.setCodigo(vistaC.tCod.getText());
       //cliente.setDni(vistaC.tDNI.getText());
      //cliente.setDni(Integer.valueOf(vistaC.tDNI.getText()));
      cliente.setDni(Integer.parseInt(vistaC.tDNI.getText()));
      cliente.setNombre(vistaC.tNom.getText());
      cliente.setApellido(vistaC.tApe.getText());
      //cliente.setTelefono(Integer.valueOf(vistaC.tTelf.getText()));
      cliente.setTelefono(Integer.parseInt(vistaC.tTelf.getText()));
      cliente.setDireccion(vistaC.tDir.getText());
      
      if (modeloC.insertar(cliente)) {
        JOptionPane.showMessageDialog(null, "Registro insertado correctamente!");
      } else {
        JOptionPane.showMessageDialog(null, "Error registro no insertado");
      }
    } 
  }
  
 
  
}
