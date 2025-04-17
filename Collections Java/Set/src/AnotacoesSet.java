// anotacoes.java
// Resumo sobre a interface Set do Java Collections Framework

/*
 * Interface Set
 * --------------
 * - Representa um conjunto que não permite elementos duplicados.
 * - Baseada no conceito matemático de conjunto.
 * - Não garante ordem específica (exceto em implementações específicas).
 * - Não permite acesso por índice (acesso aleatório).
 * - Usado geralmente com iteradores ou loops foreach.
 *
 * Implementações principais:
 *
 * 1. HashSet
 * ----------
 * - Baseado em uma tabela hash (HashMap).
 * - Alta performance para operações básicas (add, remove, contains).
 * - Não garante ordem dos elementos.
 * - Ideal quando não é necessário manter a ordem de inserção ou ordenação.
 *
 * 2. LinkedHashSet
 * ----------------
 * - Estende o HashSet, mas mantém a ordem de inserção.
 * - Usa tabela hash + lista duplamente ligada.
 * - Útil quando a ordem de inserção é importante.
 *
 * 3. TreeSet
 * ----------
 * - Implementa SortedSet.
 * - Baseado em árvore binária balanceada (Red-Black Tree).
 * - Mantém os elementos ordenados de forma natural ou por um Comparator.
 * - Inserção e busca mais lentas que HashSet, mas permite ordenação automática.
 */

// Exemplo de uso básico com HashSet
import java.util.*;

public class AnotacoesSet {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maçã"); // Duplicado, será ignorado

        System.out.println("Frutas no conjunto:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // LinkedHashSet mantém a ordem de inserção
        Set<String> frutasOrdenadas = new LinkedHashSet<>();
        frutasOrdenadas.add("Maçã");
        frutasOrdenadas.add("Banana");
        frutasOrdenadas.add("Laranja");

        System.out.println("\nFrutas com LinkedHashSet (ordem de inserção):");
        System.out.println(frutasOrdenadas);

        // TreeSet mantém os elementos ordenados
        Set<String> frutasOrdenadasAlfabeticamente = new TreeSet<>(frutasOrdenadas);

        System.out.println("\nFrutas com TreeSet (ordem alfabética):");
        System.out.println(frutasOrdenadasAlfabeticamente);
    }
}
