package lanchonete;

import lanchonete.AreaCliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
  public static void main(String[] args) {
      Cozinheiro cozinheiro = new Cozinheiro();
  
      //ações que estabelecimento precisa ter ciência
      cozinheiro.adicionarComboNoBalcao();
      cozinheiro.adicionarLancheNoBalcao();
      cozinheiro.adicionarSucoNoBalcao();


      Atendente atendente = new Atendente();
      atendente.receberPagamento();
      atendente.servindoMesa();

      Cliente cliente = new Cliente();
      cliente.escolherLanche();
      cliente.fazerPedido();
      cliente.pagarConta();
}
