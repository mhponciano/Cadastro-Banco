# Sistema de Cadastro Bancário com POO e GUI

> Projeto acadêmico para a disciplina de Desenvolvimento de Sistemas, com o objetivo de aplicar na prática os conceitos fundamentais da Programação Orientada a Objetos (POO) através da construção de uma aplicação de desktop com interface gráfica em Java Swing.

## 📜 Descrição

Este projeto é uma aplicação de desktop que simula um formulário de cadastro para contas bancárias. A interface gráfica, desenvolvida com Java Swing, permite a inserção de dados do cliente e da conta, além de simular ações como consultar e atualizar registros.

O principal foco do projeto não é a persistência de dados, mas sim a correta estruturação do código utilizando a arquitetura **MVC (Model-View-Controller)** e os pilares da POO.

## ✨ Funcionalidades

  * **Interface gráfica intuitiva** para cadastro de clientes e suas respectivas contas.
  * Campos para dados da conta (Agência, Número da Conta) e dados pessoais do cliente (Nome, Endereço, Telefone, CPF).
  * Seleção de tipo de conta entre **Conta Corrente** e **Conta Poupança**.
  * Simulação de **consulta** a um cliente existente, preenchendo o formulário com dados de exemplo.
  * Lógica inteligente para diferenciar a **gravação de um novo cliente** da **edição** de um cliente que foi consultado.
  * Feedback ao usuário através de caixas de diálogo para confirmar as ações.

## 🛠️ Tecnologias Utilizadas

  * **Java:** Linguagem de programação principal.
  * **Java Swing:** Biblioteca para a construção da interface gráfica de usuário (GUI).

## 🧠 Conceitos Aplicados

Este projeto foi uma oportunidade para aplicar e solidificar os seguintes conceitos:

  * **Programação Orientada a Objetos (POO):**
      * **Encapsulamento:** Proteção dos atributos das classes, que são acessados apenas por meio de getters e setters.
      * **Herança:** Reutilização de código com as classes `Cliente` herdando de `Pessoa`, e `ContaCorrente`/`ContaPoupanca` herdando de `Conta`.
      * **Polimorfismo:** Comportamentos diferentes para métodos com a mesma assinatura, como no método `getTipoConta()`.
      * **Abstração:** Uso de classes abstratas (`Pessoa`, `Conta`) para modelar conceitos genéricos.
  * **Arquitetura MVC (Model-View-Controller):**
      * **Model:** Camada de dados e regras de negócio (pacote `com.cadastrobancario.model`).
      * **View:** Camada de apresentação e interação com o usuário (pacote `com.cadastrobancario.view`).
      * **Controller:** Camada que orquestra a comunicação entre o Model e a View (pacote `com.cadastrobancario.controller`).

## 🚀 Como Executar o Projeto

**Pré-requisitos:**

  * Ter o **JDK (Java Development Kit)** versão 8 ou superior instalado e configurado no seu sistema.

**Passos para execução via terminal:**

1.  Clone este repositório para a sua máquina local:

    ```bash
    git clone https://github.com/SEU-USUARIO/CadastroBanco_POO.git
    ```

2.  Navegue até a pasta `src` do projeto:

    ```bash
    cd CadastroBanco_POO/src
    ```

3.  Compile todos os arquivos `.java`:

    ```bash
    javac com/cadastrobancario/**/*.java
    ```

4.  Execute a classe principal `App.java`:

    ```bash
    java com.cadastrobancario.App
    ```

A janela da aplicação deverá ser exibida no centro da tela.

## 📂 Estrutura de Arquivos

O projeto está organizado da seguinte forma para garantir a separação de responsabilidades:

```text
CadastroBanco_POO/
└── src/
    └── com/
        └── cadastrobancario/
            ├── App.java                 # Ponto de entrada da aplicação
            ├── controller/
            │   └── CadastroController.java  # Lógica de controle
            ├── model/
            │   ├── Cliente.java
            │   ├── Conta.java
            │   ├── ContaCorrente.java
            │   ├── ContaPoupanca.java
            │   └── Pessoa.java
            └── view/
                └── TelaCadastro.java      # Interface gráfica
```

-----

**👨‍💻 Autor**

  * Pedro Coltro
