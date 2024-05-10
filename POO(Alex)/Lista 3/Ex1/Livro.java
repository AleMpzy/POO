public class Livro {
    private String titulo;
    private String autor;

    public void setTitulo(String t) {
        titulo = t;
    }

    public void setAutor(String a) {
        autor = a;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void imprimir() {
        System.out.println("O autor do livro " + titulo + " eh o " + autor);
    }
}