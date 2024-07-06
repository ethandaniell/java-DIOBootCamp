package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Encontrar o segundo número maior da lista:
public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .limit(2)
        .skip(1)
        .forEach(System.out::println);;
    }
}
