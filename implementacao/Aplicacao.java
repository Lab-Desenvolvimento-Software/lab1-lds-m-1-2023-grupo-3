import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        int entrada, temp;
        Curso cur;
        Boolean isAtivo = true;
        Scanner ler = new Scanner(System.in);

        Curso oCurso = new Curso(123, 100, "curso");
        Disciplina matematica = new Disciplina(1, "matemática", false);
        Disciplina portugues = new Disciplina(2, "português", false);
        Disciplina historia = new Disciplina(3, "história", true);
        oCurso.adicionarDisciplina(matematica);
        oCurso.adicionarDisciplina(portugues);
        oCurso.adicionarDisciplina(historia);
        Professor prof1 = new Professor(100, "Américo", 123321, "rua #1", 12321, 'p', "email.com", "123");
        Professor prof2 = new Professor(100, "Bernardo", 321456, "rua #2", 456878, 'p', "email.com.br", "14523");
        Aluno aluno1 = new Aluno(100, "Alice", 123321, "rua #1", 133546, 'a', "email.com", "123");
        Aluno aluno2 = new Aluno(100, "Brendo", 123321, "rua #5", 786765, 'a', "email.com", "123");
        matematica.adicionarProfessor(prof1);
        matematica.adicionarAluno(aluno1);
        matematica.adicionarAluno(aluno2);

        portugues.adicionarProfessor(prof2);
        portugues.adicionarAluno(aluno1);
        portugues.adicionarAluno(aluno2);

        historia.adicionarProfessor(prof1);
        historia.adicionarProfessor(prof2);
        historia.adicionarAluno(aluno1);
        historia.adicionarAluno(aluno2);

        while (isAtivo) {
            menu();
            entrada = ler.nextInt();
            Scanner info = new Scanner(System.in);
            switch (entrada) {
                case 1:
                    System.out.println("Opção 01: Cadastrar usuário\n");
                    Usuario.cadastrarUsuario();
                    break;

                case 2:
                    System.out.println("Opção 02: Excluir usuário\n");
                    Usuario.excluirUsuario();
                    break;

                case 3:
                    System.out.println("Opção 03: Adicionar curso");
                    Curso.adicionarCurso();
                    break;

                case 4:
                    System.out.println("04: Excluir curso");
                    Curso.excluirCurso();
                    break;

                case 5:
                    System.out.println("05. Consultar cursos");
                    for (int i = 0; i < Curso.cursos.size(); i++) {
                        System.out.println(i + " nome: " + Curso.cursos.get(i).nome);
                    }
                    break;

                case 6:
                    System.out.println("06. Adicionar disciplina em um curso");
                    System.out.println("Decida em qual curso adicionar a disciplina: ");
                    for (int i = 0; i < Curso.cursos.size(); i++) {
                        System.out.println(i + " nome: " + Curso.cursos.get(i).nome);
                    }
                    temp = info.nextInt();
                    cur = Curso.cursos.get(temp);
                    System.out.println("Escolha a disciplina: ");
                    for (int i = 0; i < Disciplina.disciplinas.size(); i++) {
                        System.out.println(i + " nome: " + Disciplina.disciplinas.get(i));
                    }
                    temp = info.nextInt();
                    cur.adicionarDisciplina(Disciplina.disciplinas.get(temp));
                    break;

                case 7:
                    System.out.println("07. Excluir disciplina de um curso");
                    System.out.println("Decida em qual curso excluir a disciplina: ");
                    for (int i = 0; i < Curso.cursos.size(); i++) {
                        System.out.println(i + " nome: " + Curso.cursos.get(i).nome);
                    }
                    temp = info.nextInt();
                    cur = Curso.cursos.get(temp);
                    System.out.println("Escolha a disciplina: ");
                    for (int i = 0; i < Disciplina.disciplinas.size(); i++) {
                        System.out.println(i + " nome: " + Disciplina.disciplinas.get(i));
                    }
                    temp = info.nextInt();
                    Disciplina.disciplinas.remove(temp);
                    break;

                case 8:
                    System.out.println("08. Consultar disciplinas de um curso");
                    for (int i = 0; i < Curso.cursos.size(); i++) {
                        System.out.println(i + " nome: " + Curso.cursos.get(i).nome);
                    }
                    break;

                case 9:
                    System.out.println("09. Adicionar professor em uma disciplina");
                    // System.out.println("Escolha a disciplina: ");
                    // for(int i=0; i<Disciplina.disciplinas.size(); i++){
                    // System.out.println(i + " nome: " + Disciplina.disciplinas.get(i));
                    // }
                    // temp = info.nextInt();

                    // System.out.println("Escolha o professor: ");
                    // for(int i=0; i<Disciplina.disciplinas.size(); i++){
                    // System.out.println(i + " nome: " + Disciplina.disciplinas.get(i));
                    // }
                    // temp = info.nextInt();
                    // cur.adicionarDisciplina(Disciplina.disciplinas.get(temp));
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

                case 18:

                    break;

                case 19:

                    break;

                default:
                    System.out.println("Comando inválido");
            }

        }
    }

    public static void menu() {
        System.out.println("\n\tMenu");
        System.out.println("01. Cadastrar usuário");
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
        System.out.println("17. Consultar alunos de uma disciplina");
        System.out.println("18. Gerar currículo");
        System.out.println("19. Finalizar Sistema");
        System.out.println();
        System.out.println("Digite a opção desejada:");
    }

}
