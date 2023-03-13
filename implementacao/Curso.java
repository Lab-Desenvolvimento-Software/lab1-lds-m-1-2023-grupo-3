import java.util.LinkedList;
import java.util.Scanner;


public class Curso {

    private int codigoCurso;
    private int creditos;
    private static int temp;
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

    public static void adicionarCurso(){
        String nomeCurso;
        int creditos, codigo;
        Scanner info = new Scanner(System.in);
        System.out.println("informe o nome do curso: ");
        nomeCurso = info.nextLine();
        System.out.println("informe o código do curso: ");
        codigo = info.nextInt();
        System.out.println("informe quantos créditos o curso tem: ");
        creditos = info.nextInt();

    }

    public static void excluirCurso(){
        Scanner info = new Scanner(System.in);
        for (int i=0; i<cursos.size(); i++){
            System.out.println(i + " nome: " + cursos.get(i).nome);
        }
        temp = info.nextInt();
        cursos.remove(temp);  
    }


    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
}
