# LEARNING STATE — ESTADO CANÔNICO DA JORNADA

**Data de atualização:** 2026-09-10

Este arquivo representa o estado atual conhecido da jornada. Ele deve ser atualizado quando houver evidência nova, sem apagar o histórico dos checkpoints anteriores.

## Estado atual

```text
CURRENT_COURSE = A definir — aguardando ementas completas
CURRENT_MODULE = Não iniciado
CURRENT_SECTION = Não iniciado

MODULE_STATUS = NOT_STARTED
OVERALL_STATE = Ainda não avaliado
CONFIDENCE = LOW
PEDAGOGICAL_DEBT = NONE — nenhuma dívida conhecida; formação ainda não iniciada

LAST_CHECKPOINT = Nenhum
NEXT_CHECKPOINT = Após análise das ementas e conclusão do primeiro ciclo do módulo 1

MAIN_PROJECT = A definir após a análise das ementas
PROJECT_STAGE = FOUNDATION_BOOTSTRAP

CURRENT_FOCUS = Preparar a governança documental e receber as ementas dos cursos

READY_TO_ADVANCE = NO — não há módulo avaliado nem evidência de domínio nesta jornada
READY_FOR_FIRST_APPLICATIONS = NO — a preparação profissional ainda não foi avaliada
```

## Competências

| Competência | Estado atual | Evidência / observação |
| --- | --- | --- |
| Fundamentos de programação | Não avaliado | Aguardando início formal da trilha |
| Java | Não avaliado | Aguardando ementas e exercícios |
| Orientação a objetos | Não avaliado | Aguardando ementas e exercícios |
| Collections / generics | Não avaliado | Aguardando ementas e exercícios |
| Exceptions / debugging | Não avaliado | Aguardando ementas e exercícios |
| Git / GitHub | Bootstrap documental | Este repositório foi estruturado para registrar a evolução |
| Testes | Não avaliado | Será introduzido conforme a sequência pedagógica |
| SQL / persistência | Não avaliado | Será mapeado após as ementas |
| HTTP / REST / backend | Não avaliado | Será mapeado após as ementas |
| Spring / Spring Boot | Não avaliado | Será mapeado após as ementas |
| Docker / cloud / CI/CD | Não avaliado | Ponte futura com a experiência em infraestrutura |
| Observabilidade / produção | Não avaliado | Ponte futura com a experiência em infraestrutura |
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
| Primeiro checkpoint de módulo | Pendente | Depende das ementas e do início do curso |

## Projeto principal

O projeto principal ainda não foi definido. A escolha deve ser feita depois de analisar as ementas, os objetivos pedagógicos, o nível inicial e o caminho incremental mais adequado.

Quando definido, registrar aqui:

- problema de negócio;
- escopo atual;
- conceitos acumulados;
- estágio da implementação;
- evidências Git;
- evolução profissional planejada.

## Próximas ações

1. Receber as ementas completas dos cursos.
2. Analisar a sequência, dependências, lacunas e complementos.
3. Criar o `ROADMAP_JAVA_BACKEND_ENGINEER.md`.
4. Iniciar o primeiro módulo com exercícios, contexto profissional e registro de evidências.

As etapas de ementa e roadmap estão deliberadamente fora do bootstrap atual.
