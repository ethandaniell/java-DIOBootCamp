package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Filtrar os números que estão dentro de um intervalo (por exemplo, entre 7 e 10) :
public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> entre = n -> n >= 7 && n <= 10;

        List<Integer> intervalo = numeros.stream()
        .filter(entre)
        .toList();

        System.out.println(intervalo);
    }
}
