import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void exibir(){

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Cadastrar usuário");
            System.out.println("4 - Listar usuários");
            System.out.println("5 - Realizar empréstimo");
            System.out.println("6 - Devolver livro");
            System.out.println("7 - Sair");

            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Opção 1 - Cadastrar livro");
                    break;

                case 2:
                    System.out.println("Opção 2 - Listar livros");
                    break;

                case 3:
                    Scanner scanner1 = new Scanner(System.in);

                    System.out.println("Deseja adicionar Funcionário ou Aluno?");
                    String opcao = scanner1.nextLine();

                    System.out.println("Nome: ");
                    String nome = scanner1.nextLine();

                    System.out.println("CPF: ");
                    String cpf = scanner1.nextLine();

                    System.out.println("Email: ");
                    String email = scanner1.nextLine();

                    if(opcao.equalsIgnoreCase("funcionário")){
                        System.out.println("Cargo: ");
                        String cargo = scanner1.nextLine();
                        Usuario usuario = new Funcionario(nome, cpf, email, cargo);
                        BaseDados.addUser(usuario);
                    }

                    if(opcao.equalsIgnoreCase("aluno")){
                        System.out.println("Curso: ");
                        String curso = scanner1.nextLine();

                        System.out.println("Turma: ");
                        String turma = scanner1.nextLine();

                        Usuario usuario = new Aluno(nome, cpf, email, curso, turma);
                        BaseDados.addUser(usuario);
                    }
                break;

                case 4:
                    System.out.println("Opção 4 - Listar usuários");
                    break;

                case 5:
                    System.out.println("Opção 5 - Realizar empréstimo");
                    break;

                case 6:
                    System.out.println("Opção 6 - Devolver livro");
                    break;

                case 7:
                    System.out.println("Opção 7 - Sair");
                    break;

                default:
                    System.out.println("Digite um número de 1 a 7");
            }
            scanner.close();
        } while(opcao !=7);
        }
}