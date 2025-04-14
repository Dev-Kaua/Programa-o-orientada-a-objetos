/*
! INTERFACES EM JAVA

* Interface é um tipo especial que define um CONTRATO.
* Classes que "assinam" esse contrato são obrigadas a implementar seus métodos.

? Sintaxe:
interface NomeDaInterface {
    tipo metodo();
}

class MinhaClasse implements NomeDaInterface {
    @Override
    public tipo metodo() {
        // implementação
    } 
}

!==================================================
! DIFERENÇA ENTRE INTERFACE E CLASSE ABSTRATA:

* INTERFACE:
  * Todos os métodos são públicos e abstratos por padrão
  * Todos os atributos são públicos, estáticos e finais (constantes)
  * NÃO pode ter construtores
  * Permite herança múltipla (uma classe pode implementar várias interfaces)
  * Pode ter métodos `default` e `static` COM corpo (a partir do Java 8)

* CLASSE ABSTRATA:
  * Pode ter atributos e métodos normais (com corpo) ou abstratos (sem corpo)
  * Pode ter construtores
  * NÃO permite herança múltipla
  * Pode conter lógica comum a várias subclasses

!==================================================
! QUANDO USAR CADA UM?

✅ *Use INTERFACE quando:*
  * Quer só definir um contrato (sem lógica)
  * Classes sem relação direta precisam compartilhar comportamento
  * Precisa de herança múltipla
  * Quer flexibilidade e baixo acoplamento

✅ *Use CLASSE ABSTRATA quando:*
  * As classes têm uma hierarquia mais clara
  * Há atributos ou métodos comuns que podem ser reaproveitados
  * Deseja fornecer implementação parcial

? Exemplo real:
interface Imprimivel {
    void imprimir();
}

abstract class Documento {
    String titulo;

    public void mostrarTitulo() {
        System.out.println(titulo);
    }

    public abstract void salvar();
}

!==================================================
! O QUE VEM "IMPLÍCITO" EM UMA INTERFACE?

* Todo método:
  → É automaticamente `public` e `abstract` (mesmo sem escrever)

* Todo atributo:
  → É automaticamente `public static final` (ou seja, uma constante)

? Exemplo:
interface Exemplo {
    int IDADE = 18; // equivale a public static final int IDADE = 18;
    void executar(); // equivale a public abstract void executar();
}

!==================================================
! PODEMOS INSTANCIAR UMA INTERFACE?

❌ *NÃO!* Interfaces não têm corpo (lógica), então não podem ser instanciadas diretamente.

✔️ *PODEMOS usar interfaces como tipo de referência:*
Exemplo:
    Animal a = new Cachorro();
    // Onde 'Animal' é uma interface e 'Cachorro' implementa ela.

✔️ *Isso permite polimorfismo:*
Você usa o tipo genérico (interface), mas executa a lógica da classe concreta.

!==================================================
! EXEMPLO SIMPLES:

interface Animal {
    void emitirSom();
}

class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}

class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Gato(); // usando a interface como tipo
        meuAnimal.emitirSom(); // saída: Miau!
    }
}

!==================================================
! MÚLTIPLAS INTERFACES:

* Uma classe pode implementar quantas interfaces quiser:
class Robo implements Andador, Comunicador {
    // precisa implementar os métodos das duas interfaces
}

!==================================================
! MÉTODOS DEFAULT (Java 8+)

interface Calculadora {
    default void mostrarVersao() {
        System.out.println("Versão 1.0");
    }
}
*==================================================
*OBS: se você declarar um método como static, não importa que ele seja private, o valor 
*   dele será compartilhado com todas as instancias que você criar daquele valor.
*Sem o static não, você vai criar o objeto(instancia) e aquele objeto especifico terá
* características próprias.
*/
