/*
! INTERFACES FUNCIONAIS EM JAVA

* Interface funcional é uma interface que possui APENAS UM método abstrato.
* Ela pode ter métodos `default` e `static` com corpo, mas só pode ter UM método abstrato.

? EXEMPLO SIMPLES:
@FunctionalInterface
interface Operacao {
    int executar(int a, int b);
}

? Pode ser usada assim (com Lambda):
Operacao soma = (a, b) -> a + b;
System.out.println(soma.executar(5, 3)); // saída: 8

!==================================================
! @FunctionalInterface

* Essa anotação é OPCIONAL, mas recomendada.
* Ela faz o compilador garantir que só há UM método abstrato na interface.
* Se você adicionar outro, ele dá erro!

? Exemplo:
@FunctionalInterface
interface Saudacao {
    void dizerOi();
    
    // void outraCoisa(); ❌ Isso quebraria a interface funcional!
}

!==================================================
! DIFERENÇA ENTRE INTERFACE NORMAL E FUNCIONAL:

* Interface comum: pode ter vários métodos abstratos
* Interface funcional: só um método abstrato (permite uso com lambda)

? Interfaces funcionais permitem sintaxe compacta:
Em vez disso:
class SaudacaoImpl implements Saudacao {
    public void dizerOi() {
        System.out.println("Olá!");
    }
}

Você faz:
Saudacao oi = () -> System.out.println("Olá!");

!==================================================
! CONEXÃO COM JAVA UTIL

* A JDK já tem várias interfaces funcionais prontas no pacote:
→ java.util.function

* Exemplos:
- `Consumer<T>` → recebe um valor e não retorna nada
- `Function<T, R>` → recebe um valor e retorna outro
- `Predicate<T>` → recebe um valor e retorna boolean
- `Supplier<T>` → não recebe nada e retorna algo

? Exemplo com List e Consumer:
import java.util.List;
import java.util.function.Consumer;

List<String> nomes = List.of("Ana", "Beto", "Carlos");

Consumer<String> imprimirMaiusculo = nome -> System.out.println(nome.toUpperCase());
nomes.forEach(imprimirMaiusculo);

? ou até direto no forEach:
nomes.forEach(nome -> System.out.println(nome.toUpperCase()));

!==================================================
! DICA: use interfaces funcionais quando:

* Quer passar comportamento como argumento (ex: map, filter, forEach)
* Quer usar lambda expressions
* Quer deixar seu código mais limpo, funcional e expressivo

!==================================================
! EXTRA - MÉTODOS DEFAULT EM INTERFACE FUNCIONAL:

@FunctionalInterface
interface Saudacao {
    void dizerOi();

    default void outraCoisa() {
        System.out.println("Isso pode!");
    }
}

* Métodos default e static NÃO quebram a interface funcional
* Só não pode ter dois métodos abstratos!
*/
