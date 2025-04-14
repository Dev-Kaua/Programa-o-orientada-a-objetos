package ProjetoFormasGeometricas;
import java.util.Scanner;

public class Main {
  private final static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
      int option;
      GeometricForm geometricForm = null;
      while (true) { 
          System.out.println("Escolha a forma geometrica para calcular a área");
          System.out.println("1- Quadrado");
          System.out.println("2- Retângulo");
          System.out.println("3- Circulo");
          System.out.println("4- Sair do programa");
          option = scanner.nextInt();
          if (option == 1){
            geometricForm = createSquare();
          }else if ( option == 2){
            geometricForm = createRectangle();
          }else if (option == 3) {
            geometricForm = createCircle();
          }else if (option == 4) {
            break;
          }else {
            System.out.println("Por favor, escolha um número válido\nPlease, choose a valid number!");
            continue;
          }
          System.out.println("O resultado do cálculo da área foi de " + geometricForm.getArea());
          System.out.println("==============END===============");
      }
  }

  private static GeometricForm createSquare(){
    System.out.println("Informe o tamanho dos lados:");
    var side = scanner.nextDouble();
    return new Square(side);
  }

  private static GeometricForm createRectangle(){
    System.out.println("Informe a base do retangulo:");
    var base = scanner.nextDouble();
    System.out.println("Agora, informe a altura:");
    var height = scanner.nextDouble();
    return new Rectangle(base, height);
  }

  private static GeometricForm createCircle(){
    System.out.println("Informe o raio do seu circulo:");
    var radius = scanner.nextDouble();
    return new Circle(radius);
  }

}
