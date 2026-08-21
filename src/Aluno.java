public class Aluno extends Usuario {
    private String nome;
    private int cpf;
    private String email;
    private String curso;
    private int turma;

    public Aluno(String nome, int cpf, String email, String curso, int turma) {
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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

    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Curso: " + getCurso());
        System.out.println("Turma: " + getTurma());
    }
}
