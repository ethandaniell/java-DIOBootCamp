public class Convidado {
    //atributos
    private String nome;
    private int codigo;

    //contrutor
    public Convidado(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    //comparar
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Convidado convidado)) return false;
        return getCodigo() == convidado.getCodigo();
    }

    @Override
    public String toString() {
        return "Convidado: " +
            " nome = '" + getNome() + "'" +
            ", codigo = '" + getCodigo() + "'";
    }

}
