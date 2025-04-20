import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Banco Digital");

        int opcao;
        do {
            System.out.println("\n==== MENU BANCO DIGITAL ====");
            System.out.println("1 - Criar nova conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Mostrar extrato");
            System.out.println("6 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
              case 1:
                System.out.print("Nome do cliente: ");
                String nome = scanner.nextLine();
                System.out.print("CPF do cliente: ");
                String cpf = scanner.nextLine();
                System.out.print("Agência da conta: ");
                String agencia = scanner.nextLine();  // Pedir a agência
                Cliente cliente = new Cliente(nome, cpf);
                Conta novaConta = new ContaCorrente(cliente, agencia);  // Passar agência aqui
                banco.adicionarConta(novaConta);
                System.out.println("Conta criada com sucesso! Número da conta: " + novaConta.getNumero());
                break;
              case 2:
                Conta contaDeposito = buscarConta(scanner, banco);
                if (contaDeposito != null) {
                    System.out.print("Valor para depósito: ");
                    double valor = scanner.nextDouble();
                    contaDeposito.depositar(valor);
                } else {
                    System.out.println("Conta não encontrada.");
                }
                break;

              case 3:
                Conta contaSaque = buscarConta(scanner, banco);
                if (contaSaque != null) {
                    System.out.print("Valor para saque: ");
                    double valor = scanner.nextDouble();
                    contaSaque.sacar(valor);
                } else {
                    System.out.println("Conta não encontrada.");
                }
                break;

              case 4:
                System.out.println("-- Conta de origem --");
                Conta origem = buscarConta(scanner, banco);
                System.out.println("-- Conta de destino --");
                Conta destino = buscarConta(scanner, banco);
                if (origem != null && destino != null) {
                    System.out.print("Valor para transferência: ");
                    double valor = scanner.nextDouble();
                    origem.transferir(valor, destino);
                } else {
                    System.out.println("Conta de origem ou destino não encontrada.");
                }
                break;

              case 5:
                Conta contaExtrato = buscarConta(scanner, banco);
                if (contaExtrato != null) {
                   contaExtrato.imprimirExtrato();
                } else {
                    System.out.println("Conta não encontrada.");
                }
                break;

              case 6:
                banco.listarContas();
                break;

              case 0:
                System.out.println("Saindo do sistema...");
                break;

              default:
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static Conta buscarConta(Scanner scanner, Banco banco) {
        System.out.println("Você quer buscar a conta por: ");
        System.out.println("1 - CPF");
        System.out.println("2 - Número da conta");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha == 1) {
            System.out.print("Digite o CPF: ");
            String cpf = scanner.nextLine();
            return banco.buscarContaPorCPF(cpf);
        } else if (escolha == 2) {
            System.out.print("Digite o número da conta: ");
            int numero = scanner.nextInt();
            return banco.buscarContaPorNumero(numero);
        } else {
          System.out.println("Opção inválida.");
          return null;
        }
    }
}
