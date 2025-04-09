package lanchonete.atendimento.cozinha;

public class Cozinheiro {
  public void adicionarLancheNoBalcao(){
    System.out.println("Adicionando lanche natural hamburger no balcao");
  }
  public void adicionarSucoNoBalcao(){
    System.out.println("Adicionando suco no balcao");
  }
  public void adicionarComboNoBalcao(){
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
  }
  private void prepararLanche(){
    System.out.println("Preparando lanche tipo hamburger");
  }
  private void prepararVitamina(){
    System.out.println("Preparando suco");
  }
  private void prepararCombo(){
    prepararLanche();
    prepararVitamina();
  }
  private void selecionarIngredientesLanche(){
    System.out.println("Selecionando o Pão, salada, ovo e carne");
  }
  private void selecionarIngredientesVitamina(){
    System.out.println("Selecionando fruta, leite e suco");
  }
  private void lavarIngredientes(){
    System.out.println("lavando ingredientes");
  }
  private void baterVitaminaLiquidificador() {
    System.out.println("Batendo vitamina");
  }
  private void fritarIngredientesLanche(){
    System.out.println("Fritando a carne e o ovo para o hamburger");
  }
  private void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }
  private void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }
}
