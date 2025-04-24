package projeto1;

class Conta {
    // TODO: Implemente os atributos privados para garantir que só podem ser acessados dentro da classe:
    private String titular;
    private int numeroConta;
    private double saldo;

    // TODO: Crie o construtor para inicializar os atributos da conta:
    public Conta(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
    // TODO: Adicione o método público para consultar o saldo:
    public double consultarSaldo (){
        return saldo;
    }

    // TODO: Adicione o método público para realizar saque:
    public boolean sacar(double valorSaque) {
        if(valorSaque > saldo) {
            return false;
        }
        saldo -= valorSaque;
        return true;
    }

    // TODO: Crie o método público para realizar depósito
    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }
}