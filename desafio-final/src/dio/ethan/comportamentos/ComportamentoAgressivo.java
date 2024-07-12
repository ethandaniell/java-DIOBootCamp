package dio.ethan.comportamentos;

import dio.ethan.interfaces.Comportamento;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void reagir() {
        System.out.println("Movendo-se agressivamente...");
    }
}