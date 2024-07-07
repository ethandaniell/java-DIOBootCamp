package dio.ethan.desafio03.BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente daniel = new Cliente();
        daniel.setNome("Daniel");
        
        Conta cc = new ContaCorrente(daniel);
        Conta poupanca = new ContaPoupanca(daniel);

        cc.depositar(1100);
        cc.transferir(500, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirInfoComuns();
    }
}
