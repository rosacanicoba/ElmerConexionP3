package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {

  private Vista vista;
  private Modelo modelo;

  public Controlador(Vista vista, Modelo modelo) {
    this.vista = vista;
    this.modelo = modelo;
    vista.bSumar.addActionListener(this);
  }

  public void iniciar() {
    vista.setTitle("MVC Sumar");
    vista.setLocationRelativeTo(null);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    modelo.setN1(Integer.parseInt(vista.tN1.getText()));
    modelo.setN2(Integer.parseInt(vista.tN2.getText()));
    modelo.sumar();

    vista.tResultado.setText(String.valueOf(modelo.getResul()));
  }

}
