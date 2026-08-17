import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int anodepublicacao;
    private int disponibiliodade;

    public Livro(String autor, String titulo, int anodepublicacao, int disponibiliodade) {
        this.autor = autor;
        this.titulo = titulo;
        this.anodepublicacao = anodepublicacao;
        this.disponibiliodade = disponibiliodade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnodepublicacao() {
        return anodepublicacao;
    }

    public void setAnodepublicacao(int anodepublicacao) {
        this.anodepublicacao = anodepublicacao;
    }

    public int getDisponibiliodade() {
        return disponibiliodade;
    }

    public void setDisponibiliodade(int disponibiliodade) {
        this.disponibiliodade = disponibiliodade;
    }
}
