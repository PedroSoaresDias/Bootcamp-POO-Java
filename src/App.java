import java.time.LocalDate;

import Models.Bootcamp;
import Models.Curso;
import Models.Dev;
import Models.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do Curso de Java do Básico ao Avançado");
        curso1.setCargaHoraria(47);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do Curso de JavaScript");
        curso2.setCargaHoraria(16);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1 + "\n");
        // System.out.println(curso2 + "\n");
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Desenvolvimento Java");
        bootcamp.setDescricao("Descrição Bootcamp Desenvolvimento Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.IncreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        devPedro.Progredir();
        devPedro.Progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro:" + devPedro.getConteudoConcluido());
        System.out.println("XP de Pedro: " + devPedro.CalcularTotalXp());
        
        System.out.println("-----------------");
        
        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.IncreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosInscritos());
        devJulia.Progredir();
        devJulia.Progredir();
        devJulia.Progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Julia:" + devJulia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Julia:" + devJulia.getConteudoConcluido());
        System.out.println("XP de Julia: " + devJulia.CalcularTotalXp());
        
        
    }
}
