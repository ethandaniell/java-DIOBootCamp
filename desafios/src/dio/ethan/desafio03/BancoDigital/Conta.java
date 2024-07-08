package dio.ethan.desafio03.BancoDigital;

import java.util.Scanner;

public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
       System.out.println("Para programar a transferência para amanhã digite 0, para transferir imediatamente digite 1: ");
       Scanner teclado = new Scanner(System.in);
        int tipoConta = teclado.nextInt();

        if(saldo <= valor) {
            System.out.println("Não possui saldo suficiente para completar esta ação");
        } else if(tipoConta == 0) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("A transferência de " + valor + " irá acontecer em até 1 dia útil");
        } else if(tipoConta == 1) {
            sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("A transferência de " + valor + " irá acontecer em instantes");
        }

        teclado.close();
    }   

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
