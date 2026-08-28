import java.util.Scanner;

public class Menu {

    public static void exibir() {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Cadastrar usuário");
            System.out.println("4 - Listar usuários");
            System.out.println("5 - Realizar empréstimo");
            System.out.println("6 - Devolver livro");
            System.out.println("7 - Sair");

            System.out.print("Digite uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {

                    case 1:

                        System.out.println("\n==== CADASTRAR LIVRO ====");

                        System.out.print("Título: ");
                        String titulo = scanner.nextLine();

                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();

                        System.out.print("Ano de publicação: ");
                        int ano = scanner.nextInt();
                        scanner.nextLine();

                        Livro livro = new Livro(titulo, autor, ano);

                        BaseDados.addLivro(livro);

                        System.out.println("Livro cadastrado com sucesso!");

                        break;


                    case 2:

                        System.out.println("\n==== LIVROS ====");

                        for (Livro livro1 : BaseDados.getLivros()) {
                            livro1.listarInformacoes();
                            System.out.println("----------------------");
                        }

                        break;


                    case 3:

                        System.out.println("\nDeseja adicionar Funcionário ou Aluno?");
                        String tipo = scanner.nextLine();

                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();

                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();

                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        if (tipo.equalsIgnoreCase("funcionário")
                                || tipo.equalsIgnoreCase("funcionario")) {

                            System.out.print("Cargo: ");
                            String cargo = scanner.nextLine();

                            Usuario usuario = new Funcionario(
                                    nome, cpf, email, cargo
                            );

                            BaseDados.addUser(usuario);

                            System.out.println("Funcionário cadastrado!");

                        } else if (tipo.equalsIgnoreCase("aluno")) {

                            System.out.print("Curso: ");
                            String curso = scanner.nextLine();

                            System.out.print("Turma: ");
                            String turma = scanner.nextLine();

                            Usuario usuario = new Aluno(
                                    nome, cpf, email, curso, turma
                            );

                            BaseDados.addUser(usuario);

                            System.out.println("Aluno cadastrado!");

                        } else {

                            System.out.println("Tipo de usuário inválido!");
                        }

                        break;


                    case 4:

                        System.out.println("\n==== USUÁRIOS ====");

                        for (Usuario usuario : BaseDados.getUsuarios()) {
                            usuario.listarInformacoes();
                            System.out.println("----------------------");
                        }

                        break;


                    case 5:

                        System.out.println("\n==== REALIZAR EMPRÉSTIMO ====");

                        for (int i = 0; i < BaseDados.getLivros().size(); i++) {

                            Livro livroEmprestimo = BaseDados.getLivros().get(i);

                            System.out.println(
                                    (i + 1) + " - " +
                                    livroEmprestimo.getTitulo() +
                                    " - " +
                                    (livroEmprestimo.isDisponivel()
                                            ? "Disponível"
                                            : "Emprestado")
                            );
                        }

                        System.out.print("Digite o número do livro: ");
                        int numeroLivro = scanner.nextInt();
                        scanner.nextLine();

                        if (numeroLivro < 1 ||
                                numeroLivro > BaseDados.getLivros().size()) {

                            System.out.println("Livro inválido!");

                        } else {

                            Livro livroEmprestimo =
                                    BaseDados.getLivros().get(numeroLivro - 1);

                            if (livroEmprestimo.isDisponivel()) {

                                livroEmprestimo.emprestar();

                                System.out.println(
                                        "Empréstimo realizado com sucesso!"
                                );

                            } else {

                                System.out.println(
                                        "Esse livro já está emprestado!"
                                );
                            }
                        }

                        break;


                    case 6:

                        System.out.println("\n==== DEVOLVER LIVRO ====");

                        for (int i = 0; i < BaseDados.getLivros().size(); i++) {

                            Livro livroDevolver = BaseDados.getLivros().get(i);

                            System.out.println(
                                    (i + 1) + " - " +
                                    livroDevolver.getTitulo() +
                                    " - " +
                                    (livroDevolver.isDisponivel()
                                            ? "Disponível"
                                            : "Emprestado")
                            );
                        }

                        System.out.print("Digite o número do livro: ");
                        int numeroDevolver = scanner.nextInt();
                        scanner.nextLine();

                        if (numeroDevolver < 1 ||
                                numeroDevolver > BaseDados.getLivros().size()) {

                            System.out.println("Livro inválido!");

                        } else {

                            Livro livroDevolver =
                                    BaseDados.getLivros().get(numeroDevolver - 1);

                            if (!livroDevolver.isDisponivel()) {

                                livroDevolver.devolver();

                                System.out.println(
                                        "Livro devolvido com sucesso!"
                                );

                            } else {

                                System.out.println(
                                        "Esse livro já está disponível!"
                                );
                            }
                        }

                        break;


                    case 7:

                        System.out.println("Saindo do sistema...");

                        break;


                    default:

                        System.out.println("Digite um número de 1 a 7!");
                }

            } catch (Exception e) {

                System.out.println("Digite apenas números!");

                scanner.nextLine();

                opcao = 0;
            }

        } while (opcao != 7);

        scanner.close();
    }
}
