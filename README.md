# Sistema de Gerenciamento de Entradas para Espetáculos 🎭

Este projeto é um sistema simples em Java que simula a emissão de diferentes tipos de entradas (Ingressos) para espetáculos, com base em políticas de preço específicas para cada tipo de público.

## 🧾 Descrição

O sistema é composto por uma hierarquia de classes para representar diferentes tipos de entradas:
- **EntradaInteira**: ingresso com valor cheio.
- **EntradaMeia**: ingresso com 50% de desconto.
- **EntradaProfessor**: ingresso com 60% de desconto (paga 40%).

Essas classes herdam de uma classe abstrata chamada `Entrada`, que define a estrutura comum a todas as entradas (como o número do assento e o método `calcularValor()`).

## 🗂 Estrutura de Arquivos

- `Entrada.java`: classe abstrata base que define a estrutura comum para os ingressos.
- `EntradaInteira.java`: implementação para ingresso com valor total.
- `EntradaMeia.java`: implementação para meia-entrada (50% do valor).
- `EntradaProfessor.java`: implementação para professores (60% de desconto).
- `Teste.java`: classe principal (ainda em construção) onde será possível instanciar e testar os diferentes tipos de entrada.

## 📌 Funcionalidades

- Modelagem orientada a objetos com uso de herança e polimorfismo.
- Cálculo dinâmico do valor do ingresso com base no tipo da entrada.
- Possibilidade de estender facilmente o sistema para incluir novos tipos de entradas.

