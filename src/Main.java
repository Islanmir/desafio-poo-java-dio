import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Dev Ana
        Dev ana = new Dev();
        ana.setNome("Ana");
        ana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana: " + ana.getConteudosInscritos());
        ana.progredir();
        ana.progredir();
        System.out.println("Conteúdos Inscritos Ana: " + ana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana: " + ana.getConteudosConcluidos());
        System.out.println("XP: " + ana.calcularTotalXp());

        System.out.println("-------");

        // Dev Pedro
        Dev pedro = new Dev();
        pedro.setNome("Pedro");
        pedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " + pedro.getConteudosInscritos());
        pedro.progredir();
        pedro.progredir();
        pedro.progredir();
        System.out.println("Conteúdos Inscritos Pedro: " + pedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Pedro: " + pedro.getConteudosConcluidos());
        System.out.println("XP: " + pedro.calcularTotalXp());
    }
}

