package ProjetinhoPetshop;

public class Cachorro implements Animal {

  @Override
  public void emitirSom() {
      System.out.println("Cachorro: Au au!");
  }

  @Override
  public void mover() {
      System.out.println("Cachorro correndo no quintal...");
  }

  @Override
  public void alimentar(String comida) {
      System.out.println("Cachorro comeu " + comida + " com alegria!");
  }
}
