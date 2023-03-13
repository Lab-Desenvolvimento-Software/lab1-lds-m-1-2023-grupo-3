public abstract class Usuario {
    private int numMatricula;
    private String nome;
    private int cpf;
    private String endereco;
    private int telefone;
    private char tipoUsuario;
    private String email;
    private String senha;

    public Usuario(int numMatricula, String nome, int cpf, String endereco, int telefone, char tipoUsuario, String email, String senha){
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.email = email;
        this.senha = senha;
    }
    
    public void logar(String email, String senha){

    }


}
