// * ANOTAÇÕES SOBRE STREAM API EM JAVA
// -------------------------------------------

// TODO: Conceito Geral
// A Stream API foi introduzida no Java 8 e permite processar coleções de forma funcional e declarativa.
// Isso significa que você foca no "o que" quer fazer com os dados, e não "como" fazer (como seria com loops tradicionais).

// ! Vantagens:
// - Código mais legível
// - Facilita paralelização
// - Reduz erros manuais em loops
// - Menos código boilerplate

// ? Exemplo tradicional (imperativo):
/*
double valorTotal = 0d;
for (Item item : itemList) {
    valorTotal += item.getPreco() * item.getQuant();
}
*/

// * Exemplo com Stream API (declarativo):
// itemList.stream().mapToDouble(item -> item.getPreco() * item.getQuant()).sum();


// TODO: Operações em Stream
// As operações em Stream se dividem em duas categorias:

// * 1. Operações Intermediárias (retornam uma nova Stream):
// - filter(Predicate<T>): filtra elementos
// - map(Function<T, R>): transforma os elementos
// - sorted(): ordena os elementos
// - distinct(): remove duplicados
// - limit(long): limita o número de elementos
// - skip(long): pula os primeiros n elementos

// ? Exemplo:
// List<String> nomes = lista.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList());

// * 2. Operações Terminais (produzem um resultado ou efeito colateral):
// - forEach(): executa uma ação para cada elemento
// - collect(): coleta os elementos para uma coleção (List, Set, Map...)
// - count(): retorna a quantidade de elementos
// - anyMatch(), allMatch(), noneMatch(): verificações
// - min(), max(): encontra o menor ou maior elemento
// - reduce(): reduz os elementos para um único valor

// ? Exemplo:
// long quantidade = lista.stream().count();


// TODO: Expressões Lambda
// Lambda é uma função anônima — usada principalmente para implementar métodos de interfaces funcionais

// * Sintaxe:
// (parametros) -> {corpo}

// ? Exemplo:
// Comparator<Pessoa> comparador = (p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura());


// TODO: Method Reference
// Uma forma simplificada de usar métodos existentes com lambdas

// * Sintaxe:
// Classe::metodo ou objeto::metodo

// ? Exemplo:
// pessoas.sort(Comparator.comparingDouble(Pessoa::getAltura));


// TODO: Interfaces Funcionais
// São interfaces com apenas um método abstrato (SAM - Single Abstract Method)
// Ex: Predicate<T>, Function<T,R>, Consumer<T>, Supplier<T>, Comparator<T>

// * Usadas como base para lambdas e streams


// ! Dica final:
// - Sempre revise se o uso da Stream está trazendo mais clareza
// - Evite misturar lógica complexa demais dentro das lambdas
// - Streams não alteram a coleção original (imutabilidade)

// -------------------------------------------
// Fim das anotações sobre Stream API em Java
