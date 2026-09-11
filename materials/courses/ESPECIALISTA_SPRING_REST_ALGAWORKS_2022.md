# Especialista Spring REST — AlgaWorks (2022)

```text
COURSE_ROLE = BACKEND_PROFESSIONAL_SPINE
COURSE_STATUS = APPROVED_WITH_MODERNIZATION
SOURCE_YEAR = 2022
LESSON_COUNT = 567
```

## Papel na jornada

Este documento registra exclusivamente a estrutura de módulos e aulas encontrada nas fontes fornecidas. O curso é a espinha dorsal profissional de backend, mas a presença de uma aula não significa conclusão ou domínio. Modernizações e recomendações ficam fora desta transcrição factual.

## Módulos e aulas

### 01 — Introdução (5 aulas)

- 1 Introdução ao treinamento 5m 43s
- 2 Como usar o suporte da AlgaWorks 12m 38s
- 3 Por que desenvolver REST APIs? 19m 40s
- 4 Conhecendo o modelo de domínio do projeto do curso 7m 40s
- 5 Preparando o ambiente de desenvolvimento: JDK e STS for Eclipse 7m 36s

### 02 — Spring e Injeção de Dependências (28 aulas)

- 1 Por que aprender e usar Spring? 6m 57s
- 2 Conhecendo o ecossistema Spring 9m 15s
- 3 Spring vs Jakarta EE (Java EE) 9m 29s
- 4 Conhecendo o Spring Boot 6m 9s
- 5 Criando um projeto Spring Boot com Spring Initializr 13m 57s
- 6 Conhecendo o Maven e o pom.xml de um projeto Spring Boot 24m 26s
- 7 Criando um controller com Spring MVC 4m 36s
- 8 Restart mais rápido da aplicação com DevTools 4m 1s
- 9 O que é injeção de dependências? 24m 57s
- 10 Conhecendo o IoC Container do Spring 2m 42s
- 11 Definindo beans com @Component 9m 14s
- 12 Injetando dependências (beans Spring) 14m 57s
- 13 Usando @Configuration e @Bean para definir beans 15m 15s
- 14 Conhecendo os pontos de injeção e a anotação @Autowired 7m 55s
- 15 Dependência opcional com @Autowired 2m 52s
- 16 Ambiguidade de beans e injeção de lista de beans 5m 25s
- 17 Desambiguação de beans com @Primary 2m 29s
- 18 Desambiguação de beans com @Qualifier 5m 22s
- 19 Desambiguação de beans com anotação customizada 6m 30s
- 20 Mudando o comportamento da aplicação com Spring Profiles 11m 17s
- 21 Criando métodos de callback do ciclo de vida dos beans 8m 39s
- 22 Publicando e consumindo eventos customizados 13m 30s
- 23 Configurando projetos Spring Boot com o application.properties 4m 28s
- 24 Substituindo propriedades via linha de comando e variáveis de ambiente 4m 17s
- 25 Criando e acessando propriedades customizadas com @Value 4m 18s
- 26 Acessando propriedades com @ConfigurationProperties 7m 35s
- 27 Alterando a configuração do projeto dependendo do ambiente (com Spring Profiles) 8m 50s
- 28 Ativando o Spring Profile por linha de comando e variável de ambiente 3m 53s

### 03 — Introdução ao JPA e Hibernate (20 aulas)

- 1 Instalando o MySQL Server e MySQL Workbench 5m 1s
- 2 O que é JPA e Hibernate? 17m 33s
- 3 Adicionando JPA e configurando o Data Source 14m 26s
- 4 Mapeando entidades com JPA 11m 20s
- 5 Criando as tabelas do banco a partir das entidades 6m 50s
- 6 Mapeando o id da entidade para autoincremento 2m 51s
- 7 Importando dados de teste com import.sql 1m 57s
- 8 Consultando objetos do banco de dados 15m 41s
- 9 Adicionando um objeto no banco de dados 6m 53s
- 10 Buscando um objeto pelo id no banco de dados 2m 28s
- 11 Atualizando um objeto no banco de dados 3m 21s
- 12 Excluindo um objeto do banco de dados 5m 40s
- 13 Conhecendo o padrão Aggregate do DDD 9m 13s
- 14 Conhecendo e implementando o padrão Repository 14m 31s
- 15 Conhecendo e usando o Lombok 11m 29s
- 16 Desafio: Lombok e repositório de restaurantes 2m 36s
- 17 Mapeando relacionamento com @ManyToOne 11m 47s
- 18 A anotação @JoinColumn 2m 38s
- 19 Propriedade nullable de @Column e @JoinColumn 3m 2s
- 20 Desafio: mapeando entidades 3m 8s

### 04 — REST com Spring (39 aulas)

- 1 O que é REST? 4m 18s
- 2 Conhecendo as constraints do REST 6m 28s
- 3 Diferença entre REST e RESTful 1m 43s
- 4 Desenvolvedores de REST APIs puristas e pragmáticos 2m 32s
- 5 Conhecendo o protocolo HTTP 5m 21s
- 6 Usando o protocolo HTTP 13m 29s
- 7 Instalando e testando o Postman 7m 2s
- 8 Entendendo o que são Recursos REST 1m 24s
- 9 Identificando recursos REST 4m 33s
- 10 Modelando e requisitando um Collection Resource com GET 12m 3s
- 11 Desafio: collection resource de estados 0m 38s
- 12 Representações de recursos e content negotiation 3m 26s
- 13 Implementando content negotiation para retornar JSON ou XML 12m 5s
- 14 Consultando Singleton Resource com GET e @PathVariable 6m 48s
- 15 Customizando as representações XML e JSON com @JsonIgnore, @JsonProperty e @JsonRootName 8m 54s
- 16 Customizando a representação em XML com Wrapper e anotações do Jackson 12m 13s
- 17 Conhecendo os métodos HTTP 9m 7s
- 18 Conhecendo os códigos de status HTTP 8m 14s
- 19 Definindo o status da resposta HTTP com @ResponseStatus 1m 47s
- 20 Manipulando a resposta HTTP com ResponseEntity 10m 10s
- 21 Corrigindo o Status HTTP para resource inexistente 4m 46s
- 22 Status HTTP para collection resource vazia: qual usar? 3m 36s
- 23 Modelando e implementando a inclusão de recursos com POST 12m 7s
- 24 Negociando o media type do payload do POST com Content-Type 3m 55s
- 25 Modelando e implementando a atualização de recursos com PUT 13m 31s
- 26 Modelando e implementando a exclusão de recursos com DELETE 11m 1s
- 27 Implementando a camada de domain services (e a importância da linguagem ubíqua) 11m 3s
- 28 Refatorando a exclusão de cozinhas para usar domain services 16m 7s
- 29 Desafio: modelando e implementando a consulta de recursos de restaurantes 3m 45s
- 30 Modelando e implementando a inclusão de recursos de restaurantes 21m 56s
- 31 Desafio: Modelando e implementando a atualização de recursos de restaurantes 3m 0s
- 32 Desafio: implementando serviços REST de cidades e estados 5m 28s
- 33 Analisando solução para atualização parcial de recursos com PATCH 15m 47s
- 34 Finalizando a atualização parcial com a API de Reflections do Spring 18m 7s
- 35 Introdução ao Modelo de Maturidade de Richardson (RMM) 2m 37s
- 36 Conhecendo o nível 0 do RMM 3m 46s
- 37 Conhecendo o nível 1 do RMM 1m 43s
- 38 Conhecendo o nível 2 do RMM 2m 43s
- 39 Conhecendo o nível 3 do RMM 9m 34s

### 05 — Spring Data JPA (20 aulas)

- 1 Implementando consultas JPQL em repositórios 11m 39s
- 2 Conhecendo o projeto Spring Data JPA (SDJ) 3m 4s
- 3 Criando um repositório com Spring Data JPA (SDJ) 10m 12s
- 4 Refatorando o código do projeto para usar o repositório do SDJ 10m 45s
- 5 Desafio: refatorando todos os repositórios para usar SDJ 1m 45s
- 6 Criando consultas com query methods 10m 26s
- 7 Usando as keywords para definir critérios de query methods 11m 54s
- 8 Conhecendo os prefixos de query methods 12m 0s
- 9 Usando queries JPQL customizadas com @Query 5m 7s
- 10 Externalizando consultas JPQL para um arquivo XML 5m 59s
- 11 Implementando um repositório SDJ customizado 16m 24s
- 12 Implementando uma consulta dinâmica com JPQL 12m 3s
- 13 Implementando uma consulta simples com Criteria API 9m 9s
- 14 Adicionando restrições na cláusula where com Criteria API 7m 8s
- 15 Tornando a consulta com Criteria API com filtros dinâmicos 6m 4s
- 16 Conhecendo o uso do padrão Specifications (DDD) com SDJ 7m 54s
- 17 Implementando Specifications com SDJ 8m 59s
- 18 Criando uma fábrica de Specifications 7m 14s
- 19 Injetando o próprio repositório na implementação customizada e a anotação @Lazy 8m 54s
- 20 Estendendo o JpaRepository para customizar o repositório base 15m 51s

### 06 — Explorando mais do JPA e Hibernate (14 aulas)

- 1 Mapeando relacionamento bidirecional com @OneToMany 19m 14s
- 2 Mapeando relacionamento muitos-para-muitos com @ManyToMany 11m 27s
- 3 Analisando o impacto do relacionamento muitos-para-muitos na REST API 11m 21s
- 4 Mapeando classes incorporáveis com @Embedded e @Embeddable 8m 17s
- 5 Testando e analisando o impacto da incorporação de classe na REST API 8m 20s
- 6 Mapeando propriedades com @CreationTimestamp e @UpdateTimestamp 15m 7s
- 7 Desafio: mapeando relacionamento muitos-para-um 1m 35s
- 8 Desafio: mapeando relacionamento um-para-muitos 1m 30s
- 9 Desafio: mapeando relacionamentos muitos-para-muitos 5m 36s
- 10 Entendendo o Eager Loading 18m 58s
- 11 Entendendo o Lazy Loading 13m 16s
- 12 Alterando a estratégia de fetching para Lazy Loading 16m 39s
- 13 Alterando a estratégia de fetching para Eager Loading 2m 31s
- 14 Resolvendo o Problema do N+1 com fetch join na JPQL 7m 52s

### 07 — Pool de conexões e Flyway (12 aulas)

- 1 Entendendo o funcionamento de um pool de conexões 17m 53s
- 2 Conhecendo o Hikari: a solução padrão de pool de conexões no Spring Boot 10m 18s
- 3 Configurando o pool de conexões do Hikari 8m 56s
- 4 Schema generation em produção não é uma boa prática 10m 1s
- 5 Flyway: ferramenta de versionamento de schemas de banco de dados 20m 39s
- 6 Adicionando o Flyway no projeto e criando a primeira migração 19m 6s
- 7 Evoluindo o banco de dados com novas migrações 14m 19s
- 8 Criando migrações complexas com remanejamento de dados 20m 13s
- 9 Criando migração a partir de DDL gerado por schema generation 8m 44s
- 10 Adicionando dados de testes com callback do Flyway 20m 38s
- 11 Reparando migrações com erros 12m 15s
- 12 Desafio: Criando migrações e mapeando as entidades Pedido e ItemPedido 5m 20s

### 08 — Tratamento e modelagem de erros da API (29 aulas)

- 1 Introdução ao tratamento e modelagem de erros 1m 34s
- 2 Lançando exceções customizadas anotadas com @ResponseStatus 9m 37s
- 3 Lançando exceções do tipo ResponseStatusException 6m 50s
- 4 Estendendo ResponseStatusException 8m 9s
- 5 Simplificando o código com o uso de @ResponseStatus em exceptions 11m 43s
- 6 Desafio: refatorando os serviços REST 1m 34s
- 7 Analisando os impactos da refatoração 8m 13s
- 8 Criando a exception NegocioException 11m 54s
- 9 Desafio: usando a exception NegocioException 0m 51s
- 10 Afinando a granularidade e definindo a hierarquia das exceptions de negócios 19m 51s
- 11 Desafio: lançando exceptions de granularidade fina 1m 39s
- 12 Tratando exceções em nível de controlador com @ExceptionHandler 11m 49s
- 13 Tratando exceções globais com @ExceptionHandler e @ControllerAdvice 6m 9s
- 14 Desafio: implementando exception handler 2m 17s
- 15 Criando um exception handler global com ResponseEntityExceptionHandler 6m 13s
- 16 Customizando o corpo da resposta padrão de ResponseEntityExceptionHandler 11m 15s
- 17 Conhecendo a RFC 7807 (Problem Details for HTTP APIs) 11m 12s
- 18 Padronizando o formato de problemas no corpo de respostas com a RFC 7807 23m 3s
- 19 Desafio: usando o formato de problemas no corpo de respostas 1m 38s
- 20 Customizando exception handlers de ResponseEntityExceptionHandler 6m 30s
- 21 Tratando a exception InvalidFormatException na desserialização 18m 25s
- 22 Habilitando erros na desserialização de propriedades inexistentes ou ignoradas 6m 38s
- 23 Desafio: tratando a PropertyBindingException na desserialização 3m 22s
- 24 Lançando exception de desserialização na atualização parcial (PATCH) 13m 46s
- 25 Desafio: tratando exception de parâmetro de URL inválido 3m 12s
- 26 Desafio: tratando a exceção NoHandlerFoundException 5m 34s
- 27 Desafio: tratando outras exceções não capturadas 2m 22s
- 28 Estendendo o formato do problema para adicionar novas propriedades 10m 22s
- 29 Desafio: estendendo o formato do problema 3m 11s

### 09 — Validações com Bean Validation (20 aulas)

- 1 Validação do modelo com Bean Validation 1m 51s
- 2 Adicionando constraints e validando no controller com @Valid 8m 0s
- 3 Desafio: tratando exception de violação de constraints de validação 1m 24s
- 4 Estendendo o Problem Details para adicionar as propriedades com constraints violadas 8m 34s
- 5 Conhecendo e adicionando mais constraints de validação no modelo 8m 31s
- 6 Validando as associações de uma entidade em cascata 4m 44s
- 7 Agrupando e restringindo constraints que devem ser usadas na validação 13m 53s
- 8 Convertendo grupos de constraints para validação em cascata com @ConvertGroup 7m 25s
- 9 Desafio: adicionando constraints de validação no modelo 1m 58s
- 10 Customizando mensagens de validação na anotação da constraint 1m 41s
- 11 Customizando e resolvendo mensagens de validação globais em Resource Bundle 17m 35s
- 12 Desafio: customizando mensagens de validação 0m 44s
- 13 Resolvendo mensagens de validação com Resource Bundle do Bean Validation 11m 51s
- 14 Usando o Resource Bundle do Spring como Resource Bundle do Bean Validation 7m 29s
- 15 Criando constraints de validação customizadas usando composição 14m 13s
- 16 Criando constraints de validação customizadas com implementação de ConstraintValidator 15m 7s
- 17 Criando constraints de validação customizadas em nível de classe 25m 58s
- 18 Ajustando Exception Handler para adicionar mensagens de validação em nível de classe 11m 30s
- 19 Executando processo de validação programaticamente 11m 50s
- 20 Desafio: tratando a exception customizada de validações programáticas 3m 7s

### 10 — Testes de integração (17 aulas)

- 1 Introdução aos Testes de Integração e Testes de APIs 2m 16s
- 2 Preparando o projeto para testes de integração 7m 18s
- 3 Criando e rodando um teste de integração com Spring Boot, JUnit e AssertJ 14m 24s
- 4 Escrevendo bons nomes de testes 6m 15s
- 5 Desafio: escrevendo testes de integração 0m 50s
- 6 Rodando os testes pelo Maven 5m 16s
- 7 Configurando Maven Failsafe Plugin no projeto 5m 17s
- 8 Implementando Testes de API com REST Assured e validando o código de status HTTP 14m 28s
- 9 Validando o corpo da resposta HTTP 7m 16s
- 10 Criando um método para fazer setup dos testes 2m 35s
- 11 Entendendo o problema da ordem de execução dos testes 4m 36s
- 12 Voltando o estado inicial do banco de dados para cada execução de teste com callback do Flyway 4m 13s
- 13 Configurando um banco de testes e usando @TestPropertySource 8m 57s
- 14 Limpando e populando o banco de dados de teste 6m 44s
- 15 Testando endpoint passando parâmetro de URL 5m 16s
- 16 Desafio: refatorando o código de testes 6m 4s
- 17 Desafio: escrevendo testes de API 2m 22s

### 11 — Boas práticas e técnicas para APIs (21 aulas)

- 1 Analisando e definindo melhor o escopo das transações 5m 49s
- 2 Refinando o payload de cadastro com @JsonIgnoreProperties 8m 46s
- 3 Criando classes de mixin para usar as anotações do Jackson 8m 8s
- 4 Desafio: usando @JsonIgnoreProperties e Jackson Mixin 1m 34s
- 5 Antes de estudar sobre data/hora: relembrando as aulas de geografia e entendendo os fusos horários 10m 2s
- 6 Boas práticas para trabalhar com data e hora em REST APIs 9m 11s
- 7 Configurando e refatorando o projeto para usar UTC 20m 40s
- 8 Desafio: refatorando o código para usar OffsetDateTime 0m 58s
- 9 Isolando o Domain Model do Representation Model com o padrão DTO 18m 17s
- 10 Implementando a conversão de entidade para DTO 10m 26s
- 11 Criando DTOs para entrada de dados na API 22m 30s
- 12 Refatorando e criando um assembler de DTO 5m 25s
- 13 Desafio: Refatorando e criando um disassembler do DTO 1m 27s
- 14 Adicionando e usando o ModelMapper 8m 2s
- 15 Entendendo a estratégia padrão do ModelMapper para correspondência de propriedades 13m 13s
- 16 Customizando o mapeamento de propriedades com ModelMapper 3m 20s
- 17 Mapeando para uma instância destino (e não um tipo) com ModelMapper 8m 35s
- 18 Revisando e ajustando as mensagens de validação com o uso de DTOs 2m 2s
- 19 Estratégias de nomes de propriedades: snake case vs lower camel case 4m 24s
- 20 Desafio: usando DTOs como representation model 1m 40s
- 21 Corrigindo bug de tratamento de exception de integridade de dados com flush do JPA 10m 32s

### 12 — Modelagem avançada e implementação da API (25 aulas)

- 1 Modelando sub-recursos para relacionamentos 8m 28s
- 2 Granularidade de recursos: Chatty vs Chunky APIs 5m 1s
- 3 Modelando conceitos abstratos de negócio e ações não-CRUD como recursos 12m 35s
- 4 Implementando os endpoints de ativação e inativação de restaurantes 16m 38s
- 5 Desafio: implementando os endpoints de formas de pagamento 1m 28s
- 6 Adicionando endereço no modelo da representação do recurso de restaurante 14m 40s
- 7 Refatorando serviço de cadastro de restaurante para incluir endereço 18m 27s
- 8 Desafio: implementando os endpoints de grupos 3m 39s
- 9 Desafio: implementando os endpoints de usuarios 5m 28s
- 10 Um pouco mais sobre JPA: objeto alterado fora da transação é sincronizado com o banco de dados 14m 36s
- 11 Implementando regra de negócio para evitar usuários com e-mails duplicados 14m 15s
- 12 Implementando os endpoints de associação de formas de pagamento em restaurantes 23m 43s
- 13 Desafio: implementando os endpoints de produtos 7m 13s
- 14 Desafio: Implementando os endpoints de abertura e fechamento de restaurantes 5m 17s
- 15 Desafio: implementando os endpoints de associação de grupos com permissões 4m 50s
- 16 Desafio: implementando os endpoints de associação de usuários com grupos 3m 2s
- 17 Desafio: implementando endpoints de associação de usuários responsáveis com restaurantes 4m 56s
- 18 Implementando ativação e inativação em massa de restaurantes 11m 16s
- 19 Desafio: Implementando os endpoints de consulta de pedidos 6m 41s
- 20 Otimizando a query de pedidos e retornando model resumido na listagem 12m 51s
- 21 Desafio: Implementando o endpoint de emissão de pedidos 14m 13s
- 22 Implementando endpoint de transição de status de pedidos 19m 38s
- 23 Desafio: implementando endpoints de transição de status de pedidos 0m 41s
- 24 Refatorando o código de regras para transição de status de pedidos 15m 35s
- 25 Usando IDs vs UUIDs nas URIs de recursos 22m 27s

### 13 — Modelagem de projeções, pesquisas e relatórios (20 aulas)

- 1 Fazendo projeção de recursos com @JsonView do Jackson 20m 4s
- 2 Limitando os campos retornados pela API com @JsonFilter do Jackson 16m 33s
- 3 Limitando os campos retornados pela API com Squiggly 16m 11s
- 4 Implementando pesquisas simples na API 7m 13s
- 5 Modelando pesquisas complexas na API 14m 53s
- 6 Implementando pesquisas complexas na API 19m 12s
- 7 Tratando BindException ao enviar parâmetros de URL inválidos 10m 46s
- 8 Implementando paginação e ordenação em recursos de coleção da API 18m 12s
- 9 Desafio: implementando paginação e ordenação de pedidos 5m 12s
- 10 Implementando JsonSerializer para customizar representação de paginação 9m 27s
- 11 Implementando um conversor de propriedades de ordenação 26m 44s
- 12 Modelando endpoints de consultas com dados agregados (ideal para gráficos e dashboards) 6m 5s
- 13 Discutindo sobre onde implementar as consultas com dados agregados 18m 30s
- 14 Implementando consulta com dados agregados de vendas diárias 16m 19s
- 15 Desafio: adicionando os filtros na consulta de vendas diárias 3m 58s
- 16 Tratando time offset na agregação de vendas diárias por data 12m 20s
- 17 Conhecendo o JasperSoft Studio 8m 38s
- 18 Criando um layout do relatório JasperReports de vendas diárias 22m 13s
- 19 Estruturando endpoint e serviço de emissão de relatório em PDF 17m 51s
- 20 Preenchendo um relatório JasperReports com JavaBeans e gerando bytes do PDF 16m 7s

### 14 — Upload e download de arquivos (26 aulas)

- 1 Conhecendo soluções para upload de arquivos em REST APIs 15m 38s
- 2 Implementando upload de arquivo com multipart/form-data 16m 4s
- 3 Validando o tamanho máximo do arquivo 15m 4s
- 4 Desafio: Validando o content type do arquivo 2m 31s
- 5 Mapeando entidade FotoProduto e relacionamento um-para-um 8m 52s
- 6 Implementando serviço de cadastro de foto de produto 14m 40s
- 7 Excluindo e substituindo cadastro de foto de produto 8m 16s
- 8 Implementando o serviço de armazenagem de fotos no disco local 17m 16s
- 9 Integrando o serviço de catálogo de fotos com o serviço de armazenagem 15m 21s
- 10 Implementando a remoção e substituição de arquivos de fotos no serviço de armazenagem 7m 50s
- 11 Desafio: Implementando recuperação de foto no serviço de armazenagem 1m 3s
- 12 Desafio: Implementando endpoint de consulta de foto de produto 1m 31s
- 13 Servindo arquivos de fotos pela API 9m 20s
- 14 Checando media type ao servir arquivos de fotos 12m 56s
- 15 Desafio: implementando endpoint de exclusão de foto de produto 0m 48s
- 16 Corrigindo exception handler de media type não aceita 8m 1s
- 17 Amazon S3: conhecendo o serviço de storage da AWS 8m 46s
- 18 Criando usuário com permissões para adicionar objetos na Amazon S3 6m 51s
- 19 Criando chaves de acesso para a API da AWS 2m 57s
- 20 Criando bean de propriedades de configuração dos serviços de storage 15m 2s
- 21 Adicionando o SDK Java da Amazon S3 no projeto e criando classe do serviço de storage 3m 37s
- 22 Definindo bean do client da Amazon S3 e configurando credenciais 7m 1s
- 23 Implementando a inclusão de objetos no bucket da Amazon S3 13m 31s
- 24 Desafio: Implementando a exclusão de objetos do bucket da Amazon S3 1m 23s
- 25 Implementando a recuperação de foto no serviço de storage do S3 16m 16s
- 26 Selecionando a implementação do serviço de storage de fotos 6m 14s

### 15 — E-mails transacionais e Domain Events (14 aulas)

- 1 Conhecendo soluções para envio de e-mails transacionais 6m 0s
- 2 Configurando o projeto para envio de e-mails usando servidor SMTP 6m 13s
- 3 Implementando o serviço de infraestrutura de envio de e-mails com Spring 10m 48s
- 4 Usando o serviço de envio de e-mails na confirmação de pedidos 7m 16s
- 5 Processando template do corpo de e-mails com Apache FreeMarker 14m 31s
- 6 Melhorando o texto do e-mail com FTL (FreeMarker Template Language) 10m 37s
- 7 Formatando valores monetários com FTL 4m 14s
- 8 Desafio: implementando serviço de envio de e-mail fake 5m 3s
- 9 Desafio: Implementando serviço de envio de e-mail sandbox 4m 36s
- 10 Conhecendo o padrão Domain Events do DDD 14m 9s
- 11 Publicando Domain Events a partir do Aggregate Root 9m 53s
- 12 Observando e reagindo a Domain Events 9m 57s
- 13 Reagindo a Domain Events em fases específicas da transação 6m 59s
- 14 Desafio: enviando e-mails no cancelamento de pedidos 1m 12s

### 16 — CORS e consumo da API (12 aulas)

- 1 Implementando uma chamada na REST API com JavaScript 6m 6s
- 2 Testando a requisição na API com JavaScript e entendendo a Same Origin Policy 12m 50s
- 3 Entendendo o funcionamento básico de CORS e habilitando na API 9m 36s
- 4 Habilitando CORS em controladores e métodos com @CrossOrigin 5m 53s
- 5 Entendendo o funcionamento de preflight do CORS 15m 7s
- 6 Habilitando CORS globalmente no projeto da API 5m 15s
- 7 Desafio: implementando uma requisição GET com JavaScript 1m 53s
- 8 Implementando um formulário de cadastro e fazendo requisição POST com JavaScript 9m 22s
- 9 Desafio: implementando uma requisição DELETE com JavaScript 1m 31s
- 10 Implementando um client da REST API com Java e Spring (RestTemplate) 18m 22s
- 11 Tratando respostas com código de erro no client Java 16m 53s
- 12 Desafio: Implementando uma requisição POST no client Java 16m 17s

### 17 — Cache HTTP (10 aulas)

- 1 Introdução ao Cache de HTTP 20m 5s
- 2 Habilitando o cache com o cabeçalho Cache-Control e a diretiva max-age 11m 23s
- 3 Desafio: adicionando o cabeçalho Cache-Control na resposta 0m 47s
- 4 Entendendo a validação de representações em cache com ETags 13m 55s
- 5 Implementando requisições condicionais com Shallow ETags 22m 16s
- 6 Adicionando outras diretivas de Cache-Control na resposta HTTP 7m 59s
- 7 Usando a diretiva no-cache no cabeçalho Cache-Control da requisição 1m 27s
- 8 Entendendo e preparando a implementação de Deep ETags 12m 24s
- 9 Implementando requisições condicionais com Deep ETags 21m 27s
- 10 Desafio: implementando requisições condicionais com Deep ETags 0m 46s

### 18 — OpenAPI / Swagger UI / SpringFox (40 aulas)

- 1 Introdução à documentação de REST APIs 4m 33s
- 2 Conhecendo a OpenAPI (antes conhecida como Swagger) 6m 46s
- 3 Gerando a definição OpenAPI em JSON com SpringFox 12m 50s
- 4 Gerando a documentação da API em HTML com Swagger UI e SpringFox 10m 5s
- 5 Selecionando os endpoints da API para gerar a documentação 4m 43s
- 6 Descrevendo informações da API na documentação 18m 6s
- 7 Descrevendo tags na documentação e associando com controllers 2m 55s
- 8 Descrevendo as operações de endpoints na documentação 1m 46s
- 9 Descrevendo parâmetros de entrada na documentação 9m 7s
- 10 Descrevendo modelos de representações e suas propriedades 9m 32s
- 11 Descrevendo restrições de validação de propriedades do modelo 9m 5s
- 12 Descrevendo códigos de status de respostas de forma global 11m 24s
- 13 Desafio: descrevendo códigos de status de respostas de forma global 1m 0s
- 14 Descrevendo o modelo de representação de problema 11m 17s
- 15 Referenciando modelo de representação de problema com códigos de status de erro 5m 46s
- 16 Descrevendo códigos de status de respostas em endpoints específicos 8m 58s
- 17 Desacoplando anotações do Swagger dos controladores 6m 20s
- 18 Desafio: descrevendo documentação de endpoints de grupos 1m 10s
- 19 Descrevendo media type da resposta nos endpoints 3m 9s
- 20 Corrigindo documentação com substituição de Pageable 7m 45s
- 21 Corrigindo documentação com substituição de Page 14m 9s
- 22 Desafio: descrevendo documentação de endpoints de cozinhas 0m 35s
- 23 Ignorando tipos de parâmetros de operações na documentação 2m 31s
- 24 Desafio: descrevendo documentação de endpoints de formas de pagamento 0m 47s
- 25 Descrevendo parâmetros globais em operações 6m 37s
- 26 Descrevendo parâmetros implícitos em operações 4m 41s
- 27 Desafio: descrevendo documentação de endpoints de pedidos 2m 56s
- 28 Descrevendo parâmetros de projeções em endpoints de consultas 14m 18s
- 29 Desafio: descrevendo documentação de endpoints de restaurantes 2m 1s
- 30 Desafio: descrevendo documentação de endpoints de estados 0m 19s
- 31 Desafio: descrevendo documentação de endpoints de fluxo de pedidos 0m 34s
- 32 Desafio: descrevendo documentação de endpoints de associação de restaurantes com formas de pagamento 1m 0s
- 33 Desafio: descrevendo documentação de endpoints de associação de restaurantes com usuários 0m 42s
- 34 Desafio: descrevendo documentação de endpoints de produtos 0m 30s
- 35 Desafio: descrevendo documentação de endpoints de fotos de produtos 7m 12s
- 36 Corrigindo documentação no Swagger UI para upload de arquivos 13m 22s
- 37 Desafio: descrevendo documentação de endpoints de associação de permissões com grupos 0m 40s
- 38 Desafio: descrevendo documentação de endpoints de usuários 0m 22s
- 39 Desafio: descrevendo documentação de endpoints de associação de grupos com usuários 0m 31s
- 40 Desafio: descrevendo documentação de endpoint de estatísticas 4m 20s

### 19 — Discoverability e HATEOAS (48 aulas)

- 1 Introdução à Discoverability e HATEOAS 10m 5s
- 2 Adicionando a URI do recurso criado no header da resposta 15m 38s
- 3 Adicionando o Spring HATEOAS no projeto 2m 42s
- 4 Atualizando o projeto para Spring Boot 2.2 (Spring HATEOAS 1.0) 4m 6s
- 5 Resolvendo conflito de dependências com Spring HATEOAS e SpringFox 16m 39s
- 6 Conhecendo especificações para formatos Hypermedia 6m 3s
- 7 Adicionando hypermedia na representação de recurso único com HAL 16m 17s
- 8 Construindo links dinâmicos com WebMvcLinkBuilder 7m 40s
- 9 Construindo links que apontam para métodos 8m 22s
- 10 Adicionando hypermedia na representação de recursos de coleção 12m 12s
- 11 Montando modelo de representação com RepresentationModelAssembler 14m 53s
- 12 Desafio: adicionando hypermedia nos recursos de usuários 2m 20s
- 13 Corrigindo link de coleção de recurso de responsáveis por restaurante 5m 11s
- 14 Desafio: adicionando hypermedia nos recursos de estados 0m 36s
- 15 Adicionando hypermedia em recursos com paginação 12m 31s
- 16 Desafio: adicionando hypermedia em recursos de pedidos (paginação) 5m 36s
- 17 Corrigindo links de paginação com ordenação 13m 51s
- 18 Adicionando links com template variables 8m 19s
- 19 Desafio: adicionando template variables do filtro de pedidos 2m 0s
- 20 Refatorando construção e inclusão de links em representation model 4m 50s
- 21 Desafio: refatorando construção e inclusão de links 3m 56s
- 22 Adicionando links de transições de status de pedidos 8m 49s
- 23 Adicionando links condicionalmente 7m 46s
- 24 Desafio: adicionando hypermedia nos recursos de restaurantes 9m 43s
- 25 Desafio: adicionando links condicionais no recurso de restaurante 2m 22s
- 26 Desafio: adicionando template variable de projeção de restaurantes 1m 41s
- 27 Desafio: adicionando hypermedia nos recursos de formas de pagamento 1m 43s
- 28 Adicionando links para desassociação de formas de pagamento com restaurante 10m 42s
- 29 Adicionando links com template variable de caminho de formas de pagamento do restaurante 7m 51s
- 30 Desafio: adicionando links de associação de restaurantes com responsáveis 1m 51s
- 31 Desafio: adicionando hypermedia nos recursos de produtos 4m 12s
- 32 Desafio: adicionando links para recurso de foto de produto 2m 50s
- 33 Desafio: adicionando hypermedia nos recursos de grupos 1m 11s
- 34 Desafio: adicionando links de associação de grupos com permissões 2m 50s
- 35 Desafio: adicionando links de associação de usuários com grupos 1m 43s
- 36 Implementando o Root Entry Point da API 8m 18s
- 37 Desafio: implementando endpoint com links de recursos de estatísticas 1m 51s
- 38 Comprimindo as respostas HTTP com Gzip 5m 30s
- 39 Corrigindo as propriedades de links na documentação 6m 41s
- 40 Corrigindo a documentação dos endpoints de cidades 8m 5s
- 41 Corrigindo a paginação na documentação 6m 53s
- 42 Desafio: corrigindo a documentação dos endpoints de estados 0m 44s
- 43 Desafio: corrigindo a documentação dos endpoints de formas de pagamento 2m 42s
- 44 Desafio: corrigindo a documentação dos endpoints de grupos 0m 56s
- 45 Desafio: corrigindo a documentação dos endpoint de pedidos (paginação) 0m 26s
- 46 Desafio: corrigindo a documentação dos endpoints de produtos 0m 31s
- 47 Desafio: corrigindo a documentação dos endpoints de restaurantes e usuários 1m 24s
- 48 Removendo modelo de representação inutilizado da documentação 2m 56s

### 20 — Evolução e versionamento da API (19 aulas)

- 1 Evoluindo a API com gestão de mudanças 2m 10s
- 2 Evitando quebrar os clientes: nova propriedade no modelo 5m 15s
- 3 Evitando quebrar os clientes: exclusão de propriedade do modelo 7m 5s
- 4 Evitando quebrar os clientes: alteração de tipo de propriedade do modelo 9m 3s
- 5 Evitando quebrar os clientes: alteração na estrutura de dados do modelo 4m 48s
- 6 Evitando quebrar os clientes: alteração de URL de recurso 6m 27s
- 7 O que é e quando versionar uma API? 5m 12s
- 8 As principais técnicas de versionamento de APIs 4m 1s
- 9 As principais abordagens para manter a base de código de APIs versionadas 8m 55s
- 10 Preparando o projeto para versionamento da API por Media Type 13m 20s
- 11 Implementando o versionamento da API por Media Type 22m 13s
- 12 Definindo a versão padrão da API quando o Media Type não é informado 4m 10s
- 13 Implementando o versionamento da API por URI 15m 35s
- 14 Desafio: Refatorando controladores para adicionar /v1 nas URIs 1m 26s
- 15 Desafio: adicionando os recursos de cozinhas na v2 da API 1m 22s
- 16 Gerando documentação das versões da API com SpringFox e Swagger UI 10m 36s
- 17 Desafio: revisando documentação da v2 da API 2m 6s
- 18 Depreciando uma versão da API 15m 36s
- 19 Desligando uma versão da API 4m 23s

### 21 — Logging (5 aulas)

- 1 Introdução ao Logback e SLF4J 9m 27s
- 2 Desafio: registrando logs de exceptions não tratadas 1m 42s
- 3 Criando uma conta no Loggly: serviço de gerenciamento de logs na nuvem 7m 55s
- 4 Configurando o appender do Loggly no Logback 21m 34s
- 5 Configurando o Logback para alternar as configurações por Spring Profiles 5m 13s

### 22 — Spring Security e OAuth2 (27 aulas)

- 1 Introdução à segurança de REST APIs 6m 55s
- 2 Adicionando segurança na API com Spring Security 14m 9s
- 3 Configurando Spring Security com HTTP Basic 12m 22s
- 4 Configurando autenticação de usuários em memória 7m 25s
- 5 Introdução ao OAuth2 15m 9s
- 6 Soluções para OAuth2: nova stack do Spring Security vs Spring Security OAuth 8m 20s
- 7 Conhecendo o fluxo Resource Owner Password Credentials 11m 59s
- 8 Criando o projeto do Authorization Server com Spring Security OAuth2 15m 19s
- 9 Configurando o fluxo Authorization Server com Password Credentials e Opaque Tokens 20m 41s
- 10 Configurando o endpoint de introspecção de tokens no Authorization Server 11m 15s
- 11 Configurando o Resource Server com a nova stack do Spring Security 17m 32s
- 12 Conhecendo o fluxo para emitir e usar Refresh Tokens 10m 18s
- 13 Configurando o Refresh Token Grant Type no Authorization Server 10m 23s
- 14 Configurando a validade e não reutilização de Refresh Tokens 10m 1s
- 15 Conhecendo o fluxo Client Credentials 4m 55s
- 16 Configurando o Client Credentials Grant Type no Authorization Server 9m 4s
- 17 Revisando o fluxo Authorization Code 11m 52s
- 18 Configurando o Authorization Code Grant Type 13m 38s
- 19 Testando o fluxo Authorization Code com um client JavaScript 14m 58s
- 20 Conhecendo o fluxo Implicit 5m 50s
- 21 Configurando o fluxo Implicit Grant Type 5m 4s
- 22 Mais segurança com PKCE e Authorization Code Grant 22m 10s
- 23 Implementando o suporte a PKCE com o fluxo Authorization Code 7m 6s
- 24 Testando o fluxo Authorization Code com PKCE com o método plain 15m 59s
- 25 Testando o fluxo Authorization Code com PKCE com o método SHA-256 8m 23s
- 26 Testando um client JavaScript com PKCE e Authorization Code 6m 23s
- 27 Decidindo qual fluxo OAuth2 usar 6m 59s

### 23 — OAuth2 avançado, JWT e controle de acesso (46 aulas)

- 1 Armazenando tokens no Redis: um banco de dados NoSQL 7m 0s
- 2 Configurando o RedisTokenStore 8m 37s
- 3 Entendendo a diferença entre Stateful e Stateless Authentication 21m 44s
- 4 Transparent Tokens: conhecendo o JSON Web Tokens (JWT) 11m 37s
- 5 Gerando JWT com chave simétrica (HMAC SHA-256) no Authorization Server 12m 2s
- 6 Configurando o Resource Server para JWT assinado com chave simétrica 14m 48s
- 7 Entendendo a diferença entre assinatura com chave simétrica e assimétrica 3m 36s
- 8 Gerando um par de chaves com keytool 7m 30s
- 9 Assinando o JWT com RSA SHA-256 (chave assimétrica) 8m 8s
- 10 Desafio: criando bean de propriedades de configuração do KeyStore 1m 36s
- 11 Extraindo a chave pública no formato PEM 13m 14s
- 12 Configurando a validação de JWT no Resource Server com a chave pública 4m 12s
- 13 Revisando o fluxo de aprovação do Authorization Code com JWT 5m 44s
- 14 Autenticando usuário com dados do banco de dados 19m 48s
- 15 Desafio: refatorando serviços de usuários para usar BCrypt 4m 9s
- 16 Adicionando claims customizadas no payload do JWT 13m 54s
- 17 Obtendo usuário autenticado no Resource Server 6m 58s
- 18 Definindo e criando as permissões de acesso 8m 37s
- 19 Carregando as permissões concedidas na autenticação 13m 18s
- 20 Carregando as Granted Authorities e restringindo acesso a endpoints na API 12m 26s
- 21 Method Security: Restringindo acesso com @PreAuthorize e SpEL 9m 55s
- 22 Desafio: tratando AccessDeniedException no ExceptionHandler 1m 32s
- 23 Simplificando o controle de acesso em métodos com meta-anotações 7m 50s
- 24 Entendendo os escopos do OAuth2 10m 9s
- 25 Carregando Granted Authorities dos escopos do OAuth2 no Resource Server 11m 2s
- 26 Restringindo acesso a endpoints por escopos do OAuth2 6m 7s
- 27 Desafio: restringindo acesso dos endpoints de restaurantes 5m 18s
- 28 Restringindo acessos de forma contextual (sensível à informação) 22m 51s
- 29 Restringindo acessos com @PostAuthorize 18m 23s
- 30 Desafio: restringindo acessos ao endpoint de pesquisa de pedidos 7m 0s
- 31 Desafio: restringindo acessos aos endpoints de transição de status de pedidos 5m 16s
- 32 Desafio: restringindo acessos aos endpoints de formas de pagamentos 1m 3s
- 33 Desafio: restringindo acessos aos endpoints de cidades e estados 1m 20s
- 34 Desafio: restringindo acessos aos endpoints de usuários, grupos e permissões 5m 49s
- 35 Desafio: restringindo acessos aos endpoints de estatísticas 0m 57s
- 36 Configurando os clientes OAuth2 em um banco de dados SQL 10m 22s
- 37 Cadastrando clientes OAuth2 no banco de dados e testando a emissão de tokens 15m 4s
- 38 Corrigindo lógica de restrição de acessos para Client Credentials Flow 8m 44s
- 39 Gerando links do HAL dinamicamente de acordo com permissões do usuário 13m 16s
- 40 Desafio: gerando links do HAL dinamicamente de acordo com permissões 1m 10s
- 41 Juntando o Resource Server com o Authorization Server no mesmo projeto 23m 8s
- 42 Ajustando a documentação da API para suporte a OAuth2 17m 13s
- 43 Customizando a página de login 13m 51s
- 44 Customizando a página de OAuth2 Approval 14m 44s
- 45 Implementando o endpoint do JSON Web Key Set (JWKS) 17m 0s
- 46 Externalizando o KeyStore: criando um ProtocolResolver para Base64 15m 58s

### 24 — Docker (21 aulas)

- 1 Conhecendo o Docker 25m 48s
- 2 Instalando o Docker 15m 27s
- 3 Executando um container 5m 13s
- 4 Gerenciando melhor os containers 14m 59s
- 5 Conhecendo a arquitetura do Docker 6m 53s
- 6 Entendendo o que são as imagens e o Docker Hub 11m 44s
- 7 Gerenciando imagens 6m 44s
- 8 Executando um container do MySQL 7m 15s
- 9 Construindo a imagem da aplicação com Dockerfile 13m 22s
- 10 Criando uma network e conectando dois containers 15m 10s
- 11 Construindo a imagem Docker pelo Maven 9m 52s
- 12 Disponibilizando a imagem da aplicação no Docker Hub 9m 5s
- 13 Conhecendo e usando Docker Compose 25m 8s
- 14 Controlando a ordem de inicialização com wait-for-it.sh 12m 17s
- 15 Escalando um serviço com Docker Compose 14m 38s
- 16 Entendendo o Poor Man's Load Balancer (DNS Round Robin) 12m 48s
- 17 Configurando um proxy reverso com Nginx 11m 12s
- 18 Entendendo o problema da HTTP Session no Authorization Server 3m 42s
- 19 Adicionando um container do Redis no arquivo do Docker Compose 9m 12s
- 20 Configurando o Spring Session Data Redis 11m 49s
- 21 Resolvendo problemas com storage de Authorization Codes 17m 31s

### 25 — Deploy em containers na AWS (29 aulas)

- 1 Introdução ao deployment em produção 12m 36s
- 2 Mais organização das propriedades do projeto com Spring Profiles 24m 50s
- 3 Dependência de JavaMailSender não satisfeita: melhorando o uso da herança 12m 46s
- 4 Conhecendo a Amazon Web Services (AWS) 11m 25s
- 5 Entendendo alguns conceitos fundamentais da nuvem da AWS 13m 52s
- 6 Monitorando e criando um alerta de orçamento da AWS 14m 32s
- 7 Criando o bucket no Amazon S3 18m 1s
- 8 Criando uma instância do MySQL no Amazon RDS 14m 17s
- 9 Criando schema e usuário da aplicação 12m 51s
- 10 Conhecendo e criando uma conta no Redislabs 13m 34s
- 11 Criando uma instância do Redis na nuvem 7m 21s
- 12 Conhecendo o Amazon Elastic Container Service (ECS) e AWS Fargate 11m 50s
- 13 Publicando um container no Amazon ECS 24m 4s
- 14 Subindo a imagem Docker para o Amazon Elastic Container Registry (ECR) 13m 9s
- 15 Organizando as variáveis de ambiente do container da aplicação 14m 7s
- 16 Gerenciando as configurações com AWS Systems Manager Parameter Store 9m 37s
- 17 Configurando Amazon ECS para rodar nossa aplicação 10m 35s
- 18 Permitindo a leitura de parâmetros do Parameter Store pelo serviço do Amazon ECS 6m 18s
- 19 Permitindo o acesso ao MySQL pelo Security Group do serviço do Amazon ECS 5m 58s
- 20 Inserindo dados no banco de dados de produção 6m 12s
- 21 Conhecendo o Elastic Load Balancing da Amazon 8m 27s
- 22 Configurando e provisionando um Load Balancer na Amazon 12m 39s
- 23 Configurando o balanceamento de carga no serviço do Amazon ECS 16m 21s
- 24 Registrando um domínio de internet no Registro.br 4m 54s
- 25 Configurando o domínio para o Application Load Balancer 9m 57s
- 26 Configurando certificado TLS (HTTPS) com AWS Certificate Manager 8m 42s
- 27 Configurando o protocolo HTTPS nos links da API com HATEOAS 17m 40s
- 28 Testando a API em produção 5m 1s
- 29 Conclusão e próximos passos 4m 50s

## Fonte e limites

A contagem exata considera as 567 linhas de aula com duração no arquivo `read_more-Especialista_Spring_REST_2022_Algaworks_2022.txt`. Os títulos e durações foram mantidos com normalização mínima de espaços e tabulações para apresentação Markdown. O arquivo completo `Especialista_Spring_REST_2022_Algaworks_2022.txt` foi usado como conferência estrutural; nenhuma tecnologia moderna foi inserida nesta transcrição.
