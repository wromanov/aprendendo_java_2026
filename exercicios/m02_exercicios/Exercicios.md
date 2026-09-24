# Exercícios de Consolidação — M02 Fundamentos Java

## Regras desta etapa

Resolva os exercícios sem consultar soluções prontas.

Você pode consultar suas próprias anotações e a documentação da linguagem caso precise confirmar sintaxe, mas tente primeiro resolver com o que aprendeu no módulo.

Não utilize conceitos ainda não estudados apenas para deixar a solução mais sofisticada.

Neste momento, priorize:

- variáveis;
- tipos primitivos;
- `String`;
- operadores aritméticos;
- operadores de atribuição;
- incremento e decremento;
- conversões de tipos;
- promoção aritmética;
- entrada de dados;
- saída formatada;
- `printf`;
- sequências de escape;
- boas convenções de nomenclatura.

Não é necessário utilizar:

- `if`;
- `switch`;
- laços;
- métodos próprios;
- arrays;
- classes adicionais;
- collections.

---

# Nível 1 — Aplicação direta contextualizada

## Exercício 1 — Controle de passageiros de um voo

### 1. Contexto

Você entrou para a equipe responsável por um pequeno sistema operacional utilizado no embarque de passageiros de uma companhia aérea.

Cada voo possui uma quantidade total de assentos disponíveis, e a equipe de operação informa quantos passageiros já realizaram o embarque.

### 2. Problema

O sistema atualmente apresenta apenas a capacidade da aeronave e a quantidade de passageiros embarcados.

A operação também precisa visualizar quantos assentos ainda estão disponíveis.

### 3. Sua tarefa

Implemente um programa que solicite:

- número do voo;
- capacidade total da aeronave;
- quantidade de passageiros já embarcados.

Depois, apresente um pequeno resumo contendo essas informações e a quantidade de assentos ainda disponíveis.

### 4. Requisitos

O programa deve:

- receber o número do voo;
- receber a capacidade total da aeronave;
- receber a quantidade de passageiros embarcados;
- calcular a quantidade de assentos disponíveis;
- apresentar as informações de forma organizada.

### 5. Exemplo de comportamento esperado

Entrada:

```text
Número do voo: G3 1402
Capacidade: 180
Passageiros embarcados: 137
```

Saída esperada:

```text
Voo: G3 1402
Capacidade total: 180 passageiros
Passageiros embarcados: 137
Assentos disponíveis: 43
```

### 6. Critérios de conclusão

O exercício está concluído quando:

- os dados forem recebidos corretamente;
- o cálculo de assentos disponíveis estiver correto;
- a saída estiver legível;
- você conseguir explicar o tipo escolhido para cada variável;
- você conseguir explicar a operação utilizada para encontrar os assentos disponíveis.

---

# Nível 2 — Problema contextualizado

## Exercício 2 — Indicadores de vendas de um e-commerce

### 1. Contexto

Você está auxiliando a equipe que mantém o painel administrativo de um e-commerce.

A equipe comercial acompanha o faturamento de um produto durante três dias consecutivos.

### 2. Problema

O sistema registra o faturamento diário, mas ainda não apresenta:

- o faturamento acumulado;
- o faturamento médio diário.

Essas informações serão utilizadas pela equipe comercial para acompanhar o desempenho do produto.

### 3. Sua tarefa

Implemente uma funcionalidade que receba:

- nome do produto;
- faturamento do primeiro dia;
- faturamento do segundo dia;
- faturamento do terceiro dia.

O programa deverá apresentar o faturamento total e a média diária.

### 4. Requisitos

O programa deve:

- receber o nome do produto;
- armazenar os três valores de faturamento;
- calcular o faturamento total;
- calcular a média diária;
- preservar as casas decimais no cálculo;
- apresentar valores monetários com duas casas decimais.

### 5. Exemplo de comportamento esperado

Entrada:

```text
Produto: Monitor 27 polegadas
Dia 1: 2350.50
Dia 2: 3180.90
Dia 3: 2768.60
```

Saída esperada:

```text
Produto: Monitor 27 polegadas
Faturamento total: R$ 8300.00
Média diária: R$ 2766.67
```

### 6. Critérios de conclusão

O exercício está concluído quando:

- o total estiver correto;
- a média preservar a parte decimal;
- a saída monetária utilizar duas casas decimais;
- você conseguir explicar por que escolheu os tipos utilizados;
- você conseguir explicar por que uma divisão envolvendo apenas inteiros poderia produzir um resultado incorreto em determinados cenários.

---

# Nível 3 — Mini demanda profissional

## Exercício 3 — Relatório de consumo de link de internet

### 1. Contexto

Você está trabalhando em uma ferramenta interna utilizada pela equipe de infraestrutura de uma empresa.

Um dos links de internet possui uma franquia mensal de dados contratada.

A equipe registra quanto desse volume foi consumido em três períodos de medição.

### 2. Problema

Atualmente os técnicos somam os valores manualmente.

A equipe quer uma pequena funcionalidade que apresente:

- identificação do link;
- franquia contratada;
- consumo registrado em cada período;
- consumo acumulado;
- volume ainda disponível;
- percentual da franquia já utilizado.

### 3. Sua tarefa

Desenvolva um programa que receba os dados necessários e gere um resumo de consumo do link.

Você deverá decidir:

- quais informações precisam ser armazenadas;
- quais tipos representam melhor cada informação;
- quais cálculos são necessários;
- como apresentar os resultados de maneira legível.

### 4. Requisitos

O programa deve receber:

- nome ou identificação do link;
- franquia mensal em GB;
- consumo do período 1;
- consumo do período 2;
- consumo do período 3.

Deve apresentar:

- consumo total;
- saldo restante;
- percentual utilizado;
- valores decimais adequadamente formatados.

### 5. Exemplo de comportamento esperado

Entrada:

```text
Link: ISP-PRINCIPAL-01
Franquia mensal: 1000 GB
Período 1: 215.5 GB
Período 2: 180.75 GB
Período 3: 249.25 GB
```

Saída aproximada:

```text
=== CONSUMO DO LINK ===

Link: ISP-PRINCIPAL-01
Franquia: 1000.00 GB
Consumo acumulado: 645.50 GB
Saldo disponível: 354.50 GB
Percentual utilizado: 64.55%
```

### 6. Critérios de conclusão

Considere concluído quando:

- todos os dados forem recebidos pelo programa;
- os cálculos estiverem corretos;
- nenhuma informação decimal importante for perdida;
- o percentual estiver correto;
- a saída estiver formatada de maneira profissional;
- você conseguir justificar os tipos escolhidos;
- você conseguir explicar onde poderia ocorrer divisão inteira e como evitá-la.

---

# Desafio — Mini feature

## Exercício 4 — Resumo operacional de um estacionamento de aeroporto

### 1. Contexto

Uma empresa administra o estacionamento de um aeroporto.

O sistema registra algumas informações básicas sobre a operação diária, mas a equipe ainda monta manualmente o fechamento do turno.

Você recebeu uma pequena demanda para automatizar parte desse resumo.

### 2. Problema

Ao final de cada turno, o operador possui:

- identificação do estacionamento;
- capacidade total de veículos;
- quantidade de veículos presentes no início do turno;
- quantidade de veículos que entraram;
- quantidade de veículos que saíram;
- valor médio cobrado por veículo que saiu.

A operação precisa gerar um resumo automático.

### 3. Sua tarefa

Implemente uma pequena feature que receba os dados do turno e apresente:

- quantidade estimada de veículos ao final do turno;
- quantidade de vagas disponíveis;
- percentual de ocupação;
- quantidade de saídas;
- receita estimada gerada pelas saídas.

Você deverá interpretar os requisitos e decidir como representar e calcular cada informação.

### 4. Requisitos funcionais

O programa deve receber:

- identificação do estacionamento;
- capacidade máxima;
- veículos presentes no início do turno;
- entradas durante o turno;
- saídas durante o turno;
- valor médio pago por veículo que saiu.

O programa deve calcular:

- quantidade de veículos ao final do turno;
- quantidade de vagas livres;
- percentual de ocupação;
- receita estimada do turno.

A apresentação deve utilizar:

- texto organizado;
- valores monetários com duas casas decimais;
- percentual com duas casas decimais.

### 5. Exemplo de comportamento esperado

Entrada:

```text
Estacionamento: TERMINAL-2
Capacidade máxima: 600
Veículos no início do turno: 410
Entradas: 125
Saídas: 90
Valor médio por saída: 28.50
```

Saída aproximada:

```text
================================
      RESUMO DO TURNO
================================

Estacionamento: TERMINAL-2

Capacidade máxima: 600
Veículos ao final do turno: 445
Vagas disponíveis: 155
Ocupação: 74.17%

Veículos que saíram: 90
Receita estimada: R$ 2565.00
```

### 6. Critérios de conclusão

A feature está concluída quando:

- os dados forem recebidos corretamente;
- o saldo de veículos estiver correto;
- as vagas disponíveis estiverem corretas;
- o percentual de ocupação estiver correto;
- a receita estiver correta;
- os valores decimais forem preservados;
- a saída estiver legível e organizada;
- os nomes das variáveis forem compreensíveis;
- você conseguir explicar cada cálculo sem consultar o código.

---

# Regra de entrega

Resolva um exercício de cada vez.

Ordem:

1. Exercício 1;
2. Exercício 2;
3. Exercício 3;
4. Desafio.

Depois de terminar cada exercício, envie o código para revisão antes de começar o próximo.

Não refatore antecipadamente usando recursos que ainda não estudamos.

O objetivo desta etapa não é produzir código sofisticado.

O objetivo é demonstrar que você consegue transformar:

```text
requisito de negócio
        ↓
dados necessários
        ↓
tipos adequados
        ↓
operações
        ↓
resultado
```

sem receber a solução pronta.