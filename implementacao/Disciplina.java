import java.util.LinkedList;

public class Disciplina {
    
    private int codigoDisciplina;
    private LinkedList<Aluno> alunos;
    private LinkedList<Professor> professores;
    private String nome;
    private boolean isOptativa;

    public LinkedList<Aluno> consultarAlunos() {
        return alunos;
    }

    public LinkedList<Professor> consultarProfessores() {
        return professores;
    }

}
