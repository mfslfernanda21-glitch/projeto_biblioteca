import java.util.ArrayList;

public class BaseDados {

    private static ArrayList<Usuario> usuarios;
    private static ArrayList<Livro> livros;

    public static void createUsers() {

        usuarios = new ArrayList<>();

        Funcionario funcionario = new Funcionario(
                "Francisco",
                "053.126.345-55",
                "francisconunes@gmail.com",
                "Motorista"
        );

        Funcionario funcionario1 = new Funcionario(
                "Maria",
                "043.134.543-77",
                "mariajose@gmail.com",
                "Limpeza"
        );

        Funcionario funcionario2 = new Funcionario(
                "Alisson",
                "231.126.321-88",
                "alissonrochavidal@gmail.com",
                "Professor"
        );

        addUser(funcionario);
        addUser(funcionario1);
        addUser(funcionario2);


        Aluno aluno = new Aluno(
                "Barnabé",
                "846.032.237-37",
                "barnabe@gmail.com",
                "DS",
                "1º ano"
        );

        Aluno aluno2 = new Aluno(
                "Virginia",
                "567.987.324-44",
                "virginiawepink@hotmail.com",
                "maquiagem",
                "2º ano"
        );

        Aluno aluno3 = new Aluno(
                "Expedito",
                "884.430.238-22",
                "expeditojose@outlook.com",
                "técnico em enfermagem",
                "3º ano"
        );

        addUser(aluno);
        addUser(aluno2);
        addUser(aluno3);
    }


    public static void createLivros() {

        livros = new ArrayList<>();

        Livro livro1 = new Livro(
                "Dom Casmurro",
                "Machado de Assis",
                1899
        );

        Livro livro2 = new Livro(
                "O Cortiço",
                "Aluísio Azevedo",
                1890
        );

        Livro livro3 = new Livro(
                "Grande Sertão: Veredas",
                "Guimarães Rosa",
                1956
        );

        Livro livro4 = new Livro(
                "A Hora da Estrela",
                "Clarice Lispector",
                1977
        );

        Livro livro5 = new Livro(
                "Vidas Secas",
                "Graciliano Ramos",
                1938
        );

        Livro livro6 = new Livro(
                "Capitães da Areia",
                "Jorge Amado",
                1937
        );

        Livro livro7 = new Livro(
                "Memórias Póstumas de Brás Cubas",
                "Machado de Assis",
                1881
        );

        Livro livro8 = new Livro(
                "Iracema",
                "José de Alencar",
                1865
        );

        Livro livro9 = new Livro(
                "O Alienista",
                "Machado de Assis",
                1882
        );

        Livro livro10 = new Livro(
                "Macunaíma",
                "Mário de Andrade",
                1928
        );


        addLivro(livro1);
        addLivro(livro2);
        addLivro(livro3);
        addLivro(livro4);
        addLivro(livro5);
        addLivro(livro6);
        addLivro(livro7);
        addLivro(livro8);
        addLivro(livro9);
        addLivro(livro10);
    }


    public static void addLivro(Livro livro) {
        livros.add(livro);
    }


    public static void addUser(Usuario usuario) {
        usuarios.add(usuario);
    }


    public static ArrayList<Livro> getLivros() {
        return livros;
    }


    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
