package modelos;

import java.awt.Color;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Proyectil extends Punto {
  
  private int angulo;
  
  public Proyectil(int x, int y, int radio, Color color) {
    super(x, y, radio, color);
    angulo = 60;
  }

  public int getAngulo() {
    return angulo;
  }

  public void setAngulo(int angulo) {
    this.angulo = angulo;
  }
  
}
