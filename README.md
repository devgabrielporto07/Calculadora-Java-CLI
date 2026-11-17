# Calculadora Java CLI

Uma calculadora em Java executada pelo terminal, criada como projeto de estudo para praticar os fundamentos da linguagem.

## 📋 Sobre o Projeto

Este projeto apresenta uma calculadora simples pela linha de comando (CLI, do inglês *Command-Line Interface*). A aplicação conversa com a pessoa usuária pelo terminal, exibe uma representação textual da calculadora e pede uma palavra de inicialização.

O projeto ainda está em desenvolvimento: já coleta a operação escolhida e os números informados, mas os cálculos matemáticos e a validação do símbolo da operação ainda estão em desenvolvimento.

### O que já foi praticado

- Leitura de dados digitados no terminal com `Scanner`.
- Métodos, classes e organização modular básica em Java.
- Tratamento de texto, como `toUpperCase()` e `trim()`.
- Condicionais e repetição para validar a palavra de inicialização.
- Arrays e laços de repetição para armazenar vários números.
- Uso de cores ANSI no terminal.

### Estrutura e modularização

O projeto separa tarefas em classes menores. A classe `Main` coordena a ordem do programa e chama as outras classes quando necessário. As classes ficam no pacote `com.github.devgabrielporto07`, dentro de `src/main/java`.

| Classe | Responsabilidade |
| --- | --- |
| `Main` | Coordena o fluxo do programa, lê a operação e os números e armazena os valores em um array. |
| `Nome` | Pede o nome, lê a entrada e devolve o texto tratado. |
| `Saudacao` | Exibe uma mensagem de boas-vindas usando o nome informado. |
| `PalavraInicializacao` | Solicita a palavra `JAVA` e informa se ela foi validada. |
| `ExibicaoCalculadora` | Exibe a representação textual da calculadora no terminal. |
| `Cores` | Reúne as constantes de cores ANSI usadas nas mensagens. |
| `LogicaCalculadora` | Classe destinada à lógica das operações matemáticas; os cálculos ainda estão em desenvolvimento. |

## 🚀 Acesse e execute o projeto

### Requisitos

- Java 21 ou superior.
- Maven.

### Como executar

Clone o repositório e entre na pasta do projeto:

```bash
git clone https://github.com/devgabrielporto07/Calculadora-Java-CLI.git
cd Calculadora-Java-CLI
```

Compile com o Maven e execute a classe principal:

```bash
mvn clean compile
java -cp target/classes com.github.devgabrielporto07.Main
```

## 📸 Preview

Ao iniciar, o programa pede o nome da pessoa usuária e a palavra `JAVA`. Em seguida, mostra a representação da calculadora no terminal:

```text
==========================================================
|             CALCULADORA-JAVA-TERMINAL                 |
|            7         8         9     ( * )            |
|            4         5         6     ( - )            |
|            1         2         3     ( + )            |
|                      0               ( / )            |
==========================================================
```

## 🛠️ Tecnologias Utilizadas

- Java 21
- Maven
- IntelliJ IDEA

## 🔗 Projeto relacionado

Este repositório é a versão de terminal. Para acompanhar a proposta de uma versão com interface gráfica usando Java Swing, veja o projeto [Calculadora-Java-Swing](https://github.com/devgabrielporto07/Calculadora-Java-Swing).

São projetos separados: a versão CLI funciona no terminal e não depende da versão Swing.

## 📝 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.

## 👨‍💻 Autor

[Gabriel Porto](https://github.com/devgabrielporto07)

## 📧 Contato

Para dúvidas, sugestões ou para reportar problemas, abra uma issue neste repositório.
