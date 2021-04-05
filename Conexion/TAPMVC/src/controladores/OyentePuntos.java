package controladores;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelos.Punto;
import modelos.Puntos;
import vistas.PanelPuntos;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class OyentePuntos extends MouseAdapter {
  
  private final Puntos puntos;
  private final PanelPuntos panel;
  private boolean seleccionado;    // <====
  private Punto puntoSeleccionado; // <===
  private int deltaX;
  private int deltaY;
  
  public OyentePuntos(Puntos puntos, PanelPuntos panel) {
    this.puntos = puntos;
    this.panel = panel;
  }
  
  @Override
  public void mouseClicked(MouseEvent e) {
    Punto punto = new Punto(e.getX(), e.getY(), 10, Color.BLUE);
    System.out.println(punto.getX() + "," + punto.getY());
    puntos.add(punto);
    panel.repaint();
  }
  
  @Override
  public void mousePressed(MouseEvent e) {
    for (Punto punto : puntos) {
      if (punto.contiene(e.getX(), e.getY())) {
        puntoSeleccionado = punto;
        seleccionado = true;
        
        deltaX = e.getX() - puntoSeleccionado.x;
        deltaY = e.getY() - puntoSeleccionado.y;
        
        if (SwingUtilities.isRightMouseButton(e)) {
          puntoSeleccionado.setColor(Color.RED);
          panel.repaint();
          
          int dX = e.getXOnScreen();
          int dY = e.getYOnScreen();
          
          JOptionPane dialogoConfirmacion = new JOptionPane(
            "¿Eliminar este punto?",
            JOptionPane.QUESTION_MESSAGE,
            JOptionPane.YES_NO_OPTION
          );
          
          JDialog dialogo = dialogoConfirmacion.createDialog(
            panel, "Confirmación"
          );
          dialogo.setLocation(dX + 2, dY + 10);
          dialogo.setSize(250, 120);
          dialogo.setVisible(true);
          Integer opcion = (Integer)dialogoConfirmacion.getValue();

          if (opcion == JOptionPane.YES_OPTION) {
            puntos.remove(puntoSeleccionado);
          } else {
            puntoSeleccionado.setColor(Color.BLUE);
          }
          panel.repaint();
        }
        break;
      }
    }
  }
  
  @Override
  public void mouseReleased(MouseEvent e) {
    seleccionado = false;
  }
  
  @Override
  public void mouseDragged(MouseEvent e) {
    if (seleccionado) {
      puntoSeleccionado.x = e.getX() - deltaX;
      puntoSeleccionado.y = e.getY() - deltaY;
      
      panel.repaint();
    }
  }
  
}
