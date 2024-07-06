package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;


//Calcule a média dos números maiores que 5:
public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
        .filter(n -> n > 5)
        .reduce(0, (Integer::sum));

        int quantidadeNumeros = (int) numeros.stream()
        .filter(n -> n > 5)
        .count();

        System.out.println(soma / quantidadeNumeros);
    }
}
