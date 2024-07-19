import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Desafio js");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setTitulo("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSara = new Dev();
        devSara.setNome("Sara");
        devSara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devSara.getConteudosInscritos());
        devSara.progredir();
        System.out.println("Conteúdos Inscritos" + devSara.getConteudosInscritos());
        devSara.progredir();
        System.out.println("Conteúdos Inscritos" + devSara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devSara.getConteudosConcluidos());
        System.out.println("XP:" + devSara.calcularTotalXp());
        System.out.println("Sara finalizou os cursos: " + devSara.getConteudosConcluidos());

        System.out.println("---------");


        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos" + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        devVinicius.progredir();
        devVinicius.progredir();
        System.out.println("Conteúdos Inscritos" + devSara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devVinicius.getConteudosConcluidos());
        System.out.println("XP:" + devVinicius.calcularTotalXp());
        System.out.println("Vinicius finalizou os cursos: " + devVinicius.getConteudosConcluidos());

        System.out.println("-----------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos" + devSara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println("Camila finalizou os cursos: " + devCamila.getConteudosConcluidos());

        System.out.println("---------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devMaria.getConteudosInscritos());
        System.out.println("XP:" + devMaria.calcularTotalXp());
        System.out.println("Maria finalizou os cursos:" + devMaria.getConteudosConcluidos());


    }
}