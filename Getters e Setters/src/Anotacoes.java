/*
 !Os métodos "Getters" e "Setters" são utilizados para buscar valores de atributos ou
 !definir novos valores de atributos de instâncias de classes.
 !  O método Getter retorna o valor do atributo especificado.
 !  O método Setter define outro novo valor para o atributo especificado.
 !Seguindo a convenção Java Beans:
 ?    -Os atributos precisam ter o modificador de acesso private.Ex:private String nome;
 ?    -Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos
 ?    getX e setX, EX: getNome() e setNome(String novoNome);
 ?    -O método get é responsável por obter o valor atual do atributo, logo ele precisa
 ?    ser public retornar um tipo correspondente ao valor, EX: public String getNome(){};
 ?    -O método set é responsável por definir ou modificador o valor de um atributo em
 ?    um objeto, logo ele também precisa ser public, receber um parâmetro do mesmo tipo 
 ?    da variável mas não retorna nenhum valor void. EX:public void setNome(String newNome);
 
 */