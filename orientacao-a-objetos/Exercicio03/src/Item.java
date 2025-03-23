public class Item {
    String descricao;
    int codigo;
    double preco;
    String tipo;

    public void setTipo(int tipo) {
        if (tipo == 1) {
            this.tipo = "TECNOLOGIA";
        } else {
            this.tipo = "OUTROS";
        }
    }

    public String toString() {
        return  "\nDescrição: " + this.descricao +
                "\nCódigo: " + this.codigo +
                "\nPreço: " + this.preco +
                "\nTipo: " + this.tipo;
    }
}
