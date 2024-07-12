package dio.ethan.robo;

import dio.ethan.interfaces.Comportamento;
import dio.ethan.interfaces.Direcao;

public class Robo {
    private Comportamento comportamento;
    private Direcao direcao;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public void reagir() {
        comportamento.reagir();
    }

    public void mover() {
        direcao.mover();
    }
}
