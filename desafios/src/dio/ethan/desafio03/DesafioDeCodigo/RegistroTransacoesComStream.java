package dio.ethan.desafio03.DesafioDeCodigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite a quantidade de transações que deseja fazer: ");
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            System.out.println("Digite 'D' para depósito ou 'S' para saque: ");
            char tipoTransacao = scanner.next().charAt(0);

            System.out.println("Digite o valor da transação: ");
            double valorTransacao = scanner.nextDouble();

            //Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D' || transacao.getTipo() == 'd') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S'|| transacao.getTipo() == 's') {
                saldo -= valorTransacao;
            }
        }

        System.out.println("\nSaldo: " + saldo);
        System.out.println("Transacoes: ");
        transacoes.stream()
        .filter(transacao -> transacao.getTipo() == 'D' || transacao.getTipo() == 'd' || transacao.getTipo() == 'S' || transacao.getTipo() == 's')
        .map(t -> t.getTipo() + " de " + t.getValor())
        .collect(Collectors.toList())
        .forEach(System.out::println);

        scanner.close(); // Fechar o scanner para evitar vazamentos de recursos
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}