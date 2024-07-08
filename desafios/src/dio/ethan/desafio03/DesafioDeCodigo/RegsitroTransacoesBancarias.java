package dio.ethan.desafio03.DesafioDeCodigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegsitroTransacoesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble(); // Lê a Entrada que informa o saldo inicial da conta

        System.out.println("Digite a quantidade de transações que deseja fazer: ");
        int quantidadeTransacoes = scanner.nextInt(); // Lê a Entrada com a quantidade total de transações
        
        
        List<String> transacoes = new ArrayList<>(); // Lista para armazenar as transações

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            System.out.println("Digite 'D' para depósito ou 'S' para saque: ");
            char tipoTransacao = scanner.next().toUpperCase().charAt(0); //Lê a Entrada com o tipo de transação (D para depósito ou S para saque). O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula

            System.out.println("Digite o valor da transação: ");
            double valorTransacao = scanner.nextDouble(); //Lê a Entrada com o valor da transação

            // Atualiza o saldo da conta e adicionar a transação à lista
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add(i + ". Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add(i + ". Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        //Exibir o saldo final e a lista de transações conforme a tabela de Exemplos.
        System.out.println("Saldo: " + saldo);
        System.out.println("Transacoes: ");
        transacoes.stream()
        .toList()
        .forEach(System.out::println);

        scanner.close(); //Fechar o scanner para evitar vazamentos de recursos
    }
}