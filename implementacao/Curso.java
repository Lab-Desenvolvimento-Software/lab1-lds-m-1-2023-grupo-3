import java.util.LinkedList;

public class Curso {

    private int codigoCurso;
    private int creditos;
    private String nome;
    private LinkedList<Disciplina> disciplinas;
    
    public LinkedList<Disciplina> consultarDisciplinas() {
        return disciplinas;
    }

    public LinkedList<Disciplina> consultarProfessor(Professor prof) {
        //retorna uma lista de disciplinas que o professor leciona
        return null;
    }
}
