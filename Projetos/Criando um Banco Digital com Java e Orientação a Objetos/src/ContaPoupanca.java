public class ContaPoupanca extends Conta {

  private static final double TAXA_JUROS = 0.005;  // 0,5% ao mês

  public ContaPoupanca(Cliente cliente, String agencia) {
      super(cliente, agencia);
  }

  @Override
  public void aplicarJuros() {
      double saldoComJuros = getSaldo() * (1 + TAXA_JUROS);
      setSaldo(saldoComJuros);
  }

  @Override
  public void imprimirExtrato() {
      System.out.println("=== Extrato Conta Poupança ===");
      System.out.println("Número da conta: " + getNumero());
      System.out.println("Agência: " + getAgencia());
      System.out.println("Saldo: R$ " + getSaldo());
  }
}

