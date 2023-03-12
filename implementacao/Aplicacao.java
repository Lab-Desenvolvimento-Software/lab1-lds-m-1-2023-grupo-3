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
                System.out.println("Opção 03: Adicionar curso");


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
