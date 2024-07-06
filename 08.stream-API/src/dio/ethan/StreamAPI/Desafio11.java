package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Encontre a soma dos quadrados de todos os números da lista:
public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Function<Integer, Double> dobrar = n -> Math.pow((double)n, (double)2);
        Function<Double,Integer> toInt = Double::intValue;

        int resultado = numeros.stream()
        .map(dobrar)
        .map(toInt)
        .reduce(0, Integer::sum);

        System.out.println(resultado);
    }
}
