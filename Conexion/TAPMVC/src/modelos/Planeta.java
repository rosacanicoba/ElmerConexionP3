package modelos;

import java.awt.*;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Planeta extends Punto {

  private int anchoOrbita;
  private int altoOrbita;

  public Planeta(int anchoOrbita, int altoOrbita, int radio, Color color) {
    super(0, 0, radio, color);
    this.anchoOrbita = anchoOrbita;
    this.altoOrbita = altoOrbita;
  }

  @Override
  public void dibujar(Graphics g) {
    g.setColor(Color.GRAY);
    g.drawOval(- anchoOrbita / 2, - altoOrbita / 2, anchoOrbita, altoOrbita);
    super.dibujar(g);
  }

  public int getAnchoOrbita() {
    return anchoOrbita;
  }

  public void setAnchoOrbita(int anchoOrbita) {
    this.anchoOrbita = anchoOrbita;
  }

  public int getAltoOrbita() {
    return altoOrbita;
  }

  public void setAltoOrbita(int altoOrbita) {
    this.altoOrbita = altoOrbita;
  }
}
