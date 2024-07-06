package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;

//Agrupe os números em pares e ímpares:
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> par = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> impar = numeros.stream().filter(n -> n % 2 != 0).toList();

        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);
    }
}
