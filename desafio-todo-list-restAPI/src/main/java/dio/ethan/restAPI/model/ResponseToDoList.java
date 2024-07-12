package dio.ethan.restAPI.model;

import org.springframework.http.HttpStatus;

public class ResponseToDoList {
    private String mensagem;
    private int code;
    private HttpStatus httpStatus;

    public ResponseToDoList(String mensagem, HttpStatus httpStatus) {
        this.mensagem = mensagem;
        this.code = httpStatus.value();
        this.httpStatus = httpStatus;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public HttpStatus getHttpStatus() {
        return this.httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
    
}
