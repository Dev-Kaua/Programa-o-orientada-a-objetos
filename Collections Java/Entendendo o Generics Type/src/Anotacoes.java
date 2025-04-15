/*
 * Anotacoes.java
 * Aula: Entendendo o Generics Type
 * 
 * Generics permitem criar classes, interfaces e métodos que operam sobre
 * *tipos parametrizados*. 
 * Isso significa que você pode escrever código que funcione com diferentes tipos de forma segura.
 * 
 * Exemplo de classe sem generics:
 * 
 * public class Box {
 *     private Object object;
 *     public void set(Object object) { this.object = object; }
 *     public Object get() { return object; }
 * }
 * 
 * Problema: precisamos fazer cast (conversão) manual, o que pode causar erro de execução.
 * 
 * Solução: classe com generics
 */

class Box<T> {
    private T t;

    public void set(T t) { this.t = t; }

    public T get() { return t; }
}

public class Anotacoes {
    public static void main(String[] args) {
        // * Exemplo de uso da Box com String
        Box<String> caixaDeTexto = new Box<>();
        caixaDeTexto.set("Olá, mundo!");
        String texto = caixaDeTexto.get(); // não precisa de cast
        System.out.println("Texto: " + texto);

        // * Exemplo de uso da Box com Integer
        Box<Integer> caixaDeNumero = new Box<>();
        caixaDeNumero.set(42);
        Integer numero = caixaDeNumero.get(); // não precisa de cast
        System.out.println("Número: " + numero);

        // ! Se tentar colocar outro tipo, o compilador já acusa erro
        // caixaDeTexto.set(123); // Erro de compilação

        // ? O símbolo <> (diamond operator) foi introduzido no Java 7
        // Ele permite inferência de tipo e torna o código mais limpo
    }
}

/**
 * Parâmetros de tipo comuns em Generics:
 * - T ➝ Type (Tipo)
 * - E ➝ Element (Elemento), muito usado em collections
 * - K ➝ Key (Chave)
 * - V ➝ Value (Valor)
 * - N ➝ Number (Número)
 * - S, U, etc ➝ Usado para múltiplos tipos genéricos
 * 
 * Vantagens dos Generics em Collections:
 * 
 * // * Segurança de tipo: impede que tipos errados sejam adicionados
 * // * Código mais legível: sabemos o tipo da coleção só de olhar
 * // * Erros detectados em tempo de compilação
 * // * Reutilização de código para diferentes tipos
 * // * Melhor performance: sem casts desnecessários
 */
