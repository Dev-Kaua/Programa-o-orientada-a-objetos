package ProjetinhoPetshop;

public interface Animal {
  //esses metodos são automaticamente public e abstract, portanto não é necessário colocá-los
  //senão estaremos sendo redundantes
  // qualquer atributo será automaticamente public, static e final
  void emitirSom();
  void mover();
  void alimentar(String comida);
}

