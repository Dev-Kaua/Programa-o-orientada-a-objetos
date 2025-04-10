public class MSNMessenger extends ServiçoMensagemInstantanea {
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo MSN");
  }
  public void receberMensagem(){
    System.out.println("MSN Messenger recebendo mensagem");
  }
}
