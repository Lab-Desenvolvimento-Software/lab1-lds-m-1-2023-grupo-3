import java.util.LinkedList;

public class Disciplina {
    
    private int codigoDisciplina;
    private LinkedList<Aluno> alunos;
    private LinkedList<Professor> professores;
    private String nome;
    private boolean isOptativa;

    Disciplina (int codigoDisciplina, String nome, boolean isOptativa) {
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.isOptativa = isOptativa;
    }


    // um verificador para o usuario seria adicionado, impedindo que todos usassem o método
    public LinkedList<Aluno> consultarAlunos() {
        return alunos;
    }

    public LinkedList<Professor> consultarProfessores() {
        return professores;
    }

    public boolean adicionarProfessor(Disciplina disciplina, Professor professor){
        professores.add(professor);
        return true;
    }

    public boolean removerProfessor(Professor matricula){
        return true;
    }

    public boolean adicionarAluno(Aluno aluno){
        return true;
    }

    public boolean removerAluno(Aluno aluno){
        return true;
    }

}
