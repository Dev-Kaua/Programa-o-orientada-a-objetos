public class Facebook extends ServiçoMensagemInstantanea {
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo Facebook");
  }
  public void receberMensagem(){
    System.out.println("Facebook recebendo mensagem");
  }
}
