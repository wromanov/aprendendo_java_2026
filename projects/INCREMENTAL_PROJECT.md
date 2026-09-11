# Projeto incremental — InfraTrack

```text
PROJECT_NAME = InfraTrack
PROJECT_NAME_STATUS = PROVISIONAL
PROJECT_STATUS = DOCUMENTED_NOT_STARTED
```

## Objetivo

Construir, ao longo da formação, uma plataforma de gestão operacional e inventário baseada em um domínio familiar ao mentorado. O projeto será um fio condutor de aprendizagem, não um compromisso de implementar tudo de uma vez.

## Domínio possível

Os conceitos abaixo são ideias futuras, não um modelo fechado:

`Asset`, `Server`, `Service`, `Incident`, `User`, `Maintenance`, `Tag` e `AuditEvent`.

O domínio poderá ser ajustado quando um requisito pedagógico ou real exigir. Nenhuma entidade, camada ou framework será criado antecipadamente apenas porque aparece nesta lista.

## Evolução planejada

```text
Java básico
→ CLI
→ métodos
→ organização
→ orientação a objetos
→ domínio
→ Collections
→ Exceptions
→ arquivos
→ testes
→ SQL/PostgreSQL
→ JDBC
→ Spring Boot
→ REST
→ JPA/Hibernate
→ Security
→ Docker
→ CI/CD
→ Cloud
→ Observability
→ sistema próximo de produção
```

Essa evolução é uma direção, não um calendário. Um incremento pode produzir uma feature, uma refatoração, mais robustez, testes ou apenas a aplicação consciente de um conceito.

## Evolução distribuída condicional

```text
DISTRIBUTED_EVOLUTION_CANDIDATE = YES
MICROSERVICE_DECOMPOSITION = CONDITIONAL
NOT_AUTOMATIC = YES
INFRATRACK_CONVERTED_TO_MICROSERVICES = NO
```

A quebra do InfraTrack em microsserviços não é garantida. Ela só ocorrerá se houver uma razão arquitetural e pedagógica concreta. O projeto pode permanecer um monólito modular se essa for a decisão tecnicamente superior; a evolução distribuída não deve ocorrer apenas para “usar microsserviços”.

## Regras de crescimento

- Começar com o menor problema útil para o módulo atual.
- Crescer organicamente a partir de requisitos observáveis.
- Não antecipar abstrações, camadas, microsserviços ou tecnologias.
- Fazer SQL antes de ORM e compreender Spring antes de reproduzir annotations.
- Registrar decisões, alternativas, trade-offs, testes e nível de assistência.
- Usar Git/GitHub como evidência de evolução, sem commit/push automático.
- Manter o projeto proporcional ao nível: uma CLI simples pode ser a solução correta.

## Protocolo de cada incremento

Antes de implementar, preencher e revisar:

```text
REQUISITO = O que o usuário ou a operação precisa?
CONCEITOS = Quais conceitos do módulo estão sendo exercitados?
MUNDO_REAL = Onde isso aparece em infraestrutura/backend?
HOJE = Qual é a solução mínima adequada ao nível atual?
MAIS_ADIANTE = Como essa solução poderá evoluir, sem implementar agora?
```

O incremento só é encerrado após tentativa, revisão, testes proporcionais, explicação do raciocínio e registro do que ficou para depois.

## Exemplos de marcos pedagógicos

1. CLI para cadastrar e consultar ativos, praticando tipos, controle de fluxo e métodos.
2. Modelagem de objetos e regras de domínio, praticando composição, encapsulamento e Collections.
3. Tratamento de entradas inválidas e persistência em arquivos, praticando exceptions e IO.
4. Testes unitários e retenção de regras antes de adicionar banco.
5. SQL/PostgreSQL e JDBC explícitos antes de introduzir JPA/Hibernate.
6. API REST com Spring Boot, validação, erros e testes de integração.
7. Segurança, Docker, CI/CD, cloud e observabilidade quando os fundamentos justificarem.

Esses marcos são exemplos de direção, não requisitos de implementação imediata nem promessa de escopo final.

## Evidências esperadas

Cada etapa deve apontar para código ou documentação no GitHub, requisitos, testes, decisões, revisão de código, `ASSISTANCE_LEVEL` e checkpoint. O projeto não substitui exercícios isolados, retenção ou desafios de transferência.

## Estado inicial

O InfraTrack está documentado, mas não iniciado. A próxima atividade oficial é iniciar o módulo Java 01 e escolher um incremento mínimo somente quando o conceito estiver pronto para ser aplicado.
