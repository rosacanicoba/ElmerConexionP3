package modelos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Punto extends Point implements Dibujable {

  protected int radio;
  protected Color color;
  
  public Punto(int x, int y, int radio, Color color) {
    super(x, y);
    this.radio = radio;
    this.color = color;
  }
  
  public Punto() { this(0, 0, 0, Color.BLACK); }
  
  /**
   * Método para dibujar un punto con radio y color
   * en el contexto gráfico.
   * @param g Es la brocha para dibujar.
   */
  @Override
  public void dibujar(Graphics g) {
    g.setColor(color);
    g.fillOval(x - radio, y - radio, radio * 2, radio * 2);
    g.setColor(Color.BLACK);
    g.drawOval(x - radio, y - radio, radio * 2, radio * 2);
  }
  
  public boolean contiene(int pX, int pY) {
    return this.distance(pX, pY) <= this.radio;
  }
  
  public boolean contiene(Point p) {
    return contiene((int)p.x, (int)p.getY());
  }
  
  @Override
  public String toString() {
    return "{" + x + "," + y + "}";
  }

  public int getRadio() {
    return radio;
  }

  public void setRadio(int radio) {
    this.radio = radio;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }
  
}
