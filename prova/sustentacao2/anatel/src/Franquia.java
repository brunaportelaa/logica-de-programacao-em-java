public class Franquia {
    String nome;
    String codigo;
    int quantidadeGB;

    public Franquia(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Franquia{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", quantidadeGB=" + quantidadeGB +
                '}';
    }
}
