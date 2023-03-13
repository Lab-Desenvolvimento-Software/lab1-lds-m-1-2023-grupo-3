import java.util.LinkedList;

public class Secretaria extends Usuario{

    public static LinkedList<Usuario> usuarios = new LinkedList<Usuario>();

    Secretaria(int numMatricula, String nome, int cpf, String endereco, int telefone, char tipoUsuario, String email, String senha){
        super(numMatricula, nome, cpf, endereco, telefone, tipoUsuario, email, senha);
    }


    public static void criarUsuario(int numMatricula, String nome, int cpf, String endereco, int telefone, char tipoUsuario, String email, String senha){
        switch (tipoUsuario) {
            case 'a':
            Aluno aluno = new Aluno(numMatricula, nome, cpf, endereco, telefone, tipoUsuario, email, senha);
            usuarios.add(aluno);
            break;

            case 'p':
            Professor prof = new Professor(numMatricula, nome, cpf, endereco, telefone, tipoUsuario, email, senha);
            usuarios.add(prof);
            break;

            case 's':
            Secretaria secretaria = new Secretaria(numMatricula, nome, cpf, endereco, telefone, tipoUsuario, email, senha);
            usuarios.add(secretaria);
            break;
        }

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
