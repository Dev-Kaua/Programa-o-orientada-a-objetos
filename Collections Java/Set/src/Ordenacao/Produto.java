package Ordenacao;
import java.util.Comparator;

public class Produto implements Comparable<Produto>{
  //Atributos:
  private long codigo;
  private double preco;
  private String nome;
  private int quantidade;

  public Produto(long codigo, String nome, Double preco, int quantidade) {
    this.codigo = codigo;
    this.preco = preco;
    this.nome = nome;
    this.quantidade = quantidade;
  }

  @Override
  public int compareTo(Produto p){
    return nome.compareToIgnoreCase(p.getNome());
  }

  public long getCodigo() {
    return codigo;
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
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (codigo ^ (codigo >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Produto other = (Produto) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Produto{");
    sb.append("codigo=").append(codigo);
    sb.append(", preco=").append(preco);
    sb.append(", nome=").append(nome);
    sb.append(", quantidade=").append(quantidade);
    sb.append('}');
    return sb.toString();
  }   
}

class ComparatorPorPreco implements Comparator<Produto>{

  @Override
  public int compare(Produto p1, Produto p2){
    return Double.compare(p1.getPreco(), p2.getPreco());
  }
}