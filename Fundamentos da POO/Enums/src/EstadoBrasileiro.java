public enum EstadoBrasileiro {
  SAO_PAULO ("SP", "São Paulo",11),
  RIO_JANEIRO ("RJ","Rio de Janeiro",12),
  PARANA("PR","Paraná",13),
  MINAS_GERAIS("MG","Minas Gerais",14),
  CEARA("CE","Ceará",15);

  private String nome;
  private String sigla;
  private int ibge;

  private EstadoBrasileiro(String sigla, String nome, int ibge) {
    this.sigla = sigla;
    this.nome = nome;
    this.ibge = ibge;
  }

    public int getIbge() {
        return ibge;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo() {
      return nome.toUpperCase(); //método toUpperCase pega a variavel string e deixa ela toda em maiúsculo
    }

}
