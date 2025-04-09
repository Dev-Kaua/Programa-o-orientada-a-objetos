public class ComputadorPedrinho {
  public static void main(String[] args) {
    System.out.println("MSN");
      MSNMessenger msn = new MSNMessenger();
      msn.enviarMensagem();
      msn.receberMensagem();
    System.out.println("FACEBOOK");
    Facebook face = new Facebook();
    face.enviarMensagem();
    face.receberMensagem();
    System.out.println("TELEGRAM");
    Telegram tlg = new Telegram();
    tlg.enviarMensagem();
    tlg.receberMensagem();
  }
}
