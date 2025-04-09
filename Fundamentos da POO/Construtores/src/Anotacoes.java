/*
 !Construtores:
 ?  Sabemos que para criar um objeto na linguagem Java utilizamos a seguinte estrutra:
 ?      Classe novoObjeto = new Classe();
 ?  Desta forma será criado um novo objeto na memória, este recurso também é conhecido
 ?  como instanciar um novo objeto.
 ?  Muitas das vezes já queremos que na criação de um objeto, a linguagem já solicite 
 ?  para quem for criar este novo objeto defina algumas propriedades essenciais.
 ?  Em pessoa.java, criaremos uma pessoa mas como não temos o setter prar nome e cpf,
 ?  este objeto não tem como receber estes valores.
 ?  É agora que entra o aspecto de construtores.
 ?  Entrando em cena o construtor para criar nossos objetos já com valores requeridos
 ?  no momento da criação/instanciação(new).
 !O que é um método Construtor?
 ?  é um método que:
 ?      -Não tem retorno
 ?      -Tem que ser idêntico ao nome da classe
 ?      -assim como os métodos, eles recebem parâmetros
 ?      -métodos convenientes utilizam um tipo de retorno (void) e o nome não tem igualidade com o nome da classe.
 !A finalidade do construtor é garantir que na inicialização do objeto a gente já informe
 !dados ou atributos que são extremamente importantes para a criação do objeto.
 *OBS: Não abusem dos construtores! a linguagem permite colocar todos os atributos nos
 *construtores mas isso não é uma boa prática. 
 *A recomendação que é aplicada em construtor é:
 *  Quais são os atributos relevantes para a existência de um objeto?
 *  EX:aluno -> a informação relevante para se criar um aluno é seu nome + matricula
 *              os outros dados podem ser complementados em um segundo momento.
 * OBS: podemos criar mais de um construtor, mas não é recomendado na maioria das vezes.
*/
