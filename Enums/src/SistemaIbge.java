public class SistemaIbge {
  public static void main(String[] args) {
      for(EstadoBrasileiro e: EstadoBrasileiro.values()){
        System.out.println(e.getSigla() + " - " + e.getNome());
      }

      EstadoBrasileiro pr = EstadoBrasileiro.PARANA;

      System.out.println(pr.getNome());
      System.out.println(pr.getSigla());
      System.out.println(pr.getNomeMaiusculo());
      System.out.println(pr.getIbge());
  }
}
