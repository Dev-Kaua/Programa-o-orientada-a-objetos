package projeto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoConta = scanner.nextLine().trim();
        String nome = scanner.nextLine().trim(); // Ignorado nesse exemplo, mas pode ser usado
        int numeroConta = scanner.nextInt(); // Também não usado, mas pode ser adicionado na classe base
        double saldoInicial = scanner.nextDouble();

        Conta conta;

        if (tipoConta.equalsIgnoreCase("Corrente")) {
            double limite = scanner.nextDouble();
            conta = new ContaCorrente(saldoInicial, limite);
        } else if (tipoConta.equalsIgnoreCase("Poupanca")) {
            conta = new ContaPoupanca(saldoInicial);
        } else {
            System.out.println("Tipo de conta inválido.");
            scanner.close();
            return;
        }

        // Executa os saques enquanto houver valores de entrada
        while (scanner.hasNextDouble()) {
            double valorOperacao = scanner.nextDouble();
            conta.sacar(valorOperacao);
        }

        scanner.close();
    }
}
