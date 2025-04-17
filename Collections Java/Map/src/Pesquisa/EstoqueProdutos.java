package Pesquisa;
import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  //atributo
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco){
    estoqueProdutosMap.put(cod, new Produto(preco, nome, quantidade));
  }

  public void exibirProdutos(){
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0;
    if(!estoqueProdutosMap.isEmpty()){
      for(Produto p : estoqueProdutosMap.values()){
        valorTotalEstoque += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if(!estoqueProdutosMap.isEmpty()){
      for(Produto p : estoqueProdutosMap.values()){
        if(p.getPreco() > maiorPreco){
          produtoMaisCaro = p;
        }
      }
    }
    return produtoMaisCaro;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();
    estoque.exibirProdutos();
    
    estoque.adicionarProduto(1l, "Banana", 10, 5);
    estoque.adicionarProduto(2l, "Arroz", 5, 10);
    estoque.adicionarProduto(3l, "Chocolate", 2, 15);

    estoque.exibirProdutos();

    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
  }
}
