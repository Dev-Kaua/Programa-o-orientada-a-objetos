package PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos:

    private List<Livro> livroList;

    public CatalogoLivros() {
      this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
              livrosPorAutor.add(l);
            }
          }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.gettitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionando livros
        catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);
        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);

        // Pesquisar por autor
        System.out.println("📚 Livros de George Orwell:");
        for (Livro livro : catalogo.pesquisarPorAutor("George Orwell")) {
            System.out.println(" - " + livro);
        }

        // Pesquisar por intervalo de anos
        System.out.println("\n📅 Livros publicados entre 1940 e 1960:");
        for (Livro livro : catalogo.pesquisaPorIntervaloAnos(1940, 1960)) {
            System.out.println(" - " + livro);
        }

        // Pesquisar por título
        String tituloBusca = "Dom Casmurro";
        Livro resultadoTitulo = catalogo.pesquisarPorTitulo(tituloBusca);
        System.out.println("\n🔍 Resultado da busca por título \"" + tituloBusca + "\":");
        if (resultadoTitulo != null) {
            System.out.println(" - " + resultadoTitulo);
        } else {
            System.out.println(" - Livro não encontrado.");
        }
    }

}
