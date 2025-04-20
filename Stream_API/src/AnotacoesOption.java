// ==================================================
// * Optional (java.util.Optional)
// ==================================================

// ? Objetivo:
// A classe Optional foi introduzida no Java 8 para lidar de forma segura e elegante com valores que podem ser nulos.
// Evita o uso de null diretamente e previne NullPointerException (NPE).

// ==================================================
// * Métodos principais
// ==================================================

// ! Optional.of(value)
// Cria um Optional com o valor fornecido. Se for null, lança NullPointerException.
Optional<String> opt1 = Optional.of("Hello");
System.out.println(opt1.get());

// ! Optional.ofNullable(value)
// Cria um Optional com o valor, mas permite null. Se for null, o Optional será vazio.
String valorPossivelmenteNulo = null;
Optional<String> opt2 = Optional.ofNullable(valorPossivelmenteNulo);
System.out.println(opt2.isPresent()); // false

// ! Optional.empty()
// Retorna um Optional vazio (sem valor).
Optional<String> opt3 = Optional.empty();
System.out.println(opt3.isPresent()); // false

// ! isPresent()
// Retorna true se o Optional contém um valor não nulo.
Optional<String> opt4 = Optional.of("Hello");
System.out.println(opt4.isPresent()); // true

// ! isEmpty() (Java 11+)
// Retorna true se o Optional NÃO contém um valor.
Optional<String> opt5 = Optional.ofNullable(null);
System.out.println(opt5.isEmpty()); // true

// ! get()
// Retorna o valor contido no Optional.
// Lança NoSuchElementException se o valor estiver ausente.
Optional<String> opt6 = Optional.of("Hello");
System.out.println(opt6.get()); // Hello

// ! orElse(defaultValue)
// Retorna o valor do Optional ou um valor padrão se estiver vazio.
Optional<String> opt7 = Optional.ofNullable(null);
String resultado1 = opt7.orElse("Valor padrão");
System.out.println(resultado1); // Valor padrão

// ! orElseGet(Supplier)
// Retorna o valor do Optional ou gera um valor usando um Supplier.
Optional<String> opt8 = Optional.ofNullable(null);
String resultado2 = opt8.orElseGet(() -> "Gerado pelo Supplier");
System.out.println(resultado2);

// ! orElseThrow(Supplier<Exceção>)
// Retorna o valor ou lança uma exceção definida, se o valor estiver ausente.
Optional<String> opt9 = Optional.ofNullable(null);
String resultado3 = opt9.orElseThrow(() -> new RuntimeException("Valor ausente"));

// ! ifPresent(Consumer)
// Executa uma ação se o valor estiver presente.
Optional<String> opt10 = Optional.of("Hello");
opt10.ifPresent(valor -> System.out.println("Valor presente: " + valor));

// ==================================================
// * Dica geral:
// Nunca use .get() sem antes verificar se o valor está presente com isPresent() ou usar métodos como orElse.
// O Optional incentiva práticas mais seguras de programação defensiva.
// ==================================================
