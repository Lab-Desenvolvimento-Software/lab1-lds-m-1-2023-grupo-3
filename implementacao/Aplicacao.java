import java.util.Scanner;

public class Aplicacao {
    
    public static void menu(){
        Sistem.out.println("\n\tMenu");
        Sistem.out.println("1. Adicionar usuário");
        Sistem.out.println("2. Excluir usuário");
        Sistem.out.println("3. Adicionar curso");
        Sistem.out.println("4. Excluir curso");
        Sistem.out.println("5. Consultar cursos");
        Sistem.out.println("6. Adicionar disciplina em um curso");
        Sistem.out.println("7. Excluir disciplina de um curso");
        Sistem.out.println("8. Consultar disciplinas de um curso");
        Sistem.out.println("9. Adicionar professor em uma disciplina");
        Sistem.out.println("10. Remover professor de uma disciplina");
        Sistem.out.println("11. Consultar professor(es) de um curso");
        Sistem.out.println("12. Consultar professor(es) de uma disciplina");
        Sistem.out.println("13. Matricular aluno em uma disciplina");
        Sistem.out.println("14. Remover aluno de uma disciplina");
        Sistem.out.println("15. Consultar alunos de uma disciplina");
        Sistem.out.println("16. Consultar alunos de um curso");
        Sistem.out.println("15. Consultar alunos de uma disciplina");
        Sistem.out.println("16. Gerar currículo");
        Sistem.out.println("17. Finalizar sistema");
        Sistem.out.println();
        Sistem.out.println("Digite a opção desejada");


    }

    public static void main(String[] args) throws exception {
        String entrada;
        Boolean isAtivo = true;
        Scanner ler = new Scanner(System.in);
        while (isAtivo){
            menu();
            entrada = ler.nextline();
            switch(Interger.parseInt(entrada))

        }

    }
    
}
