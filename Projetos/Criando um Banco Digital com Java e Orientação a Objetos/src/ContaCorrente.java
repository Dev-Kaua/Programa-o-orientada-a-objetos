public class ContaCorrente extends Conta {
    
  private static final double TAXA_JUROS = 0.01;  // Exemplo de taxa de juros para conta corrente

  public ContaCorrente(Cliente cliente, String agencia) {
      super(cliente, agencia);
      this.tipoConta = "corrente";
  }

  @Override
  public void aplicarJuros() {
      double saldoComJuros = getSaldo() * (1 + TAXA_JUROS);
      setSaldo(saldoComJuros);
  }

  @Override
  public void imprimirExtrato() {
      System.out.println("=== Extrato Conta Corrente ===");
      System.out.println("Número da conta: " + getNumero());
      System.out.println("Agência: " + getAgencia());
      System.out.println("Saldo: R$ " + getSaldo());
  }
}