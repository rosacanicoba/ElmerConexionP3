package modelos;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Puntos extends ArrayList<Punto> implements Dibujable {

  @Override
  public void dibujar(Graphics g) {
    for (Punto punto : this) {
      punto.dibujar(g);
    }
  }
  
}
