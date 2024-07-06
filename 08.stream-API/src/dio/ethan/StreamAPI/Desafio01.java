package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;

//Mostre a lista na ordem numérica:
public class Desafio01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
        .sorted()
        .forEach(System.out::println);
    }
}
