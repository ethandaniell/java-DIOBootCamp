package dio.ethan.gof.singleton;

public class SingletonLazyHolder {
    
    private static class InstanciHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanciHolder.instancia;
    }
}
