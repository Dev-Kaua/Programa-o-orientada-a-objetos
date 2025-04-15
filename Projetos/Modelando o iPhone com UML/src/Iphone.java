public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
  
  //métodos do reprodutor musical
  @Override
  public void tocar(){
    System.out.println("Tocando música...");
  }
  @Override
  public void pausar(){
    System.out.println("Música pausada.");
  }
  @Override
  public void selecionarMusica() {
    System.out.println("Música selecionada");
  }

  //métodos do aparelho telefonico
  @Override
  public void ligar(){
    System.out.println("Ligando...");
  }
  @Override
  public void atender(){
    System.out.println("chamada atendida!");
  }
  @Override
  public void iniciarCorreioDeVoz(){
    System.out.println("Correio de voz iniciado...");
  }

  //métodos do navegador de internet
  @Override
  public void exibirPagina(){
    System.out.println("Exibindo página na internet");
  }
  @Override
  public void adicionarNovaAba(){
    System.out.println("Nova aba criada!!!");
  }
  @Override
  public void atualizarPagina(){
    System.out.println("Nova página web criada!");
  }


}
