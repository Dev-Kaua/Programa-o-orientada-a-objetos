public abstract class ServiçoMensagemInstantanea {
  public abstract void enviarMensagem();
  public abstract  void receberMensagem();
  //boas práticas do encapsulamentos
  
  //somente os filhos conhecem esse método
  protected void validarConectadoInternet() {
    System.out.println("Validando a conexão com a internet");
  }
}
