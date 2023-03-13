import java.util.LinkedList;
import java.util.Scanner;

public abstract class Usuario {
    private int numMatricula;
    public String nome;
    private int cpf;
    private String endereco;
    private int telefone;
    private char tipoUsuario;
    private String email;
    private String senha;
    // public static LinkedList<Usuario> usuarios = new LinkedList<Usuario>();

    public Usuario(int numMatricula, String nome, int cpf, String endereco, int telefone, char tipoUsuario,
            String email, String senha) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipoUsuario = tipoUsuario;
        this.email = email;
        this.senha = senha;
        // usuarios.add(this);
    }

    public static void cadastrarUsuario() {
        Scanner info = new Scanner(System.in);

        int numMatricula, cpf, telefone;
        String email, senha, nome, endereco;
        char tipoUsuario;

        System.out.println(
                "Digite 'a' se o novo usuário for um aluno, 'p' se o novo usuário for um professor e 's' se o novo usuário for uma secretária:");
        tipoUsuario = info.next().charAt(0);

        System.out.println("Informe o número de matrícula do usuário:");
        numMatricula = info.nextInt();

        System.out.println("Informe o nome do usuário:");
        nome = info.nextLine();

        System.out.println("Informe o cpf do usuário:");
        cpf = info.nextInt();

        System.out.println("Informe o endereço do usuário:");
        endereco = info.nextLine();

        System.out.println("Informe o telefone do usuário:");
        telefone = info.nextInt();

        System.out.println("Informe o e-mail do usuário:");
        email = info.nextLine();

        System.out.println("Cadastre a senha do usuário:");
        senha = info.nextLine();

        Secretaria.criarUsuario(numMatricula, nome, cpf, endereco, telefone, tipoUsuario, email, senha);

    }

    public static void excluirUsuario() {
        int temp;
        Scanner info = new Scanner(System.in);


        for (int i = 0; i < Secretaria.usuarios.size(); i++) {
            System.out.println(i + " nome: " + Secretaria.usuarios.get(i).nome);
        }
        System.out.println(": ");
        temp = info.nextInt();
        Secretaria.usuarios.remove(temp);
    }

    public void logar(String email, String senha) {

    }

}
