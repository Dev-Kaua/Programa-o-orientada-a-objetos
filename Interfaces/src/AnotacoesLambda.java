/*
! EXPRESSÕES LAMBDA EM JAVA

* Uma expressão lambda é uma forma ENCURTADA de escrever métodos anônimos (sem nome).
* Usamos lambdas para passar comportamento como se fosse um "valor".
* É muito comum em programação funcional e com APIs como Stream e List.

? Estrutura básica:
(parâmetros) -> { corpo }

? Exemplo simples:
() -> System.out.println("Olá!");

(x) -> x * 2;

(a, b) -> {
    int soma = a + b;
    return soma;
}

!==================================================
! ONDE USAMOS LAMBDA?

* Só pode ser usada quando a gente trabalha com INTERFACES FUNCIONAIS!
* Por isso que Java criou várias interfaces funcionais no pacote java.util.function
→ Consumer, Predicate, Function, Supplier...

? Exemplo:
Consumer<String> imprimir = nome -> System.out.println(nome.toUpperCase());

* Isso substitui a criação de uma classe inteira só pra isso!

? nomes.forEach(nome -> System.out.println(nome));
*/
