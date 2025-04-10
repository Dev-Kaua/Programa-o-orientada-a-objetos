public class Telegram extends ServiçoMensagemInstantanea {
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando mensagem pelo Telegram");
  }
  public void receberMensagem(){
    System.out.println("Telegram recebendo mensagem");
  }
}
