package dio.ethan.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        agendaContatoMap.remove(nome);
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        return agendaContatoMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Marcia", 77777777);
        agendaContatos.adicionarContato("Pedro", 75757575);
        agendaContatos.adicionarContato("Jose", 67676767);
        agendaContatos.adicionarContato("Lua", 77777877);

        agendaContatos.removerContato("Jose");

        agendaContatos.exibirContatos();

        String nomePesquisa = "Lua";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("Lua");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);
    }
}
