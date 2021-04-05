
package modelo;

public class Modelo {
  private int n1;
  private int n2;
  private int resul;

  public Modelo(int n1, int n2, int resul) {
    this.n1 = n1;
    this.n2 = n2;
    this.resul = resul;
  }

  public Modelo() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  /*public Modelo() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }*/

  public int getN1() {
    return n1;
  }

  public void setN1(int n1) {
    this.n1 = n1;
  }

  public int getN2() {
    return n2;
  }

  public void setN2(int n2) {
    this.n2 = n2;
  }

  public int getResul() {
    return resul;
  }

  public void setResul(int resul) {
    this.resul = resul;
  }
  
  
  public int sumar(){
    resul = n1 + n2;
    return resul;
  }
  
}
