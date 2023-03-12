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

    public Usuario(){
        this.numMatricula = 0;
        this.nome = "nome";
        this.cpf = 0;
        this.endereco = "endereco";
        this.telefone = 0;
        this.tipoUsuario = 'c';
        this.email = "email";
        this.senha = "senha";
    }

    //public void addUsuario(Usuario){
    //}

    public static void addUsuario(){
        Usuario us = new Usuario();
        
        {
            
        };

        Scanner entrada = new Scanner(System.in);
        system.out.println("Digite 'a' se o novo usuário for um aluno, 'p' se o novo usuário for um professor e 's' se o novo usuário for uma secretária:");

        system.out.println("Informe o nome do usuário:");

        system.out.println("Informe o cpf do usuário:");

        system.out.println("Informe o endereço do usuário:");

        system.out.println("Informe o telefone do usuário:");

        system.out.println("Informe o e-mail do usuário:");

        system.out.println("Cadastre a senha do usuário:");
    }

    public static void excluirUsuario(){

    }

    
    public void logar(String email, String senha){

    }


}
