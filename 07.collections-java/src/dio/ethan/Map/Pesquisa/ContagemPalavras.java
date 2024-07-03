package dio.ethan.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavras.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(palavras);
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if(entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
