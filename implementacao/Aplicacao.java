import java.util.Scanner;

public class Aplicacao {
    
    public static void menu(){
        System.out.println("\n\tMenu");
        System.out.println("01. Adicionar usuário");
        System.out.println("02. Excluir usuário");
        System.out.println("03. Adicionar curso");
        System.out.println("04. Excluir curso");
        System.out.println("05. Consultar cursos");
        System.out.println("06. Adicionar disciplina em um curso");
        System.out.println("07. Excluir disciplina de um curso");
        System.out.println("08. Consultar disciplinas de um curso");
        System.out.println("09. Adicionar professor em uma disciplina");
        System.out.println("10. Remover professor de uma disciplina");
        System.out.println("11. Consultar professor(es) de um curso");
        System.out.println("12. Consultar professor(es) de uma disciplina");
        System.out.println("13. Matricular aluno em uma disciplina");
        System.out.println("14. Remover aluno de uma disciplina");
        System.out.println("15. Consultar alunos de uma disciplina");
        System.out.println("16. Consultar alunos de um curso");
        System.out.println("15. Consultar alunos de uma disciplina");
        System.out.println("16. Gerar currículo");
        System.out.println("17. Finalizar Systema");
        System.out.println();
        System.out.println("Digite a opção desejada:");


    }

    public static void main(String[] args){
        int entrada;
        Boolean isAtivo = true;
        Scanner ler = new Scanner(System.in);
        while (isAtivo){
            menu();
            entrada = ler.nextInt();
            switch(entrada){
                case 1:

                break;

                case 2:

                break;

                case 3:

                break;

                case 4:

                break;

                case 5:

                break;

                case 6:

                break;

                case 7:

                break;

                case 8:

                break;

                case 9:

                break;

                case 10:

                break;

                case 11:

                break;

                case 12:

                break;

                case 13:

                break;

                case 14:

                break;

                case 15:

                break;

                case 16:

                break;

                case 17:

                break;

                default:
                    System.out.println("Comando inválido");
            }

        }

    
}
}
