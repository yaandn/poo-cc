package entities;

public class Curso {

    public String nome;
    public int qtd_alunos;
    public String turno;
    public String professor;
    public int id;

    public Curso(String nome, int qtd_alunos, String turno, String professor, int id) {
        this.nome = nome;
        this.qtd_alunos = qtd_alunos;
        this.turno = turno;
        this.professor = professor;
    }

    public String to_String() {
        return
                "Curso " + this.id +
                "Nome: " + this.nome +
                "\nQuantidade de Alunos: " + this.qtd_alunos +
                "\nTurno: " + this.turno +
                "\nProfessor: " + this.professor +
                "\n_____________________________________";
    }
}
