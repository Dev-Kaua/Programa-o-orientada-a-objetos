// ! Interfaces Funcionais em Java

// Uma interface funcional é uma interface que contém apenas um método abstrato (SAM - Single Abstract Method).
// Elas podem ser implementadas usando expressões lambda ou classes anônimas.
// As interfaces funcionais são amplamente usadas no contexto de Streams e outras APIs que exigem comportamento funcional.

// ! Importante: As interfaces funcionais são frequentemente usadas em Streams e outras operações de coleção.

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnotacoesInterfacesFuncionais {

  // * 1. Interface Consumer<T> - Representa uma operação que aceita um argumento e não retorna nada.
  // Usada para realizar ações ou efeitos colaterais nos elementos do Stream.
    public static void consumerExample() {
        // TODO Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // TODO Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // TODO Usar o Consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);
    }

  // * 2. Interface Supplier<T> - Representa uma operação que não aceita argumentos e retorna um valor.
  // Usada para fornecer novos objetos ou valores.
  public static void supplierExample() {
        // TODO Usar o Supplier com expressão lambda para fornecer uma saudação
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // TODO Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .collect(Collectors.toList());

        // TODO Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }

  // * 3. Interface Function<T, R> - Representa uma função que aceita um argumento do tipo T e retorna um valor do tipo R.
  // Usada para transformar ou mapear os elementos do Stream.
  public static void functionExample() {
        // TODO Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // TODO Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // TODO Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());

        // TODO Imprimir a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
    }

  // * 4. Interface Predicate<T> - Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
  // Usada para filtrar os elementos do Stream com base em uma condição.
  public static void predicateExample() {
        // TODO Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // TODO Usar o Predicate com expressão lambda para filtrar números pares
        Predicate<Integer> isPar = numero -> numero % 2 == 0;

        // TODO Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        List<Integer> numerosPares = numeros.stream()
                .filter(isPar)
                .collect(Collectors.toList());

        // TODO Imprimir a lista de números pares
        numerosPares.forEach(System.out::println);
    }

  // * 5. Interface BinaryOperator<T> - Representa uma operação que combina dois argumentos do tipo T e retorna um valor do mesmo tipo T.
  // Usada para realizar operações de redução em pares de elementos (exemplo: soma de números).
  public static void binaryOperatorExample() {
        // TODO Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // TODO Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // TODO Usar o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0, somar);

        // TODO Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + resultado);
    }

  // * 6. Interface Runnable - Representa uma operação sem parâmetros e sem valor de retorno.
  // É comumente usada para tarefas assíncronas ou threads.
  public static void runnableExample() {
        // TODO Criar um Runnable com expressão lambda para imprimir uma mensagem
        Runnable tarefa = () -> System.out.println("Tarefa executada!");

        // TODO Executar a tarefa
        new Thread(tarefa).start();
    }

    public static void main(String[] args) {
        // Chamando todos os exemplos no método main
        consumerExample();
        supplierExample();
        functionExample();
        predicateExample();
        binaryOperatorExample();
        runnableExample();
    }
}

// * Conclusão sobre Interfaces Funcionais:
// - Interfaces funcionais são essenciais para programação funcional em Java.
// - Elas podem ser representadas por expressões lambda e classes anônimas, sendo amplamente usadas em Streams, coleções e outros padrões funcionais.
// - Ao utilizar interfaces funcionais, o código se torna mais conciso e expressivo.