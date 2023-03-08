import java.time.LocalDate;

import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Aprendizado completo sobre a linguagem Java");
        cursoJava.setCargaHoraria(200);
        //System.out.println(cursoJava);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso de JavaScript");
        cursoJS.setDescricao("Aprendizado inicial sobre a linguagem JavaScript");
        cursoJS.setCargaHoraria(150);
        //System.out.println("\n" + cursoJS);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de POO com Java");
        mentoria1.setDescricao("Aula gratuita sobre Paradigma Orientado a Objetos com a linguagem Java");
        mentoria1.setData(LocalDate.now());
        //System.out.println("\n" + mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda nível intermediário de Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJS);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAna = new Dev();
        devAna.setNome("Ana Beatriz");
        devAna.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + devAna.getNome() + ": " + devAna.getConteudosInscritos());

        devAna.progredir();
        System.out.println("\nConteúdos concluídos de " + devAna.getNome() + ": " + devAna.getConteudosInscritos());
        System.out.println("\nConteúdos inscritos de " + devAna.getNome() + ": " + devAna.getConteudosInscritos());
        System.out.println("\nXP: " + devAna.calcularTotalXp());

        System.out.println("----------------------------");

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverNoBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos de " + devGustavo.getNome() + ": " + devAna.getConteudosInscritos());

        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("\nConteúdos concluídos de " + devGustavo.getNome() + ": " + devAna.getConteudosInscritos());
        System.out.println("\nConteúdos inscritos de " + devGustavo.getNome() + ": " + devAna.getConteudosInscritos());

        System.out.println("\nXP: " + devGustavo.calcularTotalXp());


    }
}