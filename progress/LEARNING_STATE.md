# LEARNING STATE — ESTADO CANÔNICO DA JORNADA

**Data de atualização:** 2026-09-11

Este arquivo representa o estado atual conhecido da jornada. Ele deve ser atualizado quando houver evidência nova, sem apagar o histórico dos checkpoints anteriores.

## Estado atual

```text
JAVA_COURSE = IDENTIFIED_AND_APPROVED
SPRING_COURSE = IDENTIFIED_AND_APPROVED_WITH_MODERNIZATION
COURSES_ANALYZED = YES
ROADMAP_STATUS = CREATED
INCREMENTAL_PROJECT_STATUS = DOCUMENTED_NOT_STARTED

CURRENT_COURSE = Especialista Java
CURRENT_MODULE = NOT_STARTED
CURRENT_SECTION = Não iniciado

MODULE_STATUS = NOT_STARTED
OVERALL_STATE = Ainda não avaliado
CONFIDENCE = LOW
PEDAGOGICAL_DEBT = NONE

LAST_CHECKPOINT = Nenhum
NEXT_CHECKPOINT = Após o fechamento do baseline documental e o primeiro ciclo do módulo 1

MAIN_PROJECT = InfraTrack (provisional; documented, not started)
PROJECT_STAGE = FOUNDATION_BOOTSTRAP

CURRENT_FOCUS = Após o fechamento do baseline documental, iniciar o módulo Java 01 — Plataforma Java e ambiente de desenvolvimento
NEXT_FORMAL_ACTIVITY = START_JAVA_MODULE_01_AFTER_DOCUMENTATION_BASELINE_COMMIT

READY_TO_ADVANCE = NO — não há módulo avaliado nem evidência de domínio nesta jornada
READY_FOR_FIRST_APPLICATIONS = NO — a preparação profissional ainda não foi avaliada
```

## Competências

| Competência | Estado atual | Evidência / observação |
| --- | --- | --- |
| Fundamentos de programação | Não avaliado | Aguardando início formal do Java M01 |
| Java | Não avaliado | Curso identificado; aguardando exercícios e evidências |
| Orientação a objetos | Não avaliado | Mapeado no curso Java; aguardando exercícios e evidências |
| Collections / generics | Não avaliado | Mapeado no curso Java; aguardando exercícios e evidências |
| Exceptions / debugging | Não avaliado | Mapeado no curso Java; aguardando exercícios e evidências |
| Git / GitHub | Bootstrap documental | Este repositório foi estruturado para registrar a evolução |
| Testes | Não avaliado | Será introduzido conforme a sequência pedagógica |
| SQL / persistência | Não avaliado | Mapeado no roadmap; SQL/PostgreSQL virá antes de ORM |
| HTTP / REST / backend | Não avaliado | Mapeado no roadmap e no curso Spring |
| Spring / Spring Boot | Não avaliado | Curso identificado; modernização será verificada na etapa |
| Docker / cloud / CI/CD | Não avaliado | Mapeado como etapa futura e ponte com infraestrutura |
| Observabilidade / produção | Não avaliado | Mapeado como etapa futura; ainda sem evidência prática |
| Autonomia | Não avaliado | Será medida por evidências e `ASSISTANCE_LEVEL` |

## Dívida pedagógica

```text
PEDAGOGICAL_DEBT = NONE
```

Não há dívida pedagógica conhecida porque ainda não houve conteúdo avaliado. Isso não significa domínio; significa ausência de lacuna registrada até o momento.

## Acompanhamento longitudinal

```text
RECURRING_DIFFICULTIES = Nenhuma registrada — jornada ainda não iniciada
RECURRING_ERRORS = Nenhum registrado — jornada ainda não iniciada
LAST_RETENTION_CHECK = Nenhum
LAST_TRANSFER_CHECK = Nenhum
CURRENT_ASSISTANCE_TREND = Não avaliado
```

Esses campos acompanham padrões ao longo de vários checkpoints. Não devem ser preenchidos por inferência sem evidência observada.

## Checkpoints

| Registro | Estado | Observação |
| --- | --- | --- |
| Checkpoint inicial de governança | Concluído | Estrutura e políticas criadas; não é avaliação de competência Java |
| Primeiro checkpoint de módulo | Pendente | Depende do início do Java M01 e das evidências práticas |

## Projeto principal

O projeto incremental provisório é o InfraTrack. Ele está documentado, mas não iniciado; o nome e o escopo permanecem revisáveis conforme os requisitos pedagógicos e o nível inicial.

Quando houver implementação, registrar aqui:

- problema de negócio;
- escopo atual;
- conceitos acumulados;
- estágio da implementação;
- evidências Git;
- evolução profissional planejada.

## Próximas ações

1. Fechar o baseline documental após a reauditoria do mentor.
2. Após o baseline, iniciar o módulo Java 01 com exercícios e contexto profissional.
3. Registrar a primeira evidência e o checkpoint quando aplicável.
4. Reintroduzir conteúdos em retenção e transferência sem apagar histórico.
5. Evoluir o InfraTrack somente quando requisitos e conceitos justificarem.

## Histórico desta atualização

- Governança documental preservada.
- Ementas Java e Spring identificadas e analisadas.
- Roadmap criado.
- InfraTrack documentado, sem implementação.
- Nenhuma competência técnica foi declarada como dominada por causa da análise documental.
