import entities.Curso;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<Curso>();
        int qtdCursos = 0;
        System.out.println("Quantos cursos você deseja armazenar?");
        qtdCursos = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= qtdCursos; i++) {
            System.out.println("-------------------------------");
            System.out.println("Cadastrando o curso " + i );
            System.out.println("-------------------------------");
            System.out.print("informe o nome do curso:");
            String nome = sc.nextLine();
            System.out.print("Informe a quantidade de alunos do curso:");
            int qtdAlunos = sc.nextInt();
            sc.nextLine();
            System.out.print("Informe o nome do professor do curso:");
            String nomeProfessor = sc.nextLine();
            System.out.print("Informe o turno do curso:");
            String turno = sc.nextLine();

           Curso novoCurso = new Curso(nome, qtdAlunos, turno, nomeProfessor, i);
            cursos.add(novoCurso);
            System.out.println("\n");
        }

        System.out.println("------------------------------");
        System.out.println("Mostrando cursos");
        System.out.println("------------------------------");

        for (int i=0; i < qtdCursos; i++) {
           Curso cursoAtual =  cursos.get(i);
            System.out.println(cursoAtual.to_String());
        }

    }
}