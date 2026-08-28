public class Aluno extends Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String curso;
    private int turma;

    public Aluno(String nome, String cpf, String email, String curso, int turma) {
        super(nome,cpf,email);
        this.curso = curso;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    @Override
    public void listarInformacoes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Curso: " + getCurso());
        System.out.println("Turma: " + getTurma());
    }
}
