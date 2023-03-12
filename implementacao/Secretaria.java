public class Secretaria extends Usuario {

    Secretaria(int numMatricula, String nome, int cpf, String endereco, int telefone, char tipoUsuario, String email, String senha){
        super(numMatricula, nome, cpf, endereco, telefone, tipoUsuario, email, senha);
    }
    
    public void gerarCurriculo(){
        
    }



    public boolean adicionarProfessor(Professor professor){
        return true;
    }

    public boolean removerProfessor(Professor matricula){
        return true;
    }

    public boolean adicionarDisciplina(Disciplina disciplina){
        return true;
    }

    public boolean removerDisciplina(Disciplina disciplina){
        return true;
    }

    public boolean adicionarAluno(Aluno aluno){
        return true;
    }

    public boolean removerAluno(Aluno aluno){
        return true;
    }
}
