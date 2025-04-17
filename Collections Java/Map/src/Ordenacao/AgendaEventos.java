package Ordenacao;
import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
  //atributo
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao){
    Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, evento);
  }

  public void exibirAgenda(){
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println("Agenda de eventos:");
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }

  public void obterProximoEvento(){
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
      if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
        proximaData = entry.getKey();
        proximoEvento = entry.getValue();
        System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
        break;
      }
    }
    
    if (proximoEvento == null) {
      System.out.println("Não há eventos futuros.");
    }
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();

    agendaEventos.adicionarEvento(LocalDate.of(2025, 4, 20), "Festival de Música", "Banda XYZ");
    agendaEventos.adicionarEvento(LocalDate.of(2025, 4, 25), "Feira de Tecnologia", "TechShow");
    agendaEventos.adicionarEvento(LocalDate.of(2025, 3, 10), "Palestra sobre Java", "Rodolfo DevClub");

    agendaEventos.exibirAgenda();
    agendaEventos.obterProximoEvento();
  }
}

