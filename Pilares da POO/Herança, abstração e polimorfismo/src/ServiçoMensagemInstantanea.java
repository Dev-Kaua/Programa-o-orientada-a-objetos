public class ServiçoMensagemInstantanea {
  public void enviarMensagem(){
    validarConectadoInternet();
    System.out.println("Enviando msg");
    salvarHistoricoMensagem();
  }
  public void receberMensagem(){
    System.out.println("Recebendo msg");
  }
  //boas práticas do encapsulamentos
  private void validarConectadoInternet(){
    System.out.println("Validando conexao");
  }
  private void salvarHistoricoMensagem(){
    System.out.println("Salvando histórico");
  }
}
