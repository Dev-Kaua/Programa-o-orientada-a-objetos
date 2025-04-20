import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
  protected List<String> historico = new ArrayList<>();

  private Cliente cliente;
  private int numero;
  private double saldo;
  private String agencia; // Para identificar a agência da conta.
  protected String tipoConta;

    public String getTipoConta() {
        return tipoConta;
    }


  public Conta(Cliente cliente, String agencia) {
      this.cliente = cliente;
      this.numero = (int) (Math.random() * 10000); // Gerando número de conta aleatório
      this.saldo = 0;
      this.agencia = agencia;  // Recebe a agência ao criar a conta
  }

  public int getNumero() {
      return numero;
  }

  public double getSaldo() {
      return saldo;
  }

  public void setSaldo(double saldo) {
      this.saldo = saldo; // Método para definir o saldo
  }

  public Cliente getCliente() {
      return cliente;
  }

  public String getAgencia() {
      return agencia;  // Método que retorna a agência
  }

  public void depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        registrarTransacao("Depósito de R$" + valor);
    } else {
        System.out.println("Valor de depósito inválido.");
    }
}


public void sacar(double valor) {
    if (valor > 0 && saldo >= valor) {
        saldo -= valor;
        System.out.println("Saque realizado com sucesso!");
        registrarTransacao("Saque de R$" + valor);
    } else {
        System.out.println("Saldo insuficiente ou valor inválido.");
    }
}


public void transferir(double valor, Conta destino) {
    if (valor > 0 && saldo >= valor) {
        saldo -= valor;
        destino.depositar(valor);
        System.out.println("Transferência realizada com sucesso!");
        registrarTransacao("Transferência de R$" + valor + " para " + destino.getCliente().getNome());
        destino.registrarTransacao("Recebimento de R$" + valor + " de " + this.getCliente().getNome());
    } else {
        System.out.println("Erro na transferência: saldo insuficiente ou valor inválido.");
    }
}


  protected void registrarTransacao(String descricao) {
    String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    historico.add("[" + dataHora + "] " + descricao);
}

public void imprimirHistorico() {
    System.out.println("=== Histórico da Conta ===");
    if (historico.isEmpty()) {
        System.out.println("Nenhuma transação registrada.");
    } else {
        for (String evento : historico) {
            System.out.println(evento);
        }
    }
}

  @Override
  public String toString() {
      return "Conta número " + numero + ", Agência: " + agencia + ", Cliente: " + cliente.getNome() + ", Saldo: R$ " + saldo;
  }

  public abstract void imprimirExtrato();
  public abstract void aplicarJuros();  // Método abstrato para aplicar juros em subclasses.
}
