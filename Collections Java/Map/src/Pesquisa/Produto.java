package Pesquisa;

public class Produto {
  //atributos
  private double preco;
  private String nome;
  private int quantidade;
  
  public Produto(double preco, String nome, int quantidade) {
    this.preco = preco;
    this.nome = nome;
    this.quantidade = quantidade;
  }

  public double getPreco() {
    return preco;
  }
  public String getNome() {
    return nome;
  }
  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return "Produto [preco=" + preco + ", nome=" + nome + ", quantidade=" + quantidade + "]";
  }

  
}
