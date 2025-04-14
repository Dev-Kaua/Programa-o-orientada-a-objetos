package ProjetinhoPetshop;

public class PetShop {
  //essa classe petshop será como se fosse nossa classe Main

  public static void receberAnimal(Animal animal) {
      System.out.println("\n--- Novo animal chegou! ---");
      animal.emitirSom();
      animal.mover();
      animal.alimentar("ração");
      System.out.println();
  }

  public static void main(String[] args) {
      Animal meuCachorro = new Cachorro();
      Animal meuGato = new Gato();

      receberAnimal(meuCachorro);
      receberAnimal(meuGato);

      // Outro exemplo de alimentação específica
      System.out.println("--- Gato experimentando peixe agora ---");
      meuGato.alimentar("peixe");
  }
}
