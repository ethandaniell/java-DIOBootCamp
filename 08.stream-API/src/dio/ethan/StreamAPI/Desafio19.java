package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;

//Encontre a soma dos números divisíveis por 3 e 5: 3, 6, 9, 5, 10 = 33
public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer divisiveis = numeros.stream()
        .filter(n -> n % 3 == 0 && n % 5 == 0)
        .reduce(0, Integer::sum);

        System.out.println(divisiveis);
    }
}
