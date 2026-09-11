# COURSE ANALYSIS — Java → Backend Engineer

Este documento separa o que foi observado nas ementas do que é decisão da mentoria. A análise não altera os cursos nem transforma recomendações em conteúdo originalmente oferecido.

## A. SOURCE-DERIVED CONTENT

### Especialista Java AlgaWorks 2022

O curso possui 32 módulos, começando por plataforma/JVM e fundamentos e avançando por controle de fluxo, IntelliJ, orientação a objetos, Clean Code, wrappers, arrays, memória, construtores, pacotes, visibilidade, JavaBeans, records, herança, polimorfismo, interfaces, exceções, generics, Collections, enums, strings, números, APIs de data, classes aninhadas, lambdas, method references, `Optional`, Streams, IO, NIO.2, serialização, JAR/Maven e logging com Logback/SLF4J. A fonte também identifica aulas de depuração e desafios distribuídos ao longo da trilha.

### Especialista Spring REST AlgaWorks 2022

O curso possui 25 módulos, cobrindo introdução, Spring/DI, JPA/Hibernate, REST, Spring Data JPA, persistência avançada, pool/Flyway, erros, Bean Validation, testes de integração, boas práticas de APIs, modelagem, projeções/relatórios, arquivos, e-mail e eventos, CORS, cache HTTP, OpenAPI/Swagger UI/SpringFox, HATEOAS, versionamento, logging, Spring Security/OAuth2, JWT/controle de acesso, Docker e deploy em containers na AWS.

### Formação Decoder — Michelli Brito

A fonte disponível é uma ementa em imagens fornecida pelo mentorado. Ela sustenta o registro dos tópicos explicitamente observáveis no documento [da formação](FORMACAO_DECODER_MICROSERVICES_MICHELLI_BRITO.md), mas não confirma o ano/edição exatos nem versões, bibliotecas ou detalhes de implementação além do que está visível.

### Leitura factual conjunta

Os cursos fornecem uma sequência coerente de linguagem para backend e uma visão end-to-end de uma API. A existência de uma aula ou desafio é evidência de que o material o inclui, não de que o mentorado o domina.

## B. MENTOR ASSESSMENT / MODERNIZATION

### Pontos fortes

O curso Java é uma base forte para linguagem e engenharia: JVM, orientação a objetos, encapsulamento, composição, herança, interfaces, exceptions, generics, Collections, memória, números, data/hora, lambdas, `Optional`, Streams, IO/NIO, Maven e logging. A sequência permite construir vocabulário e raciocínio antes de frameworks.

O curso Spring é uma espinha dorsal profissional ampla: IoC/DI, Spring Boot, JPA/Hibernate, Spring Data, HTTP/REST, modelagem de APIs, erros, Bean Validation, integração, DTOs, transações, Flyway, cache, segurança, OAuth2, Docker e AWS. Ele ajuda a conectar código, persistência, API e operação.

`QueryDSL` não foi encontrado nas fontes fornecidas e, portanto, não é atribuído à ementa. Caso seja considerado futuramente, será um complemento da mentoria, sujeito a justificativa e verificação na etapa correspondente.

### Formação Decoder na sequência e reconciliação de lacunas

A Decoder não substitui Java nem Spring REST; entra depois do backend core como formação de sistemas distribuídos e microsserviços. `START_NOW = NO` e `READY_FOR_FIRST_APPLICATIONS_DOES_NOT_REQUIRE_DECODER = YES` permanecem explícitos.

Com base apenas nos tópicos observados, a formação cobre:

- sistemas distribuídos e microsserviços;
- comunicação síncrona e assíncrona;
- service discovery;
- API Gateway;
- load balancing;
- API Composition;
- comunicação baseada em mensagens e broker pattern;
- transação distribuída no recorte explicitamente observado;
- circuit breaker e retry;
- configuração distribuída;
- segurança distribuída;
- deploy de microsserviços.

Esses tópicos deixam de ser lacunas puras da análise, sem constituírem evidência de domínio. Permanecem como complementos ou lacunas a validar quando não há evidência suficiente: OpenTelemetry, observabilidade distribuída moderna, Kubernetes, idempotência, Kafka, RabbitMQ, tracing distribuído, estratégias modernas de deployment e system design mais amplo. `Broker Pattern` não é interpretado como prova de Kafka ou RabbitMQ.

### Complementos obrigatórios

Os cursos serão complementados, no momento pedagógico adequado, por:

- Git profissional desde o início e GitHub como evidência;
- JUnit e testes unitários antes de Spring;
- SQL e PostgreSQL antes de ORM, seguidos de JDBC;
- algoritmos, estruturas de dados e Big O;
- concorrência Java, Executors e virtual threads quando apropriado;
- annotations e reflection em nível conceitual;
- recursos modernos relevantes de Java;
- Testcontainers;
- GitHub Actions e CI/CD;
- Spring Boot Actuator, health checks, Micrometer e métricas;
- tracing e OpenTelemetry;
- Docker moderno e Kubernetes depois de Docker/cloud;
- Redis;
- aprofundamento de mensageria e integração orientada a eventos além do recorte observado;
- Kafka/RabbitMQ, sem inferi-los a partir de `Broker Pattern`;
- resiliência, timeouts, idempotência e consistência distribuída além dos tópicos observados;
- system design e observabilidade distribuída;
- inglês técnico e entrevistas.

Esses itens são avaliação e recomendação da mentoria, não módulos retroativamente atribuídos aos cursos.

### Modernização do curso Spring 2022 → stack atual

- **SpringFox:** tratar como legado; selecionar uma solução OpenAPI compatível com a versão adotada, como `springdoc-openapi` quando apropriado.
- **RestTemplate:** compreender e reconhecer em manutenção; para código novo, avaliar o cliente HTTP moderno disponível na stack Spring adotada.
- **RFC 7807 / Problem Details:** preservar o contexto histórico e utilizar a especificação e o suporte modernos vigentes na etapa.
- **OAuth2 Resource Owner Password Credentials:** tratar como legado e não usar em projeto novo.
- **Implicit Grant:** tratar como legado para aplicações novas.
- **Authorization Code + PKCE:** abordagem principal quando aplicável a clientes de usuário.
- **Client Credentials:** opção para comunicação machine-to-machine quando apropriado.
- **JWT e Spring Security:** usar APIs e arquitetura modernas da versão adotada, com escopo e ameaças explicitados.
- **AWS:** preservar conceitos de S3, RDS, ECS, Fargate, ECR, load balancer, TLS, security groups e secrets, atualizando console, serviços e procedimentos na execução.

Não congelar versões de Java, Spring ou bibliotecas nesta documentação. A versão concreta deve ser definida e verificada no início de cada etapa.

## Decisão de progressão

Java continua sendo a espinha dorsal. Antes de aprofundar Spring, a ponte obrigatória inclui Git intermediário, JUnit/testes unitários, SQL/PostgreSQL, modelagem relacional, JDBC, HTTP, annotations/reflection conceitual e concorrência básica. A regra de precedência é explícita: **SQL antes de ORM** e compreensão dos mecanismos do Spring antes de copiar annotations.

## Riscos pedagógicos controlados

O principal risco é confundir cobertura de tópicos com domínio. Outro é importar diretamente práticas de 2022 para uma stack atual. Checkpoints, exercícios sem dependência permanente da IA, testes de retenção e desafios de transferência serão usados para verificar compreensão, autonomia e aplicabilidade profissional.
