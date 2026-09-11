# ROADMAP JAVA → BACKEND ENGINEER

> Mapa de competências e evidências. A referência de aproximadamente 12 meses é apenas orientação; não há calendário rígido e nenhum avanço é aprovado sem evidência.

## 1. Objetivo profissional

Formar um Backend Java Engineer capaz de compreender um problema, modelar uma solução, implementar, testar, depurar, operar e explicar decisões em sistemas reais. A experiência prévia em infraestrutura será convertida em vantagem operacional, sem pular fundamentos de programação.

## 2. Princípios de progressão

- Java é a linguagem principal e o curso é a espinha dorsal.
- A progressão segue conceito → prática → consolidação → complemento profissional.
- SQL vem antes de ORM; Spring deve ser compreendido antes de copiar annotations.
- Git/GitHub, testes, retenção, transferência e autonomia são parte da formação.
- Complexidade é introduzida por necessidade, não por prestígio.
- Checkpoints históricos registram evidência, assistência, dívida pedagógica e prontidão.
- Versões concretas de Java, Spring e bibliotecas serão verificadas no início da etapa correspondente.

## 3. Visão macro

```text
Java M01–M32 → engenharia de software → ponte para backend
→ SQL/PostgreSQL → JDBC → HTTP/REST → Spring profissional
→ testes → Docker/cloud → observabilidade → sistemas distribuídos
→ portfólio, empregabilidade, inglês técnico e entrevistas
```

## 4. Fundação Java

A fundação percorre os 32 módulos do curso Especialista Java, com exercícios próprios, depuração, revisão e checkpoints. A conclusão de uma aula não equivale a domínio; o critério é conseguir explicar, transferir e usar o conceito com assistência proporcional.

## 5. Engenharia de software

Desde o início entram nomenclatura, coesão, acoplamento, responsabilidade, refatoração, Clean Code, SOLID quando aplicável, KISS, YAGNI, debugging, logs, documentação, Git e revisão. Design patterns só entram quando resolvem um problema concreto.

## 6. Mapeamento dos 32 módulos Java

| Fase | Módulos | Foco de competência |
| --- | --- | --- |
| 1 | M01–M04 | plataforma, fundamentos, controle de fluxo, IntelliJ e debugging |
| 2 | M05–M06 | orientação a objetos, composição, métodos, Clean Code e Effective Java |
| 3 | M07–M11 | wrappers, arrays, memória, construtores, pacotes, visibilidade, JavaBeans e records |
| 4 | M12–M15 | herança, polimorfismo, abstração, interfaces e boas práticas |
| 5 | M16–M19 | exceções, generics, Collections e enumerações |
| 6 | M20–M23 | strings, números, APIs legadas de data e DateTime moderna |
| 7 | M24–M27 | classes aninhadas, lambdas, method references, Optional e Streams |
| 8 | M28–M32 | IO, NIO.2, serialização, JAR/Maven e logging |

## 7. Ponte Java → Backend

Antes de aprofundar Spring: Git intermediário; JUnit; testes unitários; SQL; PostgreSQL; modelagem relacional; JDBC; HTTP; JSON; annotations; reflection conceitual; concorrência básica; `ExecutorService`; e virtual threads quando adequadas ao caso. A ponte deve produzir pequenas evidências no projeto incremental.

## 8. Banco de dados

Aprender modelo relacional, chaves, cardinalidade, normalização, índices, transações, isolamento, constraints, agregações, joins, paginação e análise de planos em PostgreSQL. O objetivo é raciocinar sobre dados antes de delegar decisões ao ORM.

## 9. SQL → JDBC → ORM

Sequência obrigatória: SQL manual e modelagem → acesso explícito com JDBC → persistência com JPA/Hibernate e Spring Data. Cada camada deve ser comparada em responsabilidade, custo, abstração, debugging e trade-offs.

## 10. Backend e HTTP

HTTP, métodos, status, headers, cache, content negotiation, JSON, idempotência, autenticação, autorização, REST, erros e contratos precedem a construção de APIs completas. A experiência de redes, Linux e troubleshooting será usada para conectar protocolo e operação.

## 11. Mapeamento dos 25 módulos Spring

| Bloco | Módulos | Resultado esperado |
| --- | --- | --- |
| Foundation | M01–M02 | contexto, Spring Boot, IoC, DI, configuração e profiles |
| Persistência | M03, M05–M07 | JPA/Hibernate, Spring Data, relacionamentos, transações, Flyway e pool |
| REST | M04 | controllers, recursos, HTTP e contrato de API |
| API profissional | M08–M13 | erros, validação, testes, boas práticas, modelagem, projeções e relatórios |
| Integrações | M14–M17 | arquivos, eventos/e-mail, CORS, clientes e cache HTTP |
| Documentação/evolução | M18–M21 | OpenAPI, HATEOAS, versionamento e logging |
| Segurança | M22–M23 | Spring Security, OAuth2, JWT e controle de acesso |
| Produção | M24–M25 | Docker, containers e deploy cloud |

## 12. Modernização 2022 → stack atual

SpringFox será tratado como legado; para APIs novas, avaliar OpenAPI moderno compatível. `RestTemplate` será reconhecido em manutenção, enquanto código novo avaliará o cliente HTTP moderno da stack. Problem Details será usado conforme suporte vigente. Resource Owner Password Credentials e Implicit Grant não serão escolhas para projetos novos; Authorization Code + PKCE e Client Credentials serão escolhidos conforme o cenário. APIs de Spring Security, imagens Docker e procedimentos AWS serão verificados no início da etapa.

## 13. Testes

JUnit e testes unitários entram antes de Spring. A sequência evolui por assertions e Arrange/Act/Assert, parametrização, doubles/Mockito quando necessário, integração, Testcontainers e testes de API. Teste deve revelar comportamento e permitir refatorar com segurança, não apenas aumentar cobertura.

## 14. Projeto incremental

O projeto pedagógico é o InfraTrack, documentado em [projects/INCREMENTAL_PROJECT.md](../projects/INCREMENTAL_PROJECT.md). Cada incremento pode gerar feature, refatoração, robustez, testes ou aplicação de um conceito; não é permitido antecipar arquitetura sem requisito.

## 15. Git/GitHub

Git é praticado desde a primeira atividade: commits pequenos e explicáveis, branches quando fizer sentido, revisão, histórico, issues/README e GitHub como evidência. Commit e push não são automáticos; cada mudança segue autorização explícita.

## 16. Produção

Aprender a diferença entre “funciona no meu computador” e “está pronto para operar”: configuração, ambientes, logs, métricas, health checks, secrets, segurança, performance, resiliência, deployment, containers, monitoramento e observabilidade. A experiência em infraestrutura deve ser aplicada criticamente, não usada para pular fundamentos.

## 17. Docker

Imagens, camadas, volumes, redes, Docker Compose, configuração externa, segurança de imagens, limites e health checks serão praticados antes de orquestração. O objetivo é empacotar e operar uma aplicação compreendendo seus custos.

## 18. Cloud

Depois de Docker: compute, storage, bancos, redes, IAM, TLS, secrets, load balancers, containers e deployment. AWS é referência possível; consoles, serviços e preços serão verificados na época de uso.

## 19. Observabilidade

Logs estruturados, correlação, métricas com Actuator/Micrometer, health/readiness checks, tracing e OpenTelemetry entram como ferramentas para responder perguntas operacionais. Observabilidade não é apenas instalar agentes; é produzir sinais úteis e acionáveis.

## 20. Sistemas distribuídos

Somente após fundamentos e operação: comunicação síncrona/assíncrona, filas, Kafka/RabbitMQ, Redis, consistência, retries, timeouts, circuit breakers, idempotência, resiliência e observabilidade distribuída. A complexidade precisa ser justificada pelo problema.

## 21. Algoritmos/estruturas de dados

Praticar decomposição, arrays, listas, mapas, conjuntos, pilhas, filas, árvores conforme necessário, busca/ordenação e Big O. Os exercícios devem alternar implementação, análise e transferência para domínios como estoque, logs e pedidos.

## 22. Inglês técnico

Ler documentação, erros, changelogs, issues e especificações; explicar decisões técnicas em inglês gradualmente; construir vocabulário para trabalho remoto e internacional.

## 23. Entrevistas

Preparar fundamentos Java, OO, Collections, exceptions, concorrência, SQL, HTTP, testes, Spring, debugging, system design e comportamento. Simulações só contam como evidência quando a resposta for explicada e transferível.

## 24. Portfólio

Projetos devem mostrar evolução, README, decisões, testes, execução, dados, segurança, observabilidade e limites conhecidos. Um CRUD sem explicação não basta; o histórico Git e os checkpoints fazem parte da evidência.

## 25. Empregabilidade

Avaliar prontidão por fundamentos, autonomia, capacidade de implementar e explicar, projetos, Git, SQL, testes, debugging, Java, backend e Spring. Não usar quantidade de meses, aulas concluídas ou uso de framework como atalho para declarar prontidão.

## 26. Checkpoints

Usar [CHECKPOINT_TEMPLATE.md](../checkpoints/CHECKPOINT_TEMPLATE.md) em checkpoints de módulo, retenção, transferência, projeto e carreira. Registrar fatos versus inferências, `ASSISTANCE_LEVEL`, `CONFIDENCE`, `PEDAGOGICAL_DEBT`, retenção e transferência sem apagar histórico.

## 27. Critérios de avanço

Avançar quando houver evidência proporcional de compreensão conceitual, implementação, debugging, explicação, retenção e transferência. Uma solução correta com assistência 6 não equivale à mesma solução com assistência 0. Dívida moderada ou alta precisa de plano antes de criar dependências perigosas.

## 28. READY_FOR_FIRST_APPLICATIONS

```text
READY_FOR_FIRST_APPLICATIONS = NO | CONDITIONAL | YES
```

No estado inicial é `NO`. A mudança exigirá evidências acumuladas de fundamentos, autonomia, projeto demonstrável, Git, SQL, testes, debugging, Java/backend/Spring e capacidade de explicar decisões. Não exige saber tudo nem perfeição.

## 29. Próxima atividade oficial

**Iniciar o módulo Java 01 — Plataforma Java e ambiente de desenvolvimento**, com leitura orientada, prática sem dependência permanente da IA, registro Git e o primeiro checkpoint quando houver evidência suficiente.
