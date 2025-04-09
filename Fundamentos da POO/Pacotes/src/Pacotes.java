/*
 !Pacotes:
 ?  O mecanismo de pacote é a forma de organização do nosso projeto.
 ?  A linguagem java é composta por milhares de classes com as finalidades de, por exemplo:
 ?  Classes de tipos de dados, representação de texto, números, datas, arquivos e diretórios,
 ?  conexão a banco de dados, entre outras. Imagina todas essas classes existirem em um único
 ?  nível de documentos? É como se não existissem as pastas no computador.
 !Nomenclatura
 *  Obs: não é um padrão nem requisito do seu projeto ter essa convenção de pacotes, mas é uma sugestão
 *       porque projetos reais vão atuar muito com essas convenções.
 ?  Vamos imaginar que sua empresa se chama Power Soft e ela está desenvolvendo softwares comercial,
 ?  governamental e um software livre ou de codigo aberto. Abaixo teríamos os pacotes sugeridos:
 ! - Comercial: com.powersoft
 ! - Governamental: gov.powersoft
 ! - Código aberto: org.powersoft
 ?  Todas as classes elas por sugestão devem estar em pacotes.
 ?  os pacotes seguem convenções de nomenclaturas de acordo com a finalidade do projeto...
 ?  Costumamos criar um prefixo com o nome da corporação, que identifique o proprietário daquele projeto.
 ?  E depois, distribuimos as classes por papéis, para que tenhamos a melhor organização do projeto.
 !Identificação:
 ?  Uma das características de uma classe é a sua identificação, Cliente, NotaFiscal, TituloPagar,
 ?  porém quando esta classe é organizada por pacotes, ela passa a ter dus indentificações.
 ?  O nome simples(próprio nome) e agora o nome qualificado(Endereçamento do pacote + nome), exemplo:
 ?      considere a classe Usuario que esta´endereçada no pacote com.controle.acesso.model,
 *      O nome qualificado desta classe é: "com.controle.acesso.model.Usuario"
 !Package versus Import:
 ?  A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém uma
 ?  definição de package no arquivo, sempre na primeira linha do código. Para utilização de uma classe
 ?  em outros pacotes, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo:
 ?      package
 
 ?      import...
 ?      import...

 ?      public class MinhaClasse { ... }
 */
