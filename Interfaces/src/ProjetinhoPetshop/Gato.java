package ProjetinhoPetshop;

public class Gato implements Animal {

  @Override //sobreescrevendo um método vindo da implementação Animal
  public void emitirSom() {
      System.out.println("Gato: Miau...");
  }

  @Override
  public void mover() {
      System.out.println("Gato pulando no sofá...");
  }

  @Override
  public void alimentar(String comida) {
      if (comida.equalsIgnoreCase("peixe")) {
          System.out.println("Gato comeu peixe com satisfação!");
      } else {
          System.out.println("Gato cheirou " + comida + " e foi embora.");
      }
  }
}
