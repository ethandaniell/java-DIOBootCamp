package dio.ethan.SetInterface.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> palavrasUnicasSet;

    //construtor]
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    //metododos
    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(palavrasUnicasSet.contains(palavra)) palavrasUnicasSet.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        //instancia
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        //add
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C#");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        //exibindo
        conjuntoLinguagens.exibirPalavrasUnicas();

        //removendo
        conjuntoLinguagens.removerPalavra("Java");

        //verificar
        conjuntoLinguagens.verificarPalavra("Python");
        conjuntoLinguagens.verificarPalavra("Ruby");
    }
}
