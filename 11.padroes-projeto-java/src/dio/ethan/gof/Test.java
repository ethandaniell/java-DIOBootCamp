package dio.ethan.gof;

import dio.ethan.gof.facade.Facade;
import dio.ethan.gof.singleton.SingletonEager;
import dio.ethan.gof.singleton.SingletonLazy;
import dio.ethan.gof.singleton.SingletonLazyHolder;
import dio.ethan.gof.strategy.Comportamento;
import dio.ethan.gof.strategy.ComportamentoAgressivo;
import dio.ethan.gof.strategy.ComportamentoDefensivo;
import dio.ethan.gof.strategy.ComportamentoNormal;
import dio.ethan.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Daniel", "14801788");
    }
}
