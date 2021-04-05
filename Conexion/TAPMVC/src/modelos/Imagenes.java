package modelos;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Imagenes extends ArrayList<Image> implements Dibujable {

  private Image activa;
  private int x;
  private int y;
  
  public Imagenes(String nombre) {
    int i = 0;
    while (true) {
      String archivo = "/imagenes/" + nombre.trim() + "-" + (++i) + ".png";
      URL imagen = getClass().getResource(archivo);
      if (imagen != null) {
        add(new ImageIcon(imagen).getImage());
      } else {
        break;
      }
    }
  }
  
  @Override
  public void dibujar(Graphics g) {
    if (activa != null) {
      g.drawImage(activa, x, y, null);
    }
  }
  
  public Image getActiva() {
    return activa;
  }
  
  public void setActiva(int activa) {
    this.activa = get(activa);
  }
  
  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
}
