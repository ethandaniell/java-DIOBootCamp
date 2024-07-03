package dio.ethan.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
   //atributo com generics
   private List<Tarefa> tarefaList;

   //construtor
   public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
   }

   //metodos
   public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
   }

   public void removerTarefa(String descricao) {
        //analisa se tem descrições repetidas
        List <Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
   }

   public int obterNumeroTotalTarefas() {
        return tarefaList.size();
   }

   public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
   }

   public static void main(String[] args) {
        //uma instancia da classe lista tarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        //adicionando tarefas a lista
        listaTarefa.adicionarTarefa("Comprar leite");
        listaTarefa.adicionarTarefa("Estudar para a prova");
        listaTarefa.adicionarTarefa("Fazer ativiadades");
        listaTarefa.adicionarTarefa("Trabalhar");
        
        //exibindo o numero total de tarefas
        System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + "tarefas na lista");

        //exibindo as descriçoes das tarefas
        listaTarefa.obterDescricoesTarefas();

        //removendo uma tarefa da lista
        listaTarefa.removerTarefa("Trabalhar");
   }
}
