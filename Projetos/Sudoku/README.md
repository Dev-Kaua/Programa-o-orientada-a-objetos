# 🧩 Sudoku Game - Java GUI

Um jogo interativo de Sudoku desenvolvido com Java, com interface gráfica amigável onde o usuário pode jogar em tempo real, interagir com os botões e receber feedback imediato. Este projeto foi um verdadeiro laboratório para aplicar **orientação a objetos**, **eventos de interface gráfica** e lógica de validação de jogos.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Java AWT & Swing (Interface Gráfica)
- Estrutura MVC:
  - `model/` - Lógica do jogo
  - `ui/` - Interface gráfica
  - `service/` - Lógica de verificação e controle
  - `util/` - Auxiliares e helpers

---

## 🧠 Funcionalidades

- Jogabilidade via clique e teclado:
  - Clique no espaço desejado
  - Digite o número e pressione `Enter`
- Botões interativos:
  - `Verificar`: Confere se há erros na solução atual
  - `Reiniciar`: Reseta o tabuleiro
  - `Concluir`: Valida se o jogo foi resolvido corretamente

---

## 📦 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/sudoku-java.git
   cd sudoku-java
2. Compile e execute a classe principal:
   ```bash
   javac Main.java
   java Main

---

## 🔍 Aprendizados e Desafios
O maior desafio foi a lógica para manter a integridade do jogo enquanto o usuário interagia em tempo real. Organizar o código por camadas e tornar tudo funcional e intuitivo foi uma das experiências mais enriquecedoras até aqui.

---

## 🧑‍💻 Autor
Kauã Reis — Fã de lógica, jogos e interfaces criativas, trazendo um pouco de diversão ao backend.
