package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Filtrar os números primos da lista:
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> ePrimo = n -> {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) return false;
            }
            return true;
        };

        List<Integer> primos = numeros.stream()
        .filter(ePrimo)
        .distinct()
        .toList();

        System.out.println(primos);
    }
}
