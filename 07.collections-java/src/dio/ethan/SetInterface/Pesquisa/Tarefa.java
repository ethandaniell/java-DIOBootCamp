package dio.ethan.SetInterface.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao, boolean concluido) {
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean isConcluido() {
        return this.concluido;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return "Tarefa: " +
            " descricao = '" + getDescricao() + "'" +
            ", concluido = '" + isConcluido() + "'";
    }


}
