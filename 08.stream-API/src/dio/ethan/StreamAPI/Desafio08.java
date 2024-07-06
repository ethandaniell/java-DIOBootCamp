package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;

//Somar os dígitos de todos os números da lista:
public class Desafio08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros.stream()
        .reduce(0, (Integer::sum));

        System.out.println(resultado);
    }
}
