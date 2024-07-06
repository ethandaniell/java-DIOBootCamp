package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;

//Verifique se todos os números da lista são iguais:
public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
        .allMatch(n -> n.equals(numeros.get(0)));

        System.out.println("São todos iguais? " + todosIguais);
    }
}
