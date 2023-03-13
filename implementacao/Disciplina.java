import java.util.LinkedList;

public class Disciplina {
    
    private int codigoDisciplina;
    private LinkedList<Aluno> alunos = new LinkedList<Aluno>();
    private LinkedList<Professor> professores = new LinkedList<Professor>();
    private String nome;
    private boolean isOptativa;
    public static LinkedList<Disciplina> disciplinas = new LinkedList<Disciplina>();

    Disciplina (int codigoDisciplina, String nome, boolean isOptativa) {
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.isOptativa = isOptativa;
        disciplinas.add(this);
    }


    // um verificador para o usuario seria adicionado, impedindo que todos usassem o método
    public LinkedList<Aluno> consultarAlunos() {
        return alunos;
    }

    public LinkedList<Professor> consultarProfessores() {
        return professores;
    }

    public boolean adicionarProfessor(Professor professor){
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
