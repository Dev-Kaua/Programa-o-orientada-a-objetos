package MiniProjeto;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuncoesComList {

    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Beatriz", "Amanda");

        //! Consumer: recebe um valor e NÃO retorna nada
        Consumer<String> imprimirNome = nome -> System.out.println("Nome: " + nome);
        nomes.forEach(imprimirNome);

        System.out.println("\n--- Apenas nomes que começam com A ---");

        //! Predicate: recebe um valor e retorna boolean
        Predicate<String> começaComA = nome -> nome.startsWith("A");
        List<String> nomesComA = nomes.stream()
                                      .filter(começaComA)
                                      .collect(Collectors.toList());

        nomesComA.forEach(nome -> System.out.println(nome));

        System.out.println("\n--- Nomes em maiúsculas ---");

        //! Function: recebe um valor e retorna outro
        Function<String, String> paraMaiuscula = nome -> nome.toUpperCase();
        List<String> nomesMaiusculos = nomes.stream()
                                            .map(paraMaiuscula)
                                            .collect(Collectors.toList());

        nomesMaiusculos.forEach(System.out::println);

        System.out.println("\n--- Fornecendo um valor fixo (Supplier) ---");

        //! Supplier: não recebe nada e retorna um valor
        java.util.function.Supplier<String> gerarMensagem = () -> "Isso foi gerado por um Supplier!";
        System.out.println(gerarMensagem.get());
    }
}
