package dio.ethan.desafio01;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   double saldoAtual = scanner.nextDouble(); //solicita o saldo atual
                   saldo += saldoAtual;
                   System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSacado = scanner.nextDouble();
                    if(saldo >= valorSacado) {
                        saldo -= valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
