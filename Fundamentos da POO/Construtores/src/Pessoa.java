public class Pessoa {
  private String nome;
  private String cpf;
  private String endereco;

  public String getNome() {
    return nome;
  }
  public String getCpf() {
    return cpf;
  }
  public String getEndereco() {
    return endereco;
  }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //?Cadê os setters de nome e cpf? por que não foram criados?
    //!Método construtor
    //?Dessa forma, estou dizendo que toda vez que eu quiser criar uma pesoa automaticamente
    //?já tenho que informar o cpf e o nome dessa pessoa.
    public Pessoa (String cpf, String nome) {
      this.cpf = cpf;
      this.nome = nome;
      
    }
}
