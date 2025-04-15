/*
 * 📚 Aula: Comparable X Comparator
 *
 * ✅ Comparable:
 * - Interface que define uma única sequência de ordenação natural.
 * - Método: compareTo(T o)
 * - Está no pacote: java.lang
 * - A classe que implementa é modificada diretamente.
 * - Exemplo: ordenar por título, nome, id, etc.
 * - Usado com: Collections.sort(lista)
 *
 * ✅ Comparator:
 * - Interface que define múltiplas formas de ordenação.
 * - Método: compare(T o1, T o2)
 * - Está no pacote: java.util
 * - A classe original NÃO é modificada.
 * - Pode criar vários comparadores personalizados.
 * - Usado com: Collections.sort(lista, comparator)
 *
 * ✅ Collections:
 * - Classe utilitária com métodos para manipulação de coleções.
 * - sort(List<T>) → ordena em ordem natural.
 * - sort(List<T>, Comparator<? super T>) → ordena com regra customizada.
 * - reverseOrder() → inverte a ordem da ordenação.
 */
import java.util.*;

class Livro implements Comparable<Livro> {
 
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // Ordenação natural: por título
    @Override
    public int compareTo(Livro outroLivro) {
        return this.titulo.compareTo(outroLivro.titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " - " + ano;
    }
}

// Comparador por autor
class CompararAutor implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}

// Comparador por ano
class CompararAno implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
    }
}

// Comparador por ano, depois autor, depois título
class CompararAnoAutorTitulo implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        int comparacaoAno = Integer.compare(l1.getAno(), l2.getAno());
        if (comparacaoAno != 0) {
            return comparacaoAno;
        }

        int comparacaoAutor = l1.getAutor().compareTo(l2.getAutor());
        if (comparacaoAutor != 0) {
            return comparacaoAutor;
        }

        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}

public class Anotacoes {

    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Entendendo Algoritmos", "Aditya Bhargava", 2017));
        livros.add(new Livro("Java - Guia do Programador", "Peter Jandl Junior", 2021));
        livros.add(new Livro("Kotlin em Ação", "Dmitry Jemerov", 2019));

        // 🔹 Ordenação natural (por título)
        Collections.sort(livros);
        System.out.println("\n📘 Ordenado por título:");
        livros.forEach(System.out::println);

        // 🔹 Ordenação por autor
        Collections.sort(livros, new CompararAutor());
        System.out.println("\n📘 Ordenado por autor:");
        livros.forEach(System.out::println);

        // 🔹 Ordenação por ano
        Collections.sort(livros, new CompararAno());
        System.out.println("\n📘 Ordenado por ano:");
        livros.forEach(System.out::println);

        // 🔹 Ordenação por ano, autor, depois título
        Collections.sort(livros, new CompararAnoAutorTitulo());
        System.out.println("\n📘 Ordenado por ano, autor e título:");
        livros.forEach(System.out::println); 
    }
}