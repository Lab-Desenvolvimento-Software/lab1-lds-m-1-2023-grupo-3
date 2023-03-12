import java.util.Scanner;

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
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do usuário:");
        String nome = ler.nextLine();

        System.out.println("Informe o cpf do usuário:");
        int cpf = ler.nextInt(); 

        System.out.println("Informe o endereço do usuário:");
        String endereco = ler.nextLine();

        System.out.println("Informe o telefone do usuário:");
        int telefone = ler.nextInt(); 

        System.out.println("Digite 'a' se o novo usuário for um aluno, 'p' se o novo usuário for um professor e 's' se o novo usuário for uma secretária:");
        char tipoUsuario = (char)System.in.read();

        System.out.println("Informe o e-mail do usuário:");
        String email = ler.nextLine();

        System.out.println("Cadastre a senha do usuário:");
        String senha = ler.nextLine();

        Usuario usuario = new Usuario(numMatricula, nome, cpf, endereco, telefone, tipoUsuario, email, senha);

    }

    public static void excluirUsuario(){

    }

    
    public void logar(String email, String senha){

    }


}
