package dio.ethan;

import java.util.Scanner;
import dio.ethan.robo.Robo;
import dio.ethan.interfaces.Direcao;
import dio.ethan.interfaces.Comportamento;
import dio.ethan.comportamentos.ComportamentoAgressivo;
import dio.ethan.comportamentos.ComportamentoDefensivo;
import dio.ethan.comportamentos.ComportamentoNormal;
import dio.ethan.direcoes.DirecaoDireita;
import dio.ethan.direcoes.DirecaoEsquerda;
import dio.ethan.direcoes.DirecaoFrente;
import dio.ethan.direcoes.DirecaoTras;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
        
        Direcao direcaoDireita = new DirecaoDireita();
        Direcao direcaoEsquerda = new DirecaoEsquerda();
        Direcao direcaoFrente = new DirecaoFrente();
        Direcao direcaoTras = new DirecaoTras();

        System.out.println("Escolha uma direção e receba uma reação do rôbo: [Direita; Esquerda; Frente; Trás.]");
        String escolha = scanner.nextLine().toLowerCase();

        Robo robo = new Robo();

        if(escolha.equals("direita")) {
            robo.setDirecao(direcaoDireita);
            robo.mover();
            robo.setComportamento(agressivo);
            robo.reagir();
        } else if(escolha.equals("esquerda")) {
            robo.setDirecao(direcaoEsquerda);
            robo.mover();
            robo.setComportamento(defensivo);
            robo.reagir();
        } else if(escolha.equals("frente")) {
            robo.setDirecao(direcaoFrente);
            robo.mover();
            robo.setComportamento(normal);
            robo.reagir();
        } else if(escolha.equals("tras")) {
            robo.setDirecao(direcaoTras);
            robo.mover();
            robo.setComportamento(defensivo);
            robo.reagir();
        } else {
            System.out.println("Opção invalida!");
        }
        
        scanner.close();
    }
}
