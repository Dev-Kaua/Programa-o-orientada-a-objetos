import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> listaDeItems;

  public CarrinhoDeCompras() {
    this.listaDeItems = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    listaDeItems.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itemParaRemover = new ArrayList<>();
    for (Item t : listaDeItems) {
      if (t.getNome().equalsIgnoreCase(nome)) {
        itemParaRemover.add(t);
      }
    }
    listaDeItems.removeAll(itemParaRemover);
  }

  public double calcularValorTotal() {
    double total = 0.0;
    for (Item item : listaDeItems) {
      total += item.getPreco() * item.getQuantidade();
    }
    return total;
  }

  public void exibirItens(){
    if(listaDeItems.isEmpty()){
      System.out.println("O carrinho está vazio...");
    } else{
      System.out.println("Items no carrinho:");
      for(Item item : listaDeItems){
        System.out.println("- " + item.getNome() + " | Preço: R$" + item.getPreco() 
        + " | Quantidade: " + item.getQuantidade());
      }
    }
  }


  public class TesteCarrinho {
    public static void main(String[] args) {
      CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
      carrinho.adicionarItem("Notebook", 3500.00, 1);
      carrinho.adicionarItem("Mouse", 150.00, 2);
      carrinho.adicionarItem("Teclado", 250.00, 1);
  
      carrinho.exibirItens();
  
      double total = carrinho.calcularValorTotal();
      System.out.println("Valor total da compra: R$ " + total);
    }
  }
  

}
