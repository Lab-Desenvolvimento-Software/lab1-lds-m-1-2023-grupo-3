import java.util.LinkedList;

public class Curso {

    private int codigoCurso;
    private int creditos;
    public String nome;
    public LinkedList<Disciplina> disciplinas= new LinkedList<Disciplina>();
    public static LinkedList<Curso> cursos = new LinkedList<Curso>();

    Curso (int codigoCurso, int creditos, String nome){
        this.codigoCurso = codigoCurso;
        this.creditos = creditos;
        this.nome = nome;
        cursos.add(this);
    }
    
    public LinkedList<Disciplina> consultarDisciplinas() {
        return disciplinas;
    }

    public LinkedList<Disciplina> consultarProfessor(Professor prof) {
        //retorna uma lista de disciplinas que o professor leciona
        return null;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}
