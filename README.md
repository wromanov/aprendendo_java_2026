# Aprendendo Java 2026

Repositório de governança, acompanhamento e evidências da jornada de formação para **Backend Java Engineer**, com duração de referência de aproximadamente 12 meses.

O projeto parte da experiência profissional prévia em infraestrutura e a conecta progressivamente a desenvolvimento de software, backend, cloud, containers, CI/CD, segurança, redes e observabilidade.

A jornada possui três formações principais: Especialista Java, Especialista Spring REST e Formação Decoder. A ordem pedagógica e os complementos são detalhados no roadmap.

## Propósito

Este repositório registra:

- como a mentoria deve conduzir a formação;
- quais evidências sustentam cada avaliação;
- o histórico real de checkpoints e retenção;
- os materiais produzidos durante os cursos;
- a evolução dos projetos e da autonomia;
- a transição gradual de Java para engenharia de backend próxima da produção.

O GitHub faz parte do processo de aprendizagem: o histórico de mudanças, os exercícios selecionados, os projetos e a documentação serão evidências observáveis da evolução. O repositório não é apenas um arquivo de anotações.

## Organização conceitual

| Área | Pergunta respondida |
| --- | --- |
| `governance/` | Como aprendemos, ensinamos e avaliamos? |
| `checkpoints/` e `progress/` | O que foi demonstrado e qual é o estado atual? |
| `materials/` | O que foi estudado e produzido? |
| `projects/` | O que foi construído e como evoluiu? |
| `roadmap/` | Qual é o próximo mapa de competências? |

Essa separação é conceitual e pode evoluir com o projeto. Ela evita misturar regras de governança, material didático e código de prática.

## Estrutura inicial

```text
aprendendo_java_2026/
├── README.md
├── .gitignore
├── governance/
│   ├── PROMPT_MESTRE_MENTOR_JAVA.md
│   └── INDEPENDENCIA_ANALITICA_MENTOR_JAVA_v1.0.md
├── roadmap/
│   ├── README.md
│   └── ROADMAP_JAVA_BACKEND_ENGINEER.md
├── checkpoints/
│   └── CHECKPOINT_TEMPLATE.md
├── progress/
│   └── LEARNING_STATE.md
├── materials/
│   ├── README.md
│   └── courses/
│       ├── ESPECIALISTA_JAVA_ALGAWORKS_2022.md
│       ├── ESPECIALISTA_SPRING_REST_ALGAWORKS_2022.md
│       ├── FORMACAO_DECODER_MICROSERVICES_MICHELLI_BRITO.md
│       └── COURSE_ANALYSIS.md
└── projects/
    ├── README.md
    └── INCREMENTAL_PROJECT.md
```

Exercícios pequenos podem permanecer em `materials/` ou dentro da documentação do módulo. Projetos com valor demonstrável devem evoluir em `projects/` ou em repositório próprio quando atingirem maturidade suficiente.

## Regras operacionais

1. O curso informado pelo mentorado será a espinha dorsal da sequência pedagógica.
2. Cada módulo relevante passa por revisão, exercícios, revisão de código, checkpoint e aplicação cumulativa.
3. Um checkpoint é histórico: uma avaliação anterior não é apagada para esconder uma lacuna corrigida depois.
4. `READY_TO_ADVANCE` e `READY_FOR_FIRST_APPLICATIONS` dependem de evidências, não de calendário, motivação ou conclusão formal de aulas.
5. Cada conceito, tecnologia, exercício relevante ou projeto recebe contexto de aplicação profissional quando isso for pedagogicamente apropriado.
6. Segurança, legalidade e limitações incontornáveis da plataforma têm precedência externa às decisões pedagógicas e técnicas.
7. Nenhum commit ou push é automático como parte desta fundação documental.

## Estado atual

O estado canônico da jornada está em [progress/LEARNING_STATE.md](progress/LEARNING_STATE.md). As políticas vigentes estão em [governance/PROMPT_MESTRE_MENTOR_JAVA.md](governance/PROMPT_MESTRE_MENTOR_JAVA.md) e [governance/INDEPENDENCIA_ANALITICA_MENTOR_JAVA_v1.0.md](governance/INDEPENDENCIA_ANALITICA_MENTOR_JAVA_v1.0.md).

## Documentação canônica

- [Prompt Mestre](governance/PROMPT_MESTRE_MENTOR_JAVA.md)
- [Independência Analítica](governance/INDEPENDENCIA_ANALITICA_MENTOR_JAVA_v1.0.md)
- [Roadmap Java → Backend Engineer](roadmap/ROADMAP_JAVA_BACKEND_ENGINEER.md)
- [Template de checkpoint](checkpoints/CHECKPOINT_TEMPLATE.md)
- [Learning State](progress/LEARNING_STATE.md)
- [Curso Especialista Java](materials/courses/ESPECIALISTA_JAVA_ALGAWORKS_2022.md)
- [Curso Especialista Spring REST](materials/courses/ESPECIALISTA_SPRING_REST_ALGAWORKS_2022.md)
- [Formação Decoder — Michelli Brito](materials/courses/FORMACAO_DECODER_MICROSERVICES_MICHELLI_BRITO.md)
- [Análise dos cursos](materials/courses/COURSE_ANALYSIS.md)
- [Projeto incremental InfraTrack](projects/INCREMENTAL_PROJECT.md)

## Status atual

```text
Governance baseline: ESTABLISHED
Courses: ANALYZED
Roadmap: AVAILABLE
Java learning: NOT_STARTED
Next formal step: START JAVA MODULE 01
```

## Repositório remoto

Repositório informado para este projeto:

`https://github.com/wromanov/aprendendo_java_2026.git`
