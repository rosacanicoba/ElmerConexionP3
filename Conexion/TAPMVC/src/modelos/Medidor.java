package modelos;

import java.awt.*;
import static java.awt.Color.*;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Medidor extends Punto {

  private int maximo;
  private int valor;
  public static final Color[] COLORES = {GREEN, YELLOW, ORANGE, RED};

  public Medidor(int ancho) {
    super(0, 0, ancho / 2, LIGHT_GRAY);
    this.maximo = 100;
  }

  @Override
  public void dibujar(Graphics g) {
    super.dibujar(g);
    int rWhite = this.radio - this.radio / 20;
    g.setColor(WHITE);
    g.fillOval(x - rWhite, y - rWhite, 2 * rWhite, 2 * rWhite);
    int rGray = rWhite - 2;
    g.setColor(GRAY);
    g.fillOval(x - rGray, y - rGray, 2 * rGray, 2 * rGray);
    int rDarkGray = rGray - this.radio / 20;
    g.setColor(DARK_GRAY);
    g.fillOval(x - rDarkGray, y - rDarkGray, 2 * rDarkGray, 2 * rDarkGray);
    g.setColor(GRAY);
    int inc = 180 / 4;
    for (int i = 0; i < 4; i++) {
      g.setColor(COLORES[i]);
      g.fillArc(x - rDarkGray, y - rDarkGray, 2 * rDarkGray, 2 * rDarkGray, i * inc, inc);
    }
    int xIni = x - rDarkGray;
    g.setColor(GRAY);
    g.fillRect(xIni, y - this.radio / 40, 2 * rDarkGray, this.radio / 20);
    int rGrayInt = this.radio / 3;
    g.fillOval(x - rGrayInt, y - rGrayInt, 2 * rGrayInt, 2 * rGrayInt);
    g.setColor(DARK_GRAY);
    int rDarkGrayInt = rGrayInt - this.radio / 20;
    g.fillOval(x - rDarkGrayInt, y - rDarkGrayInt, 2 * rDarkGrayInt, 2 * rDarkGrayInt);

    int rAguja = rDarkGray - this.radio / 40;
    int rFinAguja = this.radio / 10;
    double rad1 = -valor * Math.PI / maximo;
    double anc1 = Math.PI / 2;
    int x1 = x + (int) (rAguja * Math.cos(rad1));
    int y1 = y + (int) (rAguja * Math.sin(rad1));
    double rad2 = rad1 - anc1;
    int x2 = x + (int) (rFinAguja * Math.cos(rad2));
    int y2 = y + (int) (rFinAguja * Math.sin(rad2));
    double rad3 = rad1 + anc1;
    int x3 = x + (int) (rFinAguja * Math.cos(rad3));
    int y3 = y + (int) (rFinAguja * Math.sin(rad3));

    int[] vX = {x1, x2, x, x3};
    int[] vY = {y1, y2, y, y3};

    g.setColor(LIGHT_GRAY);
    g.fillPolygon(vX, vY, vX.length);
    g.fillOval(x - rFinAguja, y - rFinAguja, rFinAguja * 2, rFinAguja * 2);
    int rCentro = 4;
    g.setColor(DARK_GRAY);
    g.fillOval(x - rCentro, y - rCentro, 2 * rCentro, 2 * rCentro);
    g.setColor(WHITE);
    String salida = "" + valor;
    Font fuente = new Font("Arial", Font.BOLD, this.radio / 5);
    g.setFont(fuente);
    
    FontMetrics metricas = g.getFontMetrics(fuente);
    int ancho = (int)metricas.getStringBounds(salida, g).getWidth();
    g.drawString(salida, x - ancho / 2, (int)(y + 2 * rDarkGray / 3));
  }

  public int getValor() {
    return valor;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

  public int getMaximo() {
    return maximo;
  }

  public void setMaximo(int maximo) {
    this.maximo = maximo;
  }
}
