public class Carro extends Veiculo { //o carro é um Veiculo
    
  public void ligar() {
    confereCambio();       //encapsulamento
    confereCombustivel();     //encapsulamento
    System.out.println("CARRO LIGADO");
  }
  public void confereCombustivel() {
    System.out.println("conferindo combustivel");
  }
  public void confereCambio(){
    System.out.println("Conferindo cambio");
  }

}
