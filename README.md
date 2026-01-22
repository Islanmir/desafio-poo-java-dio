# Desafio POO - Bootcamp Java

Este projeto é uma implementação do desafio de **Programação Orientada a Objetos (POO)** da DIO.

O sistema simula um **Bootcamp** com **Cursos** e **Mentorias**, permitindo que **Devs** se inscrevam, progridam nos conteúdos e acumulem XP.

---

## 🧱 Estrutura do projeto

- `br.com.dio.desafio.dominio`
  - `Conteudo.java` → classe abstrata, base para Curso e Mentoria
  - `Curso.java` → herda Conteudo, contém carga horária
  - `Mentoria.java` → herda Conteudo, contém data da mentoria
  - `Bootcamp.java` → agrega conteúdos e devs inscritos
  - `Dev.java` → lógica de inscrição, progresso e cálculo de XP
- `Main.java` → simula o bootcamp com devs, cursos e mentorias

---

## ▶️ Como rodar

1. Abrir o projeto no VS Code ou IDE de Java
2. Compilar e executar `Main.java`
3. Observar no console os conteúdos inscritos, concluídos e XP dos devs

---

## 👩‍💻 Exemplo

Dev Ana e Dev Pedro são inscritos no bootcamp, progridem nos conteúdos e acumulam XP:

```
    Conteúdos Inscritos Ana: [...]
    Conteúdos Concluídos Ana: [...]
    XP: XX
    Conteúdos Inscritos Pedro: [...]
    Conteúdos Concluídos Pedro: [...]
    XP: XX
```

## 📝 Observações

- Implementa conceitos de POO: **abstração, herança, polimorfismo e encapsulamento**
- Mantém ordem de conteúdos com `LinkedHashSet`
- Cada Dev tem sua própria progressão independente
