package OperacoesBasicas;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  //atributo
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, int telefone){
    agendaContatoMap.put(nome, telefone);
    //O metodo put serve tanto para adicionar quanto também para atualizar
  }

  public void removerContato(String nome){
    //boa prática de verificar se o contato não está vazio antes de remove-lo
    if(!agendaContatoMap.isEmpty()){
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos(){
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if(!agendaContatoMap.isEmpty()){
      agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
      AgendaContatos agendaContatos = new AgendaContatos();

      agendaContatos.adicionarContato("Camila", 173849);
      agendaContatos.adicionarContato("Kauana", 303940);
      agendaContatos.adicionarContato("Kauana", 263748);
      agendaContatos.adicionarContato("Andreza", 032403);
      agendaContatos.adicionarContato("Walfred", 303940); //mesmo numero de uma das kauanas
      agendaContatos.adicionarContato("Kauana", 993842);
      //no Set, permaneceria a primeira Kauana, mas aqui por causa do put que atualiza
      //a cada nova kauana que colocamos no codigo, a ultima kauana sempre será a que 
      //será salva e mostrada no sistema. Se adicionarmos outra Kauana ele vai "Atualizar"
      //Adicionar a nova kauana e remover a antiga.

      agendaContatos.exibirContatos();

      agendaContatos.removerContato("Andreza");
      agendaContatos.exibirContatos();

      System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila"));
  }
}
