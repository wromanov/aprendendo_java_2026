# Formação Decoder — Michelli Brito

## Status e papel na trilha

```text
ROLE = DISTRIBUTED_SYSTEMS_MICROSERVICES
PRIORITY = HIGH
ORDER = 3
COURSE_STATUS = APPROVED_AS_POST_BACKEND_CORE
START_NOW = NO
```

A Formação Decoder entra depois do backend core. Ela não substitui a formação Especialista Java, a Ponte Java → Backend nem a formação Especialista Spring REST.

## Fonte disponível

O conteúdo foi obtido a partir de imagens/ementa fornecidas pelo mentorado. Somente tópicos explicitamente observáveis nessa fonte são registrados neste documento. O ano e a edição exatos da formação ainda não foram confirmados documentalmente.

## Conteúdo observado

- Arquitetura de Microsserviços, Componentes e Comunicações
- Ecossistema Spring para Arquitetura de Microsserviços
- Criando os Primeiros Microsserviços com Spring
- Preparação de Ambiente — Conteúdo Complementar
- API RESTful para Microsserviços — do Básico ao Avançado
- Spring Data JPA do Básico ao Avançado
- Spring Logging nos Microsserviços
- API Composition Pattern e Comunicação Síncrona
- Service Registry Discovery Pattern
- API Gateway Pattern e Load Balancer
- Transação Distribuída para Deleção de Recursos entre Microsserviços
- Microservices Patterns para Comunicação Assíncrona
- Event-Carried State Transfer Pattern e Broker Pattern
- Circuit Breaker Pattern e Retry com Resilience4j
- Global Config Management Pattern
- Comunicação Assíncrona via Command Messages
- Basic Authentication nos Microsserviços / Service Registry
- Authentication e Authorization com Spring Security
- Authentication e Authorization com JWT
- Cross Cutting — Authentication e Authorization com JWT
- Configuração de Ambientes e Deploy dos Microsserviços

Não são inferidos a partir dessa lista aulas, módulos, tecnologias, bibliotecas, versões, ferramentas ou detalhes de implementação que não estejam explicitamente comprovados. Quando a fonte não for suficiente, `SOURCE_EVIDENCE = INSUFFICIENT`.

## Papel pedagógico

A formação complementa Java e Spring REST ao tratar problemas que surgem quando um sistema deixa de operar como um único processo e passa a ser composto por múltiplos serviços independentes. O objetivo é compreender as decisões, comunicações, falhas e responsabilidades adicionais desse cenário — inclusive reconhecer quando ele não é a escolha adequada.

## Pré-requisitos pedagógicos

Antes de iniciar a Decoder, deve haver evidência suficiente em:

- Java
- orientação a objetos
- Collections
- exceptions
- generics
- Spring Boot
- REST/HTTP
- SQL
- persistência
- JPA/Hibernate
- transações
- testes
- Git
- segurança básica
- Docker
- troubleshooting de aplicação backend

## Riscos de antecipação

Iniciar microsserviços cedo demais pode produzir:

- memorização de patterns;
- uso de tecnologias sem compreender o problema;
- complexidade acidental;
- overengineering.

## Regra arquitetural

```text
MICROSERVICES_BY_DEFAULT = NO
MODULAR_MONOLITH_VALID_OPTION = YES
ARCHITECTURE_DECISION_REQUIRES_TRADEOFF_ANALYSIS = YES
```

Microsserviços introduzem custos adicionais de rede, latência, falhas parciais, consistência distribuída, segurança entre serviços, deployment distribuído, observabilidade, troubleshooting, versionamento e operação. A competência desejada é saber quando usar microsserviços e quando não usar microsserviços. Um monólito modular permanece uma opção válida quando for tecnicamente superior.

## Modernização futura

Como o ano/edição e as versões exatas não estão confirmados, qualquer tecnologia específica deve ser validada quando essa fase começar. Versões atuais não devem ser registradas como se fossem parte original da formação.
