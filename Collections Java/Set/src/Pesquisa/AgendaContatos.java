package Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  //atributo
  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero){
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContatos(){
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> contatosPorNome = new HashSet<>();
    for(Contato c : contatoSet){
      if(c.getNome().startsWith(nome)){
        contatosPorNome.add(c);
      }
    }
    return contatosPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    for(Contato c : contatoSet) {
      if(c.getNome().equalsIgnoreCase(nome)){
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
      AgendaContatos agendaContatos = new AgendaContatos();

      agendaContatos.exibirContatos();

      agendaContatos.adicionarContato("Darlei", 993029);
      agendaContatos.adicionarContato("Darlei", 993824);
      agendaContatos.adicionarContato("Falso darlei", 993824); //numero igual ao anterior, não vai printar
      agendaContatos.adicionarContato("Pedro balistieri", 992738);
      agendaContatos.adicionarContato("Peter barns", 982156);

      agendaContatos.exibirContatos();

      System.out.println(agendaContatos.pesquisarPorNome("Darlei"));
      System.out.println(agendaContatos.pesquisarPorNome("Pedro")); //pesquisando só pelo primeiro nome
      System.out.println(agendaContatos.pesquisarPorNome("Falso darlei"));//esse aqui, se o programa estiver certo, nao pode aparecer

  }
}
