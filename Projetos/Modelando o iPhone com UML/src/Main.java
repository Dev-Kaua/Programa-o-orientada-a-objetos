import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Iphone meuIphone = new Iphone();
    Scanner scanner = new Scanner(System.in);
    int opcao = -1;

    System.out.println("📱 Bem-vindo ao iPhone Simulator!");

    while (opcao != 0) {
        System.out.println("\nEscolha uma funcionalidade:");
        System.out.println("1 - Reprodutor Musical 🎵");
        System.out.println("2 - Aparelho Telefônico 📞");
        System.out.println("3 - Navegador na Internet 🌐");
        System.out.println("0 - Sair ❌");
        System.out.print("Digite a opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        switch (opcao) {
          case 1:
            menuMusica(meuIphone, scanner);
            break;
          case 2:
            menuTelefone(meuIphone, scanner);
              break;
          case 3:
            menuInternet(meuIphone, scanner);
            break;
          case 0:
            System.out.println("Desligando o iPhone... 👋");
            break;
          default:
            System.out.println("Opção inválida. Tente novamente.");
        }
    }

    scanner.close();
  }

  public static void menuMusica(Iphone iphone, Scanner scanner) {
    System.out.println("\n🎵 Menu - Reprodutor Musical");
    System.out.println("1 - Tocar");
    System.out.println("2 - Pausar");
    System.out.println("3 - Selecionar Música");
    System.out.print("Escolha uma opção: ");
    int escolha = scanner.nextInt();
    scanner.nextLine();

    switch (escolha) {
      case 1 -> iphone.tocar();
      case 2 -> iphone.pausar();
      case 3 -> iphone.selecionarMusica();
      default -> System.out.println("Opção inválida.");
    }
  }

  public static void menuTelefone(Iphone iphone, Scanner scanner) {
    System.out.println("\n📞 Menu - Aparelho Telefônico");
    System.out.println("1 - Ligar");
    System.out.println("2 - Atender");
    System.out.println("3 - Iniciar Correio de Voz");
    System.out.print("Escolha uma opção: ");
    int escolha = scanner.nextInt();
    scanner.nextLine();

    switch (escolha) {
      case 1 -> iphone.ligar();
      case 2 -> iphone.atender();
      case 3 -> iphone.iniciarCorreioDeVoz();
      default -> System.out.println("Opção inválida.");
    }
  }

  public static void menuInternet(Iphone iphone, Scanner scanner) {
    System.out.println("\n🌐 Menu - Navegador de Internet");
    System.out.println("1 - Exibir Página");
    System.out.println("2 - Adicionar Nova Aba");
    System.out.println("3 - Atualizar Página");
    System.out.print("Escolha uma opção: ");
    int escolha = scanner.nextInt();
    scanner.nextLine();

    switch (escolha) {
      case 1 -> iphone.exibirPagina();
      case 2 -> iphone.adicionarNovaAba();
      case 3 -> iphone.atualizarPagina();
      default -> System.out.println("Opção inválida.");
    }
  }
}

