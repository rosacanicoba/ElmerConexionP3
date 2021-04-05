package controladores;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.*;
import modelos.Punto;
import vistas.PanelEventoTeclado;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class OyenteEventoTeclado extends KeyAdapter {
  
  private final Punto punto;
  private final PanelEventoTeclado panel;
  
  public OyenteEventoTeclado(Punto punto, PanelEventoTeclado panel) {
    this.punto = punto;
    this.panel = panel;
  }
  
  @Override
  public void keyPressed(KeyEvent e) {
    int codigo = e.getKeyCode();
    int radio = punto.getRadio();
    int inc = 5;
    
    switch(codigo) {
      case VK_UP: {
        if (punto.y - (radio + inc) >= 0) {
          punto.y -= inc;
        }
        break;
      }
      
      case VK_DOWN: {
        if (punto.y + (radio + inc) <= panel.getHeight()) {
          punto.y += inc;
        }
        break;
      }
      
      case VK_LEFT: {
        if (punto.x - (radio + inc) >= 0) {
          punto.x -= inc;
        }
        break;
      }
      
      case VK_RIGHT: {
        if (punto.x + (radio + inc) <= panel.getWidth()) {
          punto.x += inc;
        }
        break;
      }
      
      case VK_R: {
        punto.setColor(Color.RED);
        break;
      }
      
      case VK_B: {
        punto.setColor(Color.BLUE);
      }
    }
    
    panel.repaint();
  }
  
}
