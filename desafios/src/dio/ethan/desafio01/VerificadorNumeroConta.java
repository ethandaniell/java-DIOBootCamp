package dio.ethan.desafio01;

import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {

            String numero = scanner.next();

            //Chama o método verificarNumeroConta, passando o número da conta como argumento
            verificarNumeroConta(numero);
            
            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {

        //verifica se o número tem 8 digitos
        int contadorDeNumero = numeroConta.length();
        int numeroDigitado = 0;
        for(int i = 0; i < contadorDeNumero; i++) {
            numeroDigitado++;
        }

        if (numeroDigitado != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
