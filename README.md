# 💳 Sistema Bancário em Java

Este projeto simula um sistema bancário simples, com operações básicas como criação de contas, movimentações financeiras e simulação de empréstimos. Ele foi desenvolvido utilizando princípios de orientação a objetos em Java.

## 📁 Estrutura do Projeto

- `Main.java` — Classe principal que executa o programa de teste com cliente, conta e empréstimo.
- `Banco.java` — Representa o banco e gerencia a lista de contas existentes.
- `Cliente.java` — Cria um cliente que recebe automaticamente uma conta corrente e uma poupança.
- `Conta.java` — Classe abstrata base para contas bancárias. Implementa métodos comuns como sacar, depositar e transferir.
- `ContaCorrente.java` — Representa uma conta corrente. Possui extrato personalizado.
- `ContaPoupanca.java` — Representa uma conta poupança. Também possui extrato personalizado.
- `Emprestimo.java` — Classe que calcula parcelas de um empréstimo com juros compostos mensais.
- `IConta.java` — Interface com as operações básicas de uma conta bancária.

## ⚙️ Funcionalidades

- Cadastro automático de contas ao criar um cliente.
- Operações bancárias:
  - Depósito
  - Saque
  - Transferência entre contas
- Geração de extratos (corrente e poupança)
- Simulação de empréstimos:
  - Cálculo da parcela mensal
  - Cálculo do total a pagar
