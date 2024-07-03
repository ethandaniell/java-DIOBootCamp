package dio.ethan.list.Pesquisa;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //contrutor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    //metodo get 
    public String geTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro: " +
                    "titulo = `" + titulo + '\'' +
                    ", autor = `" + autor  +
                    ", ano publicacao = `" + anoPublicacao;
    }
}
