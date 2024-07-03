package dio.ethan.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numeroAscendente = new ArrayList<>(this.numerosList);
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numeroDescendente = new ArrayList<>(this.numerosList);
        Collections.sort(Collections.reverseOrder());
        return numeroDescendente;
    }

    public void exibirNumeros() {
        System.out.println(this.numerosList);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros  = new OrdenacaoNumeros();

        //adicionando numeros a lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(77);

        //add a lista de numeros
        numeros.exibirNumeros();

       //ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        //exibindo a lista
        numeros.exibirNumeros();

        //ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // exibindo a lista
        numeros.exibirNumeros();
    }
}

