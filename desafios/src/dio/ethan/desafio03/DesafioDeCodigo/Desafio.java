package dio.ethan.desafio03.DesafioDeCodigo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome do titular: ");
        String titular = scanner.next();

        System.out.println("Número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Taxa de juros: ");
        double taxaJuros = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

        System.out.println("Conta Poupanca:");
        contaPoupanca.exibirInformacoes();
        
        scanner.close();
    }
}

class ContaBancaria {
    protected int numero;
    protected String titular;
    protected double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
    }
}

class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros)+"%");
    }
}
