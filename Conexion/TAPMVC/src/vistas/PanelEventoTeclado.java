package vistas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import javax.swing.JPanel;
import modelos.Punto;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class PanelEventoTeclado extends JPanel {
  
  private final Punto punto;
  
  public PanelEventoTeclado(Punto punto) {
    this.punto = punto;
    this.setBackground(Color.CYAN);
  }
  
  public PanelEventoTeclado() {
    this(new Punto());
  }
  
  public void addEventos(KeyAdapter oyente) {
    this.setFocusable(true);
    this.addKeyListener(oyente);
  }
  
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    punto.dibujar(g);
    g.drawString("{" + punto.x + "," + punto.y + "}",
                  getWidth() - 100, getHeight() - 10);
  }
  
}
