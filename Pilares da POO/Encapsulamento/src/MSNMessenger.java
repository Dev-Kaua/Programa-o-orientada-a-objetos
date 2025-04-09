public class MSNMessenger {
  public void enviarMensagem(){
    validarConectadoInternet();
    System.out.println("Enviando mensagem");
    salvarHistoricoMensagem();
  }
  public void receberMensagem(){
    System.out.println("Recebendo msg");
  }
  private void validarConectadoInternet(){
    System.out.println("Validando se esta conectado a internet");
  }
  private void salvarHistoricoMensagem(){
    System.out.println("salvando no historico");
  }
}
