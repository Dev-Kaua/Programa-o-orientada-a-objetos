// 📚 RESUMO SOBRE A INTERFACE MAP E SUAS IMPLEMENTAÇÕES

import java.util.*;

public class Anotacoes {

    public static void main(String[] args) {

        // * INTERFACE MAP
        // ? Usada para armazenar dados em pares chave -> valor
        // ! Cada chave deve ser única
        // TODO: Aprender bem as operações básicas e diferenças entre implementações

        // * OPERACOES BÁSICAS:
        // put(k, v)              -> adiciona ou atualiza um par chave/valor
        // get(k)                 -> retorna o valor associado à chave
        // remove(k)              -> remove o par com a chave indicada
        // containsKey(k)         -> verifica se a chave existe
        // containsValue(v)       -> verifica se o valor existe
        // size()                 -> quantidade de pares no Map
        // isEmpty()              -> verifica se o Map está vazio
        // keySet()               -> retorna um Set com todas as chaves
        // values()               -> retorna uma Collection com todos os valores
        // entrySet()             -> retorna um Set com os pares chave/valor (Map.Entry)

        // * IMPLEMENTAÇÕES MAIS USADAS:

        // ? 1. HashMap
        // - Não mantém ordem dos elementos
        // - Permite uma chave e valores nulos
        // - Rápido para buscas, inserções e remoções
        Map<String, String> hashMap = new HashMap<>();

        // ? 2. LinkedHashMap
        // - Mantém a ordem de inserção
        // - Permite uma chave e valores nulos
        // - Ideal quando a ordem importa
        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        // ? 3. TreeMap
        // - Mantém as chaves ordenadas (ordem natural ou personalizada via Comparator)
        // - Não permite chaves nulas
        // - Útil quando a ordem das chaves é importante
        Map<String, String> treeMap = new TreeMap<>();

        // ? 4. Hashtable (obsoleta em muitos casos)
        // - É sincronizada (thread-safe)
        // - Não permite chaves nem valores nulos
        // - Substituída por ConcurrentHashMap em cenários com múltiplas threads
        Map<String, String> hashtable = new Hashtable<>();

        // * COMO PERCORRER UM MAP (usando entrySet)
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("🔑 Chave: " + entry.getKey() + " | 📦 Valor: " + entry.getValue());
        }

        // * EXEMPLOS DE USO DO MAP:    
        // - Agenda de contatos: nome -> telefone
        // - Dicionário: palavra -> definição
        // - Estoque: código -> produto
        // - Livraria: link -> livro
    }
}
