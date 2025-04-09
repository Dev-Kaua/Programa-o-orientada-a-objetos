/*
 !UML:
 ?  Linguagem de modelagem unificada, ou UML, é uma notação que possibilita a representação gráfica
 ?  do projeto.
 !Na UML temos três conceitos necessários para compreendermos incialmente:
 ?  Diagramas, Elementos e Relacionamentos.
 ?  As notações UML são distribuidas em duas categorias de diagramas, a estrutural e comportamental.
 !Diagramas estruturais:
 !  -Diagrama de classe:
 ?      é utilizado para fazer a representação de estruturas de classes de negócio, interfaces
 ?      e outros componentes do sistema. Por esta característica este diagrama é considerado o
 ?      mais importante para a UML, pois auxilia a maioria dos demais diagramas.
 !  -Diagrama de objetos:
 ?      Representa os objetos existentes em um determinado instante ou fato na aplicação. Assim,
 ?      conseguimos ter uma perspectiva do estado de nossos objetos mediante a interação dos 
 ?      usuários no sistema.
 *Existem outras categorrias de diagramas estruturais e comportamentais, porem iremos focar nessas.
 !Diagrama de classe:
 ?  O diagrama de classes ilustra graficamente como classes serão estruturadas e interligadas entre
 ?  si diante da proposta do nosso software.
 ?  Em diagrama a estrutura das classes é constituida por:
 ?      Identificação: Nome e/ou finalidade da classe
 ?      Atributos: Propriedades e/ou características
 ?      Operações: Ações e/ou métodos
 !Relacionamentos:
 ?  em um diagrama as classes podem existir de forma independente, mas obviamente haverá em alguma
 ?  etapa da aplicação e necessidade de algumas se relacionarem, o que devemos conpreender é o nível 
 ?  de dependência entre elas:
 !  Associação:
 ?      Define um relacionamento entre duas classes, permitindo que um objeto tenha acesso a estrutura
 ?      de um outro objeto.
 ?          (CLASS A) --> (CLASS B)  - associação simples, logo a classe a tem a classe b (Uma escola tem alunos, cliente tem uma profissão)
 ?          (CLASS A) <--> (CLASS B) -Associação bidirecional, quando as duas classes precisam se enxergar.
 ?          (CLASS A)<>--> (CLASS B) - agregação, a classe b é agregada a classe a.
 ?          (CLASS A)<*>--> (CLASS B) - composição
 !  Agregação:
 ?      nela, a classe principal contém uma relação com outra classe mas ela pode existir sem a
 ?      classe agregadora. Imagina em um cadastro de candidatos, podemos encontrar candidatos que
 ?      ainda não possuem uma profissão (a profissao seria uma agregação, já que não seria obrigatório informá-la)
 !  Composição:
 ?      já ela, caracteriza uma dependência existencial entre a classe principal e a classe
 ?      associada. Imaginamos que uma admissão só poderá existir contendo suas informações básicas
 ?      e a composição do candidato selecionado. (Uma admissao depende de um candidato e ela só
 ?      nascerá quando um candidato for informado. não faz sentido uma admissão existir se não tiver um candidato)
 !  Multiplicidade:
 ?      Nem sempre o relacionamento entre as classes será de um para um, um determinado cenário
 ?      poderá exigir multiplicidades específicas conforme opções abaixo:
 ?      1. -> representa uma associação contendo um elemento. (A depende de um elemento de B)
 ?      *. -> representa uma associação contendo uma lista de elementos.(A contém ou depende de uma lista de elementos do tipo B)
 ?      0..1 -> representa uma associação contendo zero ou um elemento.(A pode ter nenhum ou somente um elemento de B)
 ?      0..* -> representa uma associação contendo zero ou uma lista de elementos.(A pode ter nenhum ou mais de um elemento de B)
 ?      1..* -> representa uma associação contendo um ou uma lista de elementos. (A dependa de um ou vários elementos do tipo B)
 !Visibilidade:
 ?  Os atributos e métodos de uma classe podem receber niveis de visibilidade, e na UML existem
 ?  símbolos que representam cada um deles.
 !  (+) Visibilidade pública
 !  (#) visibilidade protegida (muita associada com herança)
 !  (-) visibilidade privada
 *Plataformas de UML: astah, Lucidchart, draw.io, StarUML
 */