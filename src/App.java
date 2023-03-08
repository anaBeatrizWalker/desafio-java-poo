import java.time.LocalDate;

import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Aprendizado completo sobre a linguagem Java");
        cursoJava.setCargaHoraria(200);
        System.out.println(cursoJava);

        Curso cursoJS = new Curso();
        cursoJS.setTitulo("Curso de JavaScript");
        cursoJS.setDescricao("Aprendizado inicial sobre a linguagem JavaScript");
        cursoJS.setCargaHoraria(150);
        System.out.println("\n" + cursoJS);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de POO com Java");
        mentoria1.setDescricao("Aula gratuita sobre Paradigma Orientado a Objetos com a linguagem Java");
        mentoria1.setData(LocalDate.now());
        System.out.println("\n" + mentoria1);
    }
}