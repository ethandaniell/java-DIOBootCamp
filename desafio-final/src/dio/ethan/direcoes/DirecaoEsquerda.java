package dio.ethan.direcoes;

import dio.ethan.interfaces.Direcao;

public class DirecaoEsquerda implements Direcao {
    @Override
    public void mover() {
        System.out.println("Movendo-se para a esquerda...");
    }
}
