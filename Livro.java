
public class Livro {
    private String titulo;
    private String autor;
    private StatusLivro status;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = StatusLivro.DISPONIVEL;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public StatusLivro getStatus() {
        return status;
    }

    public void setStatus(StatusLivro status) {
        this.status = status;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Status: " + status);
    }
}
