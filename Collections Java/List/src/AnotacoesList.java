/*
 * 📚 ANOTAÇÕES – JAVA COLLECTIONS: LIST INTERFACE
 * -------------------------------------------------------------
 * A interface List faz parte do framework de Collections do Java.
 * É uma coleção ordenada que permite elementos duplicados.
 * Cada elemento tem uma posição (índice), começando do 0.
 * Classes mais comuns que implementam List:
 * - ArrayList
 * - LinkedList
 * - Vector
 * -------------------------------------------------------------
 */

 import java.util.*;

 public class AnotacoesList {
 
     public static void main(String[] args) {
 
         // 🔹 Criando uma lista com a interface List (mais flexível)
         List<String> lista = new ArrayList<>();
 
         // ✅ Adicionando elementos
         lista.add("Java");
         lista.add("Python");
         lista.add("C++");
         lista.add("Java"); // Permitido duplicados
 
         // ✅ Acessando elementos por índice
         String linguagem = lista.get(0); // Java
 
         // ✅ Removendo por índice ou valor
         lista.remove(1); // remove "Python"
         lista.remove("Java"); // remove a primeira ocorrência de "Java"
 
         // ✅ Substituindo um elemento
         lista.set(0, "JavaScript");
 
         // ✅ Tamanho da lista
         int tamanho = lista.size();
 
         // ✅ Verifica se contém um elemento
         boolean contem = lista.contains("C++");
 
         // ✅ Iterando com for-each
         for (String item : lista) {
             System.out.println(item);
         }
 
         // ✅ Sublista
         List<String> subLista = lista.subList(0, 1); // índice 0 até (1 - 1)
 
         // ✅ Ordenando (Collections.sort)
         Collections.sort(lista);
 
         // ✅ Embaralhar e inverter
         Collections.shuffle(lista);
         Collections.reverse(lista);
     }
 }
 
 /*
  * 🔸 ARRAYLIST
  * - Baseado em array redimensionável.
  * - Rápido para leitura com índice (get).
  * - Mais lento para inserções/remoções no meio.
  * - NÃO é sincronizado (não é thread-safe).
  */
 
 ArrayList<String> arrayList = new ArrayList<>();
 
 /*
  * 🔸 LINKEDLIST
  * - Baseado em lista duplamente ligada.
  * - Rápido para inserção/remoção no início/fim.
  * - Acesso por índice é mais lento (precisa percorrer).
  * - Também implementa as interfaces Queue e Deque.
  */
 
 LinkedList<String> linkedList = new LinkedList<>();
 
 /*
  * 🔸 VECTOR
  * - Semelhante ao ArrayList, mas é sincronizado.
  * - Mais seguro em ambientes multithread.
  * - Menos eficiente em desempenho geral.
  * - Uso em novos projetos é desencorajado, prefira ArrayList.
  */
 
 Vector<String> vector = new Vector<>();
 
 /*
  * 📌 DICAS:
  * - Prefira programar com a interface List ao invés das classes concretas.
  * - Escolha a implementação conforme o uso: acesso por índice (ArrayList) ou inserção rápida (LinkedList).
  * - Use Collections.sort(lista) para ordenar, e .shuffle() para embaralhar.
  * - O método binarySearch() só funciona em listas ordenadas!
  *
  * 📎 Referência oficial:
  * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/List.html
  */
 