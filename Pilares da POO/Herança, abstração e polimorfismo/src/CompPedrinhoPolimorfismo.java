public class CompPedrinhoPolimorfismo {
  public static void main(String[] args) {
      ServiçoMensagemInstantanea smi = null;
      /*Não se sabe qual app
       mas qualquer um deverá enviar e receber mensagem
       */
      String appEscolhido = "tlg";

      if(appEscolhido.equals("msn"))
        smi = new MSNMessenger();
      else if(appEscolhido.equals("face"))
        smi = new Facebook();
      else if(appEscolhido.equals("tlg"))
        smi = new Telegram();
      
      smi.enviarMensagem();
      smi.receberMensagem();
  }
}
