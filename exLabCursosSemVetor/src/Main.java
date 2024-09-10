import entities.Curso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome1, turno1,  professor1;
        int qtdAlunos1;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o nome do curso:");
        nome1 = sc.next();
        System.out.print("Insira a quantidade de alunos do curso:");
        qtdAlunos1 = sc.nextInt();
        System.out.print("Insira o turno do curso:");
        turno1 = sc.next();
        System.out.print("Insira o nome do professor do curso:");
        professor1 = sc.next();

        Curso curso1 = new Curso(nome1, qtdAlunos1, turno1, professor1, 1);

        String nome2, turno2,  professor2;
        int qtdAlunos2;


        System.out.print("\nInsira o nome do curso 2:");
        nome2 = sc.next();
        System.out.print("Insira a quantidade de alunos do curso 2:");
        qtdAlunos2 = sc.nextInt();
        System.out.print("Insira o turno do curso 2:");
        turno2 = sc.next();
        System.out.print("Insira o nome do professor do curso 2:");
        professor2 = sc.next();

        Curso curso2 = new Curso(nome2, qtdAlunos2, turno2, professor2, 2);

        String nome3, turno3,  professor3;
        int qtdAlunos3;


        System.out.print("\nInsira o nome do curso 3:");
        nome3 = sc.next();
        System.out.print("Insira a quantidade de alunos do curso 3:");
        qtdAlunos3 = sc.nextInt();
        System.out.print("Insira o turno do curso 3:");
        turno3 = sc.next();
        System.out.print("\nInsira o nome do professor do curso 3:");
        professor3 = sc.next();

        Curso curso3 = new Curso(nome3, qtdAlunos3, turno3, professor3, 3);

        String nome4, turno4,  professor4;
        int qtdAlunos4;


        System.out.print("\nInsira o nome do curso 4:");
        nome4 = sc.next();
        System.out.print("Insira a quantidade de alunos do curso 4:");
        qtdAlunos4 = sc.nextInt();
        System.out.print("Insira o turno do curso 4:");
        turno4 = sc.next();
        System.out.print("Insira o nome do professor do curso 4:");
        professor4 = sc.next();

        Curso curso4 = new Curso(nome4, qtdAlunos4, turno4, professor4 ,4 );

        System.out.println(curso1.to_String());
        System.out.println(curso2.to_String());
        System.out.println(curso3.to_String());
        System.out.println( curso4.to_String());
    }
}