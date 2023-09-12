import java.util.HashMap;
import java.util.Map;

class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}

class Biblioteca {
    private Map<String, Livro> acervo = new HashMap<>();

    public void adicionarLivro(Livro livro) {
        acervo.put(livro.getTitulo(), livro);
    }

    public boolean reservarLivro(String titulo) {
        Livro livro = acervo.get(titulo);
        if (livro != null && livro.isDisponivel()) {
            livro.reservar();
            return true;
        }
        return false;
    }

    public void devolverLivro(String titulo) {
        Livro livro = acervo.get(titulo);
        if (livro != null) {
            livro.devolver();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Reserva de livro1: " + biblioteca.reservarLivro("O Senhor dos Anéis"));
        System.out.println("Reserva de livro2: " + biblioteca.reservarLivro("Harry Potter e a Pedra Filosofal"));

        System.out.println("Devolução de livro1");
        biblioteca.devolverLivro("O Senhor dos Anéis");
        System.out.println("Reserva de livro1 após devolução: " + biblioteca.reservarLivro("O Senhor dos Anéis"));
    }
}
