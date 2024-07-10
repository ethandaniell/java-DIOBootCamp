package dio.web.api.handler;

public class BussinesException extends RuntimeException {
    
    public BussinesException(String mensagem) {
        super(mensagem);
    }
    
    public BussinesException(String mensagem, Object ... params) {
        super(String.format(mensagem, params));
    }
}
