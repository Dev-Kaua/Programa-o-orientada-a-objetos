/*
 !Classes:
 ?  antes que esse objeto exista, nós precisamos determinar um molde, definir suas características, quais 
 ?  são as ações que esse objeto pode realizar.... Isso tudo é descrito na concepção de CLASSES.
 ?  Essas classes dentro da linguagem ficam armazenadas em arquivos com a extensão .java
 ?      E aí existe o processo de compilação e o arquivo de compilação é o .class
 *          Então, todo o código fonte fica no .java e todo o código que a nossa máquina vai 
 *          interpretar através da JVM é o .class, então sempre teremos dois arquivos com o
 *          mesmo nome, porém extensões diferentes.
 ?As classes existentes em nossos projetos são compostas por:
 !Indentificador, Características e Comportamentos.
 *          imagine que pegamos a planta de uma casa (a planta seria a classe), a medida que construimos 
 *          as casas com suas respectivas caracteristicas ou especificações da planta estão surgindo
 *          objetos na nossa aplicação.
 !Classe (class):
 ?  A estrutura ou representação que direciona a criação dos objetos de mesmo tipo.
 ?      CLASSE é a estrutura que todos os nossos objetos deverão seguir!
 !Identificador(identity):
 ?  Propósito existencial aos objetos que serão criados. (deve ter um nome claro!)
 ?      ex: se a nossa proposta é que a classe represente uma nota fiscal, não devemos identifica-la como
 ?          "NF", mas sim como "NotaFiscal" para sua identificação ser bem clara.
 !Características(states):
 ?  Também conhecido como atributos ou propriedades, é toda informação que representa o estado do objeto.
 ?      por exemplo: no nosso contexto da planta, criamos a nossa classe "Casa" que agora, teremos
 ?                   casas criadas com base em uma planta, mas cada casa pode ter um número, cor de pintura,
 ?                   quantidade de quartos ou qualquer outra informação específica diferente.
 ?  características/atributos são toda a informação que conseguimos obter de um determinado objeto.
 !Comportamentos(behavior):
 ?  Também conhecido como ações ou métodos, é toda a parte comportamental que um objeto dipõe.
 ?      ex: no contexto de um carro, ele acelera, freia, buzina, etc.
 !Instanciar(new):
 ?  É o ato de criar um objeto a partir da estrutura definida em uma classe.
 ?      Estamos de fato materializando aquela representação que até então estava em uma planta.
 ?      Então quando digo "Casa = new Casa", estou realizando a constrção literal de um objeto 
 ?      que representa aquele contexto.
 !  Exemplo para ilustrar as etapas de desenvolvimento orientada a objetos em Java em "Student.java" e "School.java"
 !Seguindo algumas convecções, as nossas classes são classificadas como:
 !Classe de modelo(model):
 ?  classes que representem estrutura de domínio da aplicação, ex: Cliente, Pedido, NotaFiscal e etc.
 !Classes de serviço(service):
 ?  classes que contém regras de negócio e validação do nosso sistema.
 ?      Ex: imagina que temos uma classe Cliente e antes de armazenar as infoemações no banco de dados,
 ?          você quer primeiro fazer uma checagem se o CPF foi informado, se a data de nascimento foi
 ?          preenchido etc. todas essas regras de negócio ficariam a caráter de uma classe de seviço.
 !Classe de repositório(repository):
 ?  Classe que contém uma integração com banco de dados.
 *Diferentemente da P. estruturada, a P.O.O. tem essa preocupação de distribuir as responsabilidades.
 *Pode ter certeza que alguns projetos serão constituidos de inúmeras classes que se relacionam obviamente.
 *Cada uma com sua respectiva responsabilidade.
 !Classe de controle(controller):
 ?  Classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação.
 ?      por exemplo, quero disponibilizar meu cadastro de cliente para uma API, para que as pessoas
 ?      pessoas possam consumir essa informação via http. Classe para disponibilizar o conteúdo.
 !Classe utilitária(util):
 ?  classe que contém recursos comuns à toda nossa aplicação.
 ?      imagina que você precisa calcular alguma operação matemática, você pode criar uma classe utilitária
 ?      que em qualquer parte da aplicação você poderá utilizá-la.
 */