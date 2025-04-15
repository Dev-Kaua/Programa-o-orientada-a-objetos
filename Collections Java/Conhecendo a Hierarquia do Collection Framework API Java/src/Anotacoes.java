
import java.util.*;

/*
 * Anotacoes.java
 * Aula: Conhecendo a Hierarquia do Collection Framework API Java
 * 
 * Uma Collection (coleção) é uma estrutura de dados que agrupa múltiplos elementos em uma única unidade.
 * Esses elementos devem ser objetos (não aceita tipos primitivos diretamente).
 * 
 * Existem 4 grandes interfaces principais no Java Collections Framework:
 * - List    ➝ Lista ordenada, aceita repetição
 * - Set     ➝ Conjunto, não aceita repetição
 * - Queue   ➝ Fila, estrutura FIFO (First-In, First-Out)
 * - Map     ➝ Mapa de chave → valor (não é filha de Collection, mas faz parte do framework)
 * 
 * Todas as interfaces/classes estão no pacote java.util.
 */
public class Anotacoes {

    public static void main(String[] args) {

        // * List: aceita repetição, mantém a ordem
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("João");
        listaNomes.add("Maria");
        listaNomes.add("João"); // repetido
        System.out.println("List: " + listaNomes);

        // * Set: não permite elementos repetidos
        Set<String> conjuntoNomes = new HashSet<>();
        conjuntoNomes.add("João");
        conjuntoNomes.add("Maria");
        conjuntoNomes.add("João"); // ignorado
        System.out.println("Set: " + conjuntoNomes);

        // * Queue: estrutura de fila (FIFO)
        Queue<String> fila = new LinkedList<>();
        fila.add("Pessoa 1");
        fila.add("Pessoa 2");
        fila.add("Pessoa 3");
        System.out.println("Queue (antes do atendimento): " + fila);
        System.out.println("Atendido: " + fila.poll()); // remove o primeiro da fila
        System.out.println("Queue (após atendimento): " + fila);

        // * Map: estrutura chave → valor
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Java");
        mapa.put(2, "Python");
        mapa.put(3, "C++");
        System.out.println("Map: " + mapa);
        System.out.println("Valor associado à chave 2: " + mapa.get(2));

        // TODO: Estudar mais sobre implementações específicas como LinkedList, TreeSet e TreeMap
        // ? Diferença entre HashMap e TreeMap em performance e ordenação?
    }
}
