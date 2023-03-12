public class Aluno extends Usuario {
    

    Aluno(int numMatricula, String nome, int cpf, String endereco, int telefone, char tipoUsuario, String email, String senha){
        super(numMatricula, nome, cpf, endereco, telefone, tipoUsuario, email, senha);
    }
        
    public boolean MatricularCurso(int codigoCurso){
        return true;
    }
    
    public boolean MatricularDisciplina(int codigoDisciplina){
        return true;
    }
    
    
}

