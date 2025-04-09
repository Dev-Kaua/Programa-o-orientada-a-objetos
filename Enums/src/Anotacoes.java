/*
 !Enum:
 ?  É um tipo especial de classe onde os objetos são previamente criados, imutáveis e
 ?  disponíveis por toda aplicação.
 ?  Usamos Enum quando o nosso modelo de negócio contém objetos de mesmo contexto que já
 ?  existem de pré-estabelecida com a certeza de não haver tanta alteração de valores.
 ?      Ex: objeto cliente jamais poderia ser um Enum, já que pode mudar, é relativo, agora
 ?      algo como por exemplo o estado em que o cliente vive... existem 27 estados e a 
 ?      chance de isso mudar é baixíssima. então "Estados" poderia ser um Enum.
 !Exemplos:
 ?  GRAU DE ESCOLARIDADE: Analfabeto, Fundamental, Médio, Superior
 ?  ESTADO CIVIL: Solteiro, casado, divorciado, viúvo
 ?  ESTADOS BRASILEIROS: SP, RJ, PR, MG.
 *OBS: não confunda uma lista de constantes com enum.
 *  Enquanto que uma constante é uma variável de tipo com valor imutável, um enum é um
 *  conjunto de objetos já pre-definidos na aplicação.
 ?  Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e 
 ?  métodos. Veja o exemplo de um enum para disponibilizar os quatro estados brasileiros
 ?  citados acima, contendo informações de: nome, sigla e um método que pega o nome de
 ?  cada estado e já retorna para tudo maiúsculo (Exemplo em EstadoBrasileiro.java).
 */