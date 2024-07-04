package dio.ethan.Map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livros.put(link, livro);
    }

    //ainda nao entendi direito
    public void removerLivro(String titulo) {
        List<String> livrosParaRemover = new ArrayList<>();
        for(Map.Entry<String, Livro> entry : livros.entrySet()) {
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                livrosParaRemover.add(entry.getKey());
            }
        }
        for(String chave : livrosParaRemover) {
            livros.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosOrdenarPorPreco = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : livrosOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> entry : livros.entrySet()) {
            Livro livro = entry.getValue();
            if(livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livroMaisCaro = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        for(Livro livro : livros.values()) {
            if(livro.getPreco() > precoMaisAlto) {
                precoMaisAlto = livro.getPreco();
            }
        }
        for(Map.Entry<String, Livro> entry : livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
                livroMaisCaro.add(livroComPrecoMaisAlto);
            }
        }
        return livroMaisCaro;
    }

    public List<Livro> obterLivroMaisBarato() {
        List<Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        for (Livro livro : livros.values()) {
            if (livro.getPreco() < precoMaisBaixo) {
                precoMaisBaixo = livro.getPreco();
            }
        }

        for(Map.Entry<String, Livro> entry: livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());

        livrariaOnline.pesquisarLivrosPorAutor("Agatha Christie");

        System.out.println(livrariaOnline.obterLivroMaisCaro());

        System.out.println(livrariaOnline.obterLivroMaisBarato());

        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livros);
    }
}
