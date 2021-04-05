package modelos;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import util.Archivo;

/**
 * @author Oswaldo Daniel Cruz Cruz
 */
public class Jugadores extends HashMap<String, Jugador> {

  private String nombreArchivo;
  private int totalJugadores;
  private int totalJugando;

  // CREATE
  public void adicionarJugador(Jugador jugador) {
    this.put(jugador.getNombre(), jugador);
    totalJugadores++;
    totalJugando += jugador.getJugar().equals("Si") ? 1 : 0;
  }

  // READ
  public Jugador buscarJugador(String nombre) {
    return this.get(nombre);
  }

  // UPDATE
  public Jugador modificarJugador(Jugador jugador) {
    String nombre = jugador.getNombre();
    String valorNuevo = jugador.getJugar();
    String valorActual = this.get(nombre).getJugar();

    if (!valorNuevo.equals(valorActual)) {
      totalJugando += valorActual.equals("Si") ? -1 : 1;
    }

    return replace(nombre, jugador);
  }

  // DELETE
  public Jugador eliminarJugador(Jugador jugador) {
    String nombre = jugador.getNombre();
    Jugador jugadorEliminado = this.remove(nombre);

    if (jugadorEliminado != null) {
      totalJugadores--;
      totalJugando -= jugadorEliminado.getJugar().equals("Si") ? 1 : 0;
    }

    return jugadorEliminado;
  }

  // INICIALIZAR
  public void inicializarJugadores() {
    this.clear();
    totalJugadores = 0;
    totalJugando = 0;
  }

  public void leerJugadores(File archivo) {
    this.inicializarJugadores();
    this.nombreArchivo = archivo.getName();
    ArrayList<String> registros = Archivo.leerArchivo(archivo.getPath());

    for (String registro : registros) {
      Jugador jugador = new Jugador(registro.split(","));
      this.adicionarJugador(jugador);
    }
  }

  public void grabarJugadores(File archivo) {
    ArrayList<String> lista = new ArrayList();
    Iterator<Jugador> iterador = this.values().iterator();

    while (iterador.hasNext()) {
      Jugador jugador = iterador.next();
      lista.add(jugador.toString());
    }

    Archivo.grabarArchivo(archivo.getPath(), lista);
    nombreArchivo = archivo.getName();
  }

  public String getNombreArchivo() {
    return nombreArchivo;
  }

  public void setNombreArchivo(String nombreArchivo) {
    this.nombreArchivo = nombreArchivo;
  }

  public int getTotalJugadores() {
    return totalJugadores;
  }

  public void setTotalJugadores(int totalJugadores) {
    this.totalJugadores = totalJugadores;
  }

  public int getTotalJugando() {
    return totalJugando;
  }

  public void setTotalJugando(int totalJugando) {
    this.totalJugando = totalJugando;
  }

}
