/*
 !Modificadores:
 ?  Em java utilizamos três palavras reservadas e um conceito default (sem nenhuma palavra reservada) para
 ?  definir os quatro tios de visibilidade de atributos, métodos e até mesmo classes no que se refere ao 
 ?  acesso por outras classes. Iremos ilustrar do mais visível ao mais restrito tipo de visibilidade nos
 ?  arquivos em nosso projeto.
 ?      Para uma melhor ilustração, iremos representar os conceitos de visibilidade de recursos através
 ?      do contexto em uma lanchonete que vende lanche natural e suco.
 !Modificador public:
 ?  como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer
 ?  outra classe em qualquer outro pacote pode vizualizar tais recursos.
 !Modificador default:
 ?  Está fortemente associado a organização das classes por pacotes, algumas implementações não precisam
 ?  estar disponiveis por todo o projeto, e esse modificador de acesso restringe a visibilidade por pacotes.
 ?  Dentro do pacote lanchonete, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.
 !Modificador private:
 ?  Depois de reestruturar nosso estabeleciment, onde temos as divisões(pacotes) espaço do cliente e atendimento,
 ?  chegou a hora de uma reflexão sobre visibilidade ou podificadores de acesso.
 ?  Conhecemos as ações disponiveis nas classes cozinheiro, almoxarife, atendente e cliente, mesmo com a organização 
 ?  por pacote, será se realmente estas classes precisam ser tão explicitas?
 ?   Diante destes questionamentos é que nossas classes precisam continuar mantendo suas ações(métodos)
 ?  mas nem todas precisam ser vistas por ninguém.
 */
