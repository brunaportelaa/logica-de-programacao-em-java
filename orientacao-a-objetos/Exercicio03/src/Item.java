public class Item {
    String descricao;
    int codigo;
    double preco;
    int tipo;

    public String getTipo(int tipo) {
        if (tipo == 1) {
            return "TECNOLOGIA";
        } else {
            return "OUTROS";
        }
    }

    public String toString() {
        return  "Descrição: " + this.descricao +
                "\nCódigo: " + this.codigo +
                "\nPreço: " + this.preco +
                "\nTipo: " + this.tipo + "\n";
    }
}
