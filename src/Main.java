import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Programação java orientada a objeto.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Programação js.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentoria JOO.");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp´Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp´Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devInacio = new Dev();
        devInacio.setNome("Inacio");
        devInacio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Inacio: " + devInacio.getConteudosInscritos());
        devInacio.progredir();
        devInacio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Inacio: " + devInacio.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Inacio: " + devInacio.getConteudosConcluidos());
        System.out.println("XP: " + devInacio.calcularTotalXp());

        System.out.println("-----------");

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Luiz: " + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Luiz: " + devLuiz.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Luiz: " + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devLuiz.calcularTotalXp());

        System.out.println("-----------");
    }
}
