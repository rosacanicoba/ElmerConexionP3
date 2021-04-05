package modelos;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Jugador {
  
  private String nombre;
  private String pronostico;
  private String temperatura;
  private String humedad;
  private String viento;
  private String jugar;
  
  public Jugador(String nombre, String pronostico, String temperatura,
    String humedad, String viento, String jugar) {
    this.nombre = nombre;
    this.pronostico = pronostico;
    this.temperatura = temperatura;
    this.humedad = humedad;
    this.viento = viento;
    this.jugar = jugar;
  }
  
  public Jugador(String[] datos) {
    this(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
  }
  
  public Jugador() {
    this("", "", "", "", "", "");
  }
  
  public String[] getJugador() {
    return new String[] {
      nombre, pronostico,
      temperatura, humedad,
      viento, jugar
    };
  }
  
  @Override
  public String toString() {
    return nombre + "," + pronostico + "," +
      temperatura + "," + humedad + "," + 
      viento + "," + jugar;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getPronostico() {
    return pronostico;
  }

  public void setPronostico(String pronostico) {
    this.pronostico = pronostico;
  }

  public String getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(String temperatura) {
    this.temperatura = temperatura;
  }

  public String getHumedad() {
    return humedad;
  }

  public void setHumedad(String humedad) {
    this.humedad = humedad;
  }

  public String getViento() {
    return viento;
  }

  public void setViento(String viento) {
    this.viento = viento;
  }

  public String getJugar() {
    return jugar;
  }

  public void setJugar(String jugar) {
    this.jugar = jugar;
  }
  
}
