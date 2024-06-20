package dio.ethan.desafio01;

import java.util.Scanner;

public class ControleSimplesDeSaque {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saque = 0;

        // Loop for para iterar sobre os saques
        for (double valorSaque = saque; limiteDiario > valorSaque; limiteDiario -= valorSaque) {
            
            //Solicita ao usuário o valor do saque
            saque = scanner.nextDouble();

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                return; // Encerra o loop
            } else if (saque <= limiteDiario) {
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + String.format("%.1f", limiteDiario));
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                return;
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}