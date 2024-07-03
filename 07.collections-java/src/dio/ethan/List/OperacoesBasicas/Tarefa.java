package dio.ethan.list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    //construtor que cria um objeto do tipo tarefa
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //metodo get
    public String getDescricao() {
        return descricao;
    }

    //pra poder chamar o metodo tarefa e aparecer as descriçoes
    @Override
    public String toString() {
        return descricao;
    }
}
