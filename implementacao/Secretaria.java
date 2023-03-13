import java.util.LinkedList;
import java.util.Scanner;

public class Secretaria extends Usuario{

    Secretaria(int numMatricula, String nome, int cpf, String endereco, int telefone, char tipoUsuario, String email, String senha){
        super(numMatricula, nome, cpf, endereco, telefone, tipoUsuario, email, senha);
    }

    public LinkedList<Usuario> usuarios = new LinkedList<Usuario>(); 

    public void criarUsuario(int numMatricula, String nome, int cpf, String endereco, int telefone, char tipoUsuario, String email, String senha){
        //Professor prof = new Professor(1, "a", 1, "a", 1, 'c', "a", "a");

    }

    // public boolean adicionarProfessor(Disciplina disciplina, Professor professor){
    //     disciplina.add(professor);
    //     return true;
    // }

    // public boolean removerProfessor(Professor matricula){
    //     return true;
    // }

    // public boolean adicionarDisciplina(Disciplina disciplina){
    //     return true;
    // }

    // public boolean removerDisciplina(Disciplina disciplina){
    //     return true;
    // }

    // public boolean adicionarAluno(Aluno aluno){
    //     return true;
    // }

    // public boolean removerAluno(Aluno aluno){
    //     return true;
    // }
}
