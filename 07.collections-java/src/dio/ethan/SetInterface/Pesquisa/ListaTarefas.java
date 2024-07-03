package dio.ethan.SetInterface.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for(Tarefa t : tarefasSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }
        tarefasSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefasSet) {
            if(t.isConcluido()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefasSet) {
            if(!t.isConcluido()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for(Tarefa t : tarefasSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaMarcarPendente = null;
        for(Tarefa t : tarefasSet) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaMarcarPendente = t;
                break;
            }
        }

        if(tarefaMarcarPendente != null) {
            if(tarefaMarcarPendente.isConcluido()) {
                tarefaMarcarPendente.setConcluido(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Fazer exercicio");
        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();

        listaTarefas.obterTarefasConcluidas();

        listaTarefas.obterTarefasPendentes();

        listaTarefas.marcarTarefaConcluida("Ler livro");

        listaTarefas.marcarTarefaPendente("Estudar Java");

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
