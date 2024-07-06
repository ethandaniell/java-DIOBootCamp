package dio.ethan.StreamAPI;

import java.util.Arrays;
import java.util.List;

//Verificar se a lista contém algum número maior que 10:
public class Desafio06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorQue10 = numeros.stream()
        .allMatch(n -> n > 10);

        System.out.println(maiorQue10 == false ? "Não existem números maiores que 10" : "Existem números maiores que 10");
    }
}
