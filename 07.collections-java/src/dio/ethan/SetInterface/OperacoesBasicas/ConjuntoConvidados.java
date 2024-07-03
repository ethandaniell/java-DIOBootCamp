import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadosSet;

    //contrutor
    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    //metodos
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet) {
            if(c.getCodigo() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        //criando uma instancia
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //exibindo o numero de convidados
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "convidado(s) dentro de Set de Convidados");

        //add convidados
        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1254);
        conjuntoConvidados.adicionarConvidado("Charlie", 1234);
        conjuntoConvidados.adicionarConvidado("David", 2312);

        //exibindo convidados
        System.out.println("convidados no conjunto: ");
        conjuntoConvidados.exibirConvidados();

        //removendo
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

    }
}