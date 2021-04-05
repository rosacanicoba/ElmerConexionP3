package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.VistaPersona;

public class ControladorPersona implements ActionListener {
  private VistaPersona vista;
  private Persona persona;
  private ConsultasPersona modelo;

  public ControladorPersona(VistaPersona vista, Persona persona, ConsultasPersona modelo) {
    this.vista = vista;
    this.persona = persona;
    this.modelo = modelo;
    vista.bInsertar.addActionListener(this);
    vista.bLimpiar.addActionListener(this);
    vista.bBuscar.addActionListener(this);
    vista.bModificar.addActionListener(this);
    vista.bEliminar.addActionListener(this);
    
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
         limpiarCajas();
      } else {
        JOptionPane.showMessageDialog(null, "Error registro no insertado");
         limpiarCajas();
      }
    }
    
    if (ae.getSource() == vista.bLimpiar) {
         limpiarCajas();
    }
    
     if (ae.getSource() == vista.bBuscar) {
      persona.setClave(vista.tBuscar.getText()); 
      if(modelo.buscar(persona)) {
        vista.cajaId.setText(String.valueOf(persona.getIdPersona()));
        vista.tClave.setText(persona.getClave());
        vista.tNom.setText(persona.getNombre());
        vista.tDom.setText(persona.getDomicilio());
        vista.tCel.setText(persona.getCelular());
        vista.tCorreo.setText(persona.getCorreo_electronico());
        vista.tFecha.setText(String.valueOf(persona.getFecha_nacimiento()));
        vista.cGenero.setSelectedItem(persona.getGenero());
      }else {
        JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
          limpiarCajas();
      }  
     }  
     
     if (ae.getSource() == vista.bModificar) {
      persona.setIdPersona(Integer.parseInt(vista.cajaId.getText()));
      persona.setClave(vista.tClave.getText());
      persona.setNombre(vista.tNom.getText());
      persona.setDomicilio(vista.tDom.getText());
      persona.setCelular(vista.tCel.getText());
      persona.setCorreo_electronico(vista.tCorreo.getText());
      persona.setFecha_nacimiento(Date.valueOf(vista.tFecha.getText()));
      persona.setGenero(vista.cGenero.getSelectedItem().toString());
      
      if(modelo.modificar(persona)) {
        JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
          limpiarCajas();
       }else {
        JOptionPane.showMessageDialog(null, "No se pudo modificar");
          limpiarCajas();
      }
    }
     
     if (ae.getSource() == vista.bEliminar) {
      persona.setIdPersona(Integer.parseInt(vista.cajaId.getText()));
           
      if(modelo.eliminar(persona)) {
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
          limpiarCajas();
       }else {
        JOptionPane.showMessageDialog(null, "No se pudo eliminar registro");
          limpiarCajas();
      }
    }
  }

  public void limpiarCajas() {
    vista.bBuscar.setText(null);
    vista.tClave.setText(null);
    vista.tCel.setText(null);
    vista.tNom.setText(null);
    vista.tDom.setText(null);
    vista.tCorreo.setText(null);
    vista.tFecha.setText(null);
    vista.cGenero.setSelectedIndex(0);
  }
}
