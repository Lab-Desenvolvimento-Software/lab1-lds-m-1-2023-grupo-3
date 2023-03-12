import java.util.Scanner;

public class Aplicacao {      
    public static void main(String[] args){
        int entrada;
        Boolean isAtivo = true;
        Scanner ler = new Scanner(System.in);
        while (isAtivo){
            Menu.menu();
            entrada = ler.nextInt();
            switch(entrada){
                case 1:
                System.out.println("Opção 01: Cadastrar usuário\n");
                Usuario.addUsuario();
                break;

                case 2:
                System.out.println("Opção 02: Excluir usuário\n");
                Usuario.excluirUsuario();
                break;

                case 3:
                System.out.println("Opção 03: Adicionar curso\n");


                break;

                case 4:
                System.out.println("Opção 04: Excluir curso\n");


                break;

                case 5:
                System.out.println("Opção 05.:Consultar cursos\n");


                break;

                case 6:
                System.out.println("Opção 06: Adicionar disciplina em um curso\n");


                break;

                case 7:
                System.out.println("Opção 07: Excluir disciplina de um curso\n");

                break;

                case 8:
                System.out.println("Opção 08: Consultar disciplinas de um curso\n");


                break;

                case 9:
                System.out.println("Opção 09: Adicionar professor em uma disciplina\n");

                break;

                case 10:
                System.out.println("Opção 10: Remover professor de uma disciplina\n");


                break;

                case 11:
                System.out.println("Opção 11: Consultar professor(es) de um curso\n");


                break;

                case 12:
                System.out.println("Opção 12: Consultar professor(es) de uma disciplina\n");


                break;

                case 13:
                System.out.println("Opção 13: Matricular aluno em uma disciplina");


                break;

                case 14:
                System.out.println("Opção 14: Remover aluno de uma disciplina\n");


                break;

                case 15:
                System.out.println("Opção 15: Consultar alunos de uma disciplina\n");


                break;

                case 16:
                System.out.println("Opção 16: Consultar alunos de um curso\n");


                break;

                case 17:
                System.out.println("Opção 17: Consultar alunos de uma disciplina\n");


                break;

                case 18:
                System.out.println("Opção 18: Gerar currículo\n");


                break;
                case 19:
                System.out.println("Opção 19: Finalizar Sistema\n");


                break;

                default:
                    System.out.println("Comando inválido");
            }

        }

    
}
}
