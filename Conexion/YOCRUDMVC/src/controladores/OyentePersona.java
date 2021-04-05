package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelos.ConsultasPersona;
import modelos.Persona;
import vistas.VistaPersona;

public class OyentePersona implements ActionListener {
  private VistaPersona vista;
  private Persona persona;
  private ConsultasPersona modelo;

  public OyentePersona(VistaPersona vista, Persona persona, ConsultasPersona modelo) {
    this.vista = vista;
    this.persona = persona;
    this.modelo = modelo;
    vista.bInsertar.addActionListener(this);
  }

  public void iniciar() {
    vista.setTitle("CRUD MVC");
    vista.setLocationRelativeTo(null);
    vista.cajaId.setVisible(false);
  }

  @Override
  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == vista.bInsertar) {
      persona.setClave(vista.tClave.getText());
      persona.setNombre(vista.tNom.getText());
      persona.setDomicilio(vista.tDom.getText());
      persona.setCelular(vista.tCel.getText());
      persona.setCorreo_electronico(vista.tCorreo.getText());
      persona.setFecha_nacimiento(Date.valueOf(vista.tFecha.getText()));
      persona.setGenero(vista.cGenero.getSelectedItem().toString());

      if (modelo.insertar(persona)) {
        JOptionPane.showMessageDialog(null, "Resgistro insertado correctamente!");
      } else {
        JOptionPane.showMessageDialog(null, "Error registro no insertado");
      }
    }
  }
 
}
