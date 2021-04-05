package modelos;

import java.awt.*;
import java.util.ArrayList;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Planetas extends ArrayList<Planeta> implements Dibujable{
  
  public Planetas(){
    add(new Planeta(300, 250, 25, Color.BLUE));
    add(new Planeta(400, 350, 15, Color.RED));
    add(new Planeta(200, 140, 10, Color.GREEN));
    add(new Planeta(600, 450, 50, Color.MAGENTA));
    add(new Planeta(0, 0, 30, Color.YELLOW));
  }
  
  @Override
  public void dibujar(Graphics g) {
    for (Planeta planeta : this) {
      planeta.dibujar(g);
    }
  }
}
