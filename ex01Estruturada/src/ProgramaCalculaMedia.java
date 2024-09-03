import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ProgramaCalculaMedia {


    public static String verificaMedia(double media) {
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        // Dados dos alunos
        String nomeAluno1 = "Paulo";
        int matAluno1 = 111;
        double nota1Aluno1 = 8.0;
        double nota2Aluno1 = 6.0;
        double nota3Aluno1 = 5.0;

        String nomeAluno2 = "Maria";
        int matAluno2 = 222;
        double nota1Aluno2 = 4.0;
        double nota2Aluno2 = 6.0;
        double nota3Aluno2 = 3.0;

        String nomeAluno3 = "José";
        int matAluno3 = 333;
        double nota1Aluno3 = 6.0;
        double nota2Aluno3 = 4.0;
        double nota3Aluno3 = 9.0;

        String nomeAluno4 = "Patrícia";
        int matAluno4 = 444;
        double nota1Aluno4 = 7.0;
        double nota2Aluno4 = 8.0;
        double nota3Aluno4 = 9.0;

        // Cálculo das médias
        double mediaAluno1 = (nota1Aluno1 + nota2Aluno1 + nota3Aluno1) / 3;
        double mediaAluno2 = (nota1Aluno2 + nota2Aluno2 + nota3Aluno2) / 3;
        double mediaAluno3 = (nota1Aluno3 + nota2Aluno3 + nota3Aluno3) / 3;
        double mediaAluno4 = (nota1Aluno4 + nota2Aluno4 + nota3Aluno4) / 3;

        double mediaGeral = (mediaAluno1 + mediaAluno2 + mediaAluno3 + mediaAluno4) / 4;

        // Formatador de decimal
        DecimalFormat df = new DecimalFormat("#.00");

        // Exibição das médias dos alunos
        JOptionPane.showMessageDialog(null, "Média do(a) Aluno(a) " + nomeAluno1 +
                " (Matrícula - " + matAluno1 + ") = " + df.format(mediaAluno1));
        JOptionPane.showMessageDialog(null, "Média do(a) Aluno(a) " + nomeAluno2 +
                " (Matrícula - " + matAluno2 + ") = " + df.format(mediaAluno2));
        JOptionPane.showMessageDialog(null, "Média do(a) Aluno(a) " + nomeAluno3 +
                " (Matrícula - " + matAluno3 + ") = " + df.format(mediaAluno3));
        JOptionPane.showMessageDialog(null, "Média do(a) Aluno(a) " + nomeAluno4 +
                " (Matrícula - " + matAluno4 + ") = " + df.format(mediaAluno4));

        // Exibição da média geral
        JOptionPane.showMessageDialog(null, "Média Geral = " + df.format(mediaGeral));

        // Verificação se os alunos foram aprovados ou reprovados
        JOptionPane.showMessageDialog(null, nomeAluno1 + " (Matrícula - " + matAluno1 + ") = " + verificaMedia(mediaAluno1));
        JOptionPane.showMessageDialog(null, nomeAluno2 + " (Matrícula - " + matAluno2 + ") = " + verificaMedia(mediaAluno2));
        JOptionPane.showMessageDialog(null, nomeAluno3 + " (Matrícula - " + matAluno3 + ") = " + verificaMedia(mediaAluno3));
        JOptionPane.showMessageDialog(null, nomeAluno4 + " (Matrícula - " + matAluno4 + ") = " + verificaMedia(mediaAluno4));
    }
}
