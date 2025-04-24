package projeto1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro da projeto1.Conta ===");
        System.out.print("Nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();

        Conta conta = new Conta(titular, numeroConta, saldo);


        // Operações de saque e depósito
        if (scanner.hasNextDouble()) {
            double valorSaque = scanner.nextDouble();
            if (!conta.sacar(valorSaque)) {
                System.out.println("Saque invalido: Saldo insuficiente");
                System.out.println("Saldo Atual: " + String.format("%.2f", conta.consultarSaldo()));
            }
        }

        if (scanner.hasNextDouble()) {
            double valorDeposito = scanner.nextDouble();
            conta.depositar(valorDeposito);
        }

        // Imprime o saldo final atualizado
        System.out.println("Saldo Atualizado: " + String.format("%.2f", conta.consultarSaldo()));

        scanner.close(); // Fecha o scanner
    }
}