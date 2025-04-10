/*
 !Herança:
 ?  Já imaginou voce ter sido classificado para a vaga de emprego dos seus sonhos e como desafio, justamente
 ?  voce criar um diagrama de classes e em seguida os respectivos arquivos .java que apresentassem os fundamentos
 ?  de POO com base no contexto de vários aplicativos de mensagens instantaneas?
 *  Com base na nossa classe MsnMessenger, voce ja poderia dar os primeiros passos para se dar bem no
 *  processo seletivo, simplesmente copiar e colar a estrutura para as novas classes FacebookMessenger, Telegram.
 !  Lamentamos dizer mas esta não seria a melhor alternativa para a proposta citada acima.
 !NOTE: Todas as três classes possuem a mesma estrutura comportamental, e se encaixam perfeitamente no segundo
 !  pilar da POO, a Herança.
 *Com base nisso, vamos criar um exemplo de herança correto para esse caso. mas não para por ai...
 *  Será que todos os sistemas de mensagens realizam as suas operações de uma mesma maneira? e agora?
 *  Este é um trabalho para os pilares Abstração e Polimorfismo.
 !ABSTRAÇÃO:
 ?  Como vimos antes, será que as ações realizadas pelos apps de mensagens contém o mesmo comportamento?
 *    Já imaginou a Microsoft falar para o Facebook: "Ei, toma meu código do MSN".
 ?  O que vale destacar é que todo sistema de mensagem precisa sim no mínimo Enviar e Receber Mensagem.
 ?  O sistema pai (ServiçoMensagemInstantanea) dará as informações base, mas cada serviço deverá dar suas 
 ?  informações especifica. Ele só diz para o sistema que suas classes filhas são um serviço de mensagem.
 !    Portanto, ele deve ser Abstract e quem quiser ser um serviço precisa implementar os dois contratos:
 !    (Na classe pai):
 !      public abstract void enviarMensagem();
 !      public abstract void receberMensagem(); 
 *    (Se nao for na classe filho, escreverá sem o abstract)
 !    Em java o conceito de abstração é representado pela palavra reservada Abstract e métodos que NÃO
 !    possuem corpo na classe abstrata (pai), sendo encerrados com ; assim como nos dois exemplos acima.
 !POLIMORFISMO:
 ?    pode-se observar no contexto de Abstração e Herança que conseguimos criar uma singularidade estrutural
 ?    de nossos elementos. Resumindo, qualquer classe que deseja representar um serviço de mensagens, basta
 ?    estender a classe ServiçoMensagemInstantanea e implementar os respectivos métodos abstratos. O que 
 ?    vale reforçar aqui é, cada classe terá a mesma ação executando procedimentos de maneira especializada.
 !  Polimorfismo, portanto, se refere a um objeto abstrato que não tem conhecimento de como as coisas acontecem
 !  especificamente. E nas suas classes filhas temos cada implementação especifica seguindo a proposta
 !  especificada na classe pai (Que seria mais genérica).
 !Modificador protected:
 *  Está muito associado a herança...
 ?  Lá no nosso sistema de mensagem instantânea além de enviar e receber, primeiramente ele validava se
 ?  estava conectado a internet e depois salvava o histórico da mensagem em seus servidores.
 ?    Sabemos que cada aplicativo costuma salvar as mensagens em seus respectivos servidores cloud, mas e
 ?    quanto a validar se está conectado a internet? Não poderia ser um mecanismo comum à todos? Logo qualquer
 ?    classe filha de ServiçoMensagemInstantanea poderia desfrutar através de herança desta funcionalidade.
 !      Mas fica a reflexão do que já aprendemos sobre visibilidade de recursos: Com o modificador private
 !      somente a classe conhece a implementação, quanto que o modificador public todos passarão a conhecer.
 !      Mas gostaríamos que somente as classes filha soubessem. Bem, é ai que entra o modificador protected!!
 
 */