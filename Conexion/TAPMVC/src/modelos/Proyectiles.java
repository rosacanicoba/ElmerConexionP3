package modelos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Proyectiles extends ArrayList<Proyectil> implements Dibujable {

  private int angulo;
  
  public Proyectiles() {
    this.angulo = 60;
  }
  
  @Override
  public void dibujar(Graphics g) {
    Proyectil[] array = new Proyectil[this.size()];
    array = this.toArray(array);
    for (Proyectil proyectil : array) {
      proyectil.dibujar(g);
    }
    
    g.setColor(Color.BLACK);
    g.fillOval(-15, -15, 30, 30);
    g.fillArc(-40, -40, 80, 80, angulo - 10, 20);
    g.fillArc(-42, -42, 84, 84, angulo - 1, 2);
  }

  public int getAngulo() {
    return angulo;
  }

  public void setAngulo(int angulo) {
    this.angulo = angulo;
  }
  
}
