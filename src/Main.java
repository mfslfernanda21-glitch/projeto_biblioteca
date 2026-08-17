import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("==== MENU ====");
            System.out.println("1- Cadastrar usuário");
            System.out.println("2- Listar livros");
            System.out.println("3- Cadastrar usuários");
            System.out.println("4- Listar usuários");
            System.out.println("5- Realizar empréstimos");
            System.out.println("6- Devolver livro");
            System.out.println("7- Sair");

            System.out.println("Digite uma opção: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("opção 1");
                    continue;
                case 2:
                    System.out.println("opção 2");
                    continue;
                case 3:
                    System.out.println("opção 3");

                case 4:
                    System.out.println("opção 4");
                    continue;
                case 5:
                    System.out.println("opção 5");
                    continue;
                case 6:
                    System.out.println("opção 6");
                case 7:
                    System.out.println("opção 7");

                default:
                    System.out.println("Digite um número de 1 a 7");
            }
        }while(opcao!=7);
    }
}