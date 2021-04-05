package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import javax.swing.JPanel;
import modelos.Puntos;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class PanelPuntos extends JPanel {
  
  private final Puntos puntos;
  
  public PanelPuntos(Puntos puntos) {
    this.puntos = puntos;
    this.setBackground(Color.CYAN);
  }
  
  public void addEventos(MouseAdapter oyente) {
    this.addMouseListener(oyente);
    this.addMouseMotionListener(oyente);
  }
  
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    puntos.dibujar(g);
  }
  
}
