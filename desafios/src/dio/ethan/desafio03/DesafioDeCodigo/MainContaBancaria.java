package dio.ethan.desafio03.DesafioDeCodigo;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        System.out.println("Valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        System.out.println("Valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        if(valor > saldo) {
            System.out.println("Saldo insuficiente. Saque não realizado");
        } else {
            saldo -= valor;
            System.out.println("Saque feito.");
            imprimirSaldo();
        }
    }
    
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }
}
