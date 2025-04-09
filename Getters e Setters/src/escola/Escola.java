package escola;

public class Escola {
  public static void main(String[] args){
    Aluno felipe = new Aluno();

    felipe.setIdade(17);
    felipe.setNome("Felipe Jose");


    System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
  }
}
