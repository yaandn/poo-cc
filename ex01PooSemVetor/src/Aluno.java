public class Aluno {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;
    Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    double calculaMedia() {
        return (nota1+nota2+nota3)/3;
    }
    public String toString() {
        return nome + " (Matrícula - " + matricula + ")";
    }

    public String verificaMedia(double media) {
        if(media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

}
