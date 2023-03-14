import java.util.LinkedList;
import java.util.Scanner;

public class Curso {

    private int codigoCurso;
    private int creditos;
    private static int temp;
    public static String nomeCurso;
    public static Curso cur;
    public static LinkedList<Disciplina> disciplinas = new LinkedList<Disciplina>();
    public static LinkedList<Curso> cursos = new LinkedList<Curso>();

    Curso(int codigoCurso, int creditos, String nomeCurso) {
        this.codigoCurso = codigoCurso;
        this.creditos = creditos;
        this.nomeCurso = nomeCurso;
        cursos.add(this);
    }

    public LinkedList<Disciplina> consultarDisciplinas() {
        return disciplinas;
    }

    public LinkedList<Disciplina> consultarProfessor(Professor prof) {
        // retorna uma lista de disciplinas que o professor leciona
        return null;
    }

    public static void adicionarCurso() {
        int creditos, codigo;
        Scanner info = new Scanner(System.in);
        System.out.println("informe o nome do curso: ");
        nomeCurso = info.nextLine();
        System.out.println("informe o código do curso: ");
        codigo = info.nextInt();
        System.out.println("informe quantos créditos o curso tem: ");
        creditos = info.nextInt();

    }

    public static void excluirCurso() {
        Scanner info = new Scanner(System.in);
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(i + " nome: " + cursos.get(i).nomeCurso);
        }
        temp = info.nextInt();
        cursos.remove(temp);
    }

    public static void consultarCurso() {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(i + " nome: " + cursos.get(i).nomeCurso);
        }
    }

    public static void adicionarDisciplina() {
        Scanner info = new Scanner(System.in);
        System.out.println("Decida em qual curso adicionar a disciplina: ");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(i + " nome: " + cursos.get(i).nomeCurso);
        }
        temp = info.nextInt();
        cur = cursos.get(temp);
        System.out.println("Escolha a disciplina: ");
        for (int i = 0; i < Disciplina.disciplinas.size(); i++) {
            System.out.println(i + " nome: " + Disciplina.disciplinas.get(i));
        }
        temp = info.nextInt();
        disciplinas.add(Disciplina.disciplinas.get(temp));
    }

    public static void excluirDisciplina() {
        Scanner info = new Scanner(System.in);
        System.out.println("Decida em qual curso excluir a disciplina: ");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(i + " nome: " + cursos.get(i).nomeCurso);
        }
        temp = info.nextInt();
        cur = Curso.cursos.get(temp);
        System.out.println("Escolha a disciplina: ");
        for (int i = 0; i < Disciplina.disciplinas.size(); i++) {
            System.out.println(i + " nome: " + Disciplina.disciplinas.get(i));
        }
        temp = info.nextInt();
        Disciplina.disciplinas.remove(temp);
    }

    public static void consultarDisciplina() {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(i + " nome: " + cursos.get(i).nomeCurso);
        }
    }
}
